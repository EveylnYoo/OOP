/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author dongyiyoo
 */
    public class Subscriber {
    // Variable declarations
    private String name, email;

    // Constructor
    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //Getters
     public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
    
