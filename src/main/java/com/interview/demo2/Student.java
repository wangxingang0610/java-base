package com.interview.demo2;

public class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

 class Test{
     public static void main(String[] args) {
         final Student stu = new Student(1, "java");
//         stu = new Student(2, "php");//Cannot assign a value to final variable 'stu'
         stu.setAge(10);
     }
}