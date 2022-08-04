package com.acem.db.dao.impl;

import com.acem.db.dao.StudentDao;
import com.acem.db.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class StudentDaoFileImpl implements StudentDao {

    private List<Student> studentList = new ArrayList<>();
    public StudentDaoFileImpl() {
        try {
            BufferedReader bufferReader = new BufferedReader(new FileReader("students.txt"));
            String line;
            while ((line = bufferReader.readLine()) != null) {
                if (line.length() > 1) {
                    String token[] = line.split(",");
                    if (token != null) {
                        studentList.add(new Student(
                                token[0] != null ? Long.parseLong(token[0]) : null,
                                token[1] != null && !token[1].isEmpty() ?  token[1] : null,
                                token[2] != null && !token[1].isEmpty() ?  token[1] : null,
                                token[3] != null && !token[1].isEmpty() ?  token[1] : null
                        ));
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    @Override
    public Optional<List<Student>> getAll() {

        return Optional.of(studentList);
    }
    @Override
    public Optional<Student> getById(Long id) {
        return studentList.stream().filter(student -> student.getId().compareTo(id) == 0).findFirst();
    }

    @Override
    public Optional<Student> getByEmailAddress(String emailAddress) {
        return studentList.stream().filter(student -> student.getEmail().equals(emailAddress)).findFirst();
    }

    @Override
    public Optional<Student> getByContactNo(String contactNo) {
        return studentList.stream().filter(student -> student.getContactNo().equals(contactNo)).findFirst();
    }

    @Override
    public Boolean save(Student student) {
        try {
            studentList.add(student);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt",true));
            PrintWriter pw= new PrintWriter(bufferedWriter);
            pw.println(student.toString());
            pw.flush();
            // Add a code to insert a new Student line in the file
            return true;
        } catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public Boolean update(Student student) {
        try {
            Optional<Student> optionalStudent = getById(student.getId());
            if (optionalStudent.isPresent()) {
                Student memoryStudent = optionalStudent.get();
                memoryStudent.setName(student.getName());
                memoryStudent.setId(student.getId());
                memoryStudent.setContactNo(student.getContactNo());
                memoryStudent.setEmail(student.getEmail());
                // Add a code to update an existing Student line in the file\
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt",false));
                PrintWriter pw= new PrintWriter(bufferedWriter);
                for (Student std :studentList )
                    pw.println(std.toString());
                pw.flush();
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public Boolean delete(Long id) {
        try {
            Optional<Student> optionalStudent = getById(id);
            if (optionalStudent.isPresent()) {
                Student memoryStudent = optionalStudent.get();
                studentList = studentList
                        .stream()
                        .filter(student -> student.getId().compareTo(memoryStudent.getId()) != 0)
                        .collect(Collectors.toList());

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt",false));
                PrintWriter pw= new PrintWriter(bufferedWriter);
                for (Student std :studentList )
                    pw.println(std.toString());
                pw.flush();    

                // Add a code to delete an existing Student line in the file
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            System.err.println("Exception: " + ex.getMessage());
            return false;
        }
    }
}
