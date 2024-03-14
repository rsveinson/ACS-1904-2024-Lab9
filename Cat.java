import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class Cat implements Serializable{
    // fields
    private String name;
    private int age;
    
    // constructors

    
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }// end full arg

    //getters and setters
    
    
    public int getAge(){
        return age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    
    
    
    @Override
    public String toString(){
        //return this.getName() + ": " + this.getAge();
        return name + " " + age;
    }
}


