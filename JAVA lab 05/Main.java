import java.awt.*; 

import javax.swing.*; 

  
public class Main {
    public static void main(String[] args) {
        
        Students stud = new Students("John Doe", 12345, "Computer Science");
        System.out.println("Student Name: " + stud.getName());
        System.out.println("Student ID: " + stud.getID());
        System.out.println("Student Course: " + stud.getCourse());

        
        Lecturer lect = new Lecturer("Jane Smith", 6789, "Software Engineering");
        System.out.println("Lecturer Name: " + lect.getName());
        System.out.println("Lecturer ID: " + lect.getID());
        System.out.println("Lecturer Programme: " + lect.getProgramme());
    }
}

  