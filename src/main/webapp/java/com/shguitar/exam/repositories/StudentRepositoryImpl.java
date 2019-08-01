package com.shguitar.exam.repositories;

import com.shguitar.exam.models.Student;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.security.spec.DSAPrivateKeySpec;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private List<Student> allStudents;
    private static String fileName = "data.csv";

    @Override
    public Student getStudent(final String name, final String mobile) {
        List<Student> students = getAllStudents();
        Student result = students.stream()
                .filter(s -> s.getName().equals(name) && s.getMobile().equals(mobile))
                .findFirst()
                .orElse(null);
        return result;
    }

    private List<Student> getAllStudents(){
        if(allStudents == null){
            List<Student> students = new ArrayList<>();

            List<String> lines = getLines();
            for (String line : lines){
                String[] cells = line.split(",");
                Student student = new Student();
                student.setClassTime(cells[0]);
                student.setExamNo(cells[1]);
                student.setName(cells[2]);
                student.setMajority(cells[3]);
                student.setLevel(cells[4]);
                student.setMobile(cells[5]);
                students.add(student);
            }
            allStudents = students;
        }
        return allStudents;
    }

    public static List<String> getLines() {
        List<String> result = new ArrayList<>();

        BufferedReader reader = null;
        try {
            ClassPathResource resource = new ClassPathResource(fileName);
            InputStream stream = resource.getInputStream();


            reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
            String line;
            int lineIndex = 1;
            while ((line = reader.readLine()) != null) {
                result.add(line);
                lineIndex++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return result;
    }
}
