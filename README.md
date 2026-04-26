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
*****************
Date:20.04.2026
Day#02
Topic:Encapsulation
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example:
*************************
class Student {

    
    private String name;
    private int age;

 
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();

      

      
        s.setName("Mou");
        s.setAge(21);

      
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}



}
Date:21.04.2026
Day#03
Topic:Constructor
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example:
*************************
class Student {

    String name;
    int age;

   
    Student() {
        name = "Mou";
        age = 21;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        s.show();
    }
}
Date:22.04.2026
Day#04
Topic:inheritance
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // from Animal
        d.bark();  // from Dog
    }
}
Date:23.04.2026
Day#05
Topic:Polymorphism
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Cat();
        a.sound();

        a = new Dog();
        a.sound();
    }
}
Date:24.04.2026
Day#06
Topic:Abstraction
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
abstract class Animal {
    abstract void sound(); // no body

    void sleep() {
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}
Date:25.04.2026
Day#07
Topic:Inner class in java
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
class Outer {
    int x = 10;

    class Inner {
        void show() {
            System.out.println("Inner class: x = " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner(); // create inner object
        in.show();
    }
}

