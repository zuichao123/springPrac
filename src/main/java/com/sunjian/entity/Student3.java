package com.sunjian.entity;

/**
 * @author sunjian
 * @date 2020/3/14 10:05
 */
public class Student3 {
    private String id;
    private String name;
    private String age;
    private Student4 student4;

    public Student4 getStudent4() {
        return student4;
    }

    public void setStudent4(Student4 student4) {
        this.student4 = student4;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", student4=" + student4 +
                '}';
    }
}
