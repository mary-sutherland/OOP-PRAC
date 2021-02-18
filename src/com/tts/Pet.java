package com.tts;

public class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    public Pet() {
        name = "Rufus";
        age = 4;
        type = "Husky";

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

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {

    }

}
