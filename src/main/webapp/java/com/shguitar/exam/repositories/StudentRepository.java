package com.shguitar.exam.repositories;

import com.shguitar.exam.models.Student;

public interface StudentRepository {
    Student getStudent(String name, String mobile);
}
