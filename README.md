First 30 days plan
IT24016
Date:19.04.2026
Day#01
Topic:Class and Object..
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example 1:
-------------------
public class main{
    public static void main(String[] args){

        Student s1=new Student("Sadia",24016,3.66);
        Student s2=new Student("kabir",24080,3.80);
        Student s3=new Student("Mou",24090,3.98);

        s1.display();
        s2.display();
        s3.display();

    }
}



class Student{
    String name;
    int ID;
    double CGPA;
    


    Student(String name,int ID,double CGPA){
        this.name=name;
        this.ID=ID;
        this.CGPA=CGPA;
        

    }
    void display(){
        System.out.println("Name:"+name+" "+"ID:"+ID+" "+"CGPA:"+CGPA);
    }
}



******************************
Example 2:
------------------------------
class Car {
    String brand;

    void show() {
        System.out.println("Car brand is " + brand);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car();
        c1.brand = "Toyota";

        Car c2 = new Car(); 
        c2.brand = "BMW";

        c1.show();
        c2.show();
    }
}
