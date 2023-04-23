package com.hb.spring.data.jpa.tutorial.repository;

import com.hb.spring.data.jpa.tutorial.entity.Course;
import com.hb.spring.data.jpa.tutorial.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest
{
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;


    @Test
    public void saveCourseMaterial()
    {
        Course course = Course.builder()
                        .title("Aerospace")
                        .credit(25)
                        .build();


        CourseMaterial courseMaterial = CourseMaterial.builder()
                                        .url("www.aerospaceengineering.com")
                                        .course(course)
                                        .build();


        courseMaterialRepository.save(courseMaterial);
    }


    @Test
    public void printAllCourseMaterials()
    {
        List<CourseMaterial> courseMaterials = courseMaterialRepository.findAll();

        System.out.println("courseMaterials = " + courseMaterials);
    }


}