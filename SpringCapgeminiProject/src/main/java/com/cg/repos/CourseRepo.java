package com.cg.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entities.Course;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
