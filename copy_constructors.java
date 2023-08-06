import java.util.*;
class Student{
    String name;
    String Gender;
    int age;
    Long phneno;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.Gender);
        System.out.println(this.age);
        System.out.println(this.phneno);
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        this.Gender=s2.Gender;
        this.phneno=s2.phneno;
        
    }
    Student(){
        
    }
}

public class Copyconstructors{
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="aman";
        s1.age=23;
        s1.phneno=83948589506l;
        s1.Gender="male";
        
        
        Student s2=new Student(s1);
        
        s2.info();
        
    }
}

//output:
//aman
//male
//23
//83948589506l
