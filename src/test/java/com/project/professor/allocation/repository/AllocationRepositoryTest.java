package com.project.professor.allocation.repository;

import com.project.professor.allocation.ProfessorAllocationJardesonApplication;
import com.project.professor.allocation.entity.Allocation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.List;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class AllocationRepositoryTest {

    SimpleDateFormat sdf = new SimpleDateFormat("HH:mmZ");

    @Autowired
    AllocationRepository allocationRepository;

    @Test
    public void findAll() {
        // Act
     

        // Print
        
    }

    @Test
    public void findById() {
        // Arrange
        

        // Act
        

        // Print
        
    }

    @Test
    public void findByProfessorId() {
        // Arrange
        

        // Act
        

        // Print
        
    }

    @Test
    public void findByCourseId() {
        // Arrange
        

        // Act
        

        // Print
        
    }

    @Test
    public void save_create() throws ParseException {
        // Arrange
    
    			Allocation allocation = new Allocation();
    			allocation.setDay(DayOfWeek.MONDAY);
    			allocation.setCourseId(1L);
    			allocation.setProfessorId(1L);
    			allocation.setStart(sdf.parse("10:00-0300"));
    			allocation.setEnd(sdf.parse("13:00-0300"));

    			// Act
    			Allocation alloc = allocationRepository.save(allocation);

    			// Print
    			System.out.println(alloc);


        
    }

    @Test
    public void save_update() throws ParseException {
        // Arrange
        

        // Act
        

        // Print
        
    }

    @Test
    public void deleteById() {
        // Arrange
        

        // Act
        
    }

    @Test
    public void deleteAll() {
        // Act
        
    }
}
