package com.JSE.Collections_prog;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int score;

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "[ name : "+name+"\t age : "+age+"\t score : "+score+" ]";
    }


    @Override
    public int compareTo(Student s2) {
        Integer scr1 = this.score;
        Integer scr2 = s2.score;

        /**
         * if scr1 > scr2:
         *      returns +ve value
         * if scr1 < scr2:
         *      returns -ve value
         * if scr1 == scr2:
         *       returns 0
         */
        return  scr1.compareTo(scr2); //will sort in ascending order

    }
}
