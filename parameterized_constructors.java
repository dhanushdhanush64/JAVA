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
    Student(String name,String Gender,int age,Long phneno){
        this.name=name;
        this.age=age;
        this.Gender=Gender;
        this.phneno=phneno;
        
    }
}

public class Parameterizedconstructors{
    public static void main(String args[]){
        Student s1=new Student("vamshi","male",20,8694968966l);
        s1.info();
        
    }
}

//output:
//vamshi
//male
//20
//8694968966l
