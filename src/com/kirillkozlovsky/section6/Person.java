package com.kirillkozlovsky.section6;

// Coding Exercise 30
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age >= 0 && age <= 100) ? age : 0;
    }

    public boolean isTeen(){
        return (age >= 13 && age <= 19);
    }

    public String getFullName(){
        String optionalSpace = "";
        if (!firstName.isEmpty() && !lastName.isEmpty())
            optionalSpace = " ";
        return firstName + optionalSpace + lastName;
    }
}
