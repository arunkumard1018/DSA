package com.JSE.Collections_prog;


import java.util.ArrayList;
import java.util.Collection;

public class Sorting {
    public static void main(String[] args) {
        int[] marks = {54,35,67,23,65,76,33};
        int[] age = {22,23,34,23,21,23,23};
        String[] names = new String[]{"arun", "ajay","chirag","manoj","chanda","sumant","yadav"};
        ArrayList<Student> students = new ArrayList<>();
        for(int i=0; i<7; i++){
            Student st = new Student(names[i],age[i],marks[i]);
            students.add(st);
        }
        java.util.Collections.sort(students);
        for(Student st:students){
            System.out.println(st);

        }
    }
}
