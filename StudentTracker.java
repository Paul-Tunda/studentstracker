package studentstracker;

import java.io.File;

public class StudentTracker {

    public static void main(String[] args) {

        File file = new File("/Users/tundapaul/Library/CloudStorage/OneDrive-Personal/Desktop/2025-RTT-23/JAVA-PRACTICE/MyFirstProgram/src/studentstracker/students.txt");

        if (file.exists()) {

            System.out.println("File exists");

        }else {

            System.out.println("File doesn't exist");

        }

    }

}
