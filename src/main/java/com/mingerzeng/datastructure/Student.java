package com.mingerzeng.datastructure;

public class Student implements Comparable<Student>{

//    private int id;
    private String name;

    public Student(String name){
        this.name = name;
    }

    public boolean equals(Object student){
        if(this == student){
            return true;
        }
        if(student == null){
            return false;
        }
        if(this.getClass() != student.getClass()){
            return false;
        }
        Student another = (Student) student;
        return this.name.equals(another.name);
    }

    @Override
    public int compareTo(Student another) {
        return 0;
    }
}
