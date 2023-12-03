/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author joshokeeffe
 */
public class Courses {
    // Variable declarations
    public String name, times;
    public int spaces;
//    Course[] arr;
    

    // Constructor
    public Courses(String name, String times, int spaces) {
        this.name = name;
        this.times = times;
        this.spaces = spaces;
    }
    
//    arr = new Course[2];

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public void setSpaces(int spaces) {
        this.spaces = spaces;
    }
    
    // Getters
    public String getName() {
        return name;
    }

    public String getTimes() {
        return times;
    }

    public int getSpaces() {
        return spaces;
    }
    
    String[] strings = { 
        "Object Orientated Programming", 
        "Web Application Development", 
        "Advanced Databases", 
        "Data Communications & Networking" 
    };
    
    String[] strings2 = {
        "Course name: Object Orientated Programming\nCourse Times: Mon: 12:00-14:00, Tue: 10:00-12:00\nSpaces:25",
        "Course name: Web Application Development\nCourse Times: Wed: 14:00-16:00, Mon: 12:00-15:00\nSpaces: 20",
        "Course name: Advanced Databases\nCourse Times: Tue: 15:00-17:00, Fri: 11:00-13:00\nSpaces: 25",
        "Course name: Data Communications & Networking\nCourse Times: Mon: 09:00-12:00, Thur: 13:00-15:00\nSpaces: 25"
    };
    
    String[][] courses = {
    {"Object Orientated Programming", "20"},
    {"Web Application Development", "15"},
    {"Advanced Databases", "10"},
    {"Data Communications & Networking", "25"}
};

           
}
