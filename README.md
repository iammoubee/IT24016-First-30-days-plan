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
Date:26.04.2026
Day#08
Topic:collection framework for java
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHz
*******************
Example
********************
public import java.util.*;

public class Main {
    public static void main(String[] args) {

    
        System.out.println("=== LIST ===");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("List: " + list);
        System.out.println("First element: " + list.get(0));

        for(String item : list){
            System.out.println(item);
        }


        
        System.out.println("\n=== QUEUE ===");
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("Queue: " + queue);

        queue.poll(); 
        System.out.println("After poll: " + queue);

        System.out.println("Front element: " + queue.peek());


        
        System.out.println("\n=== HASHMAP ===");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Rahim");
        map.put(2, "Karim");
        map.put(3, "Sadia");

        System.out.println("Map: " + map);
        System.out.println("Value of key 1: " + map.get(1));

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    
        System.out.println("\n=== EXTRA ===");
        System.out.println("List contains Mango? " + list.contains("Mango"));
        list.remove("Banana");
        System.out.println("Updated List: " + list);
        System.out.println("List size: " + list.size());
    }
}
 {
    
}
Date:27.04.2026
Day#09
Topic:collection framework for java
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
import java.util.*;

public class Main {
    public static void main(String[] args) {

        
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        System.out.println("List: " + list);


        
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");

        queue.poll(); 

        System.out.println("Queue: " + queue);



        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Rahim");
        map.put(2, "Karim");

        System.out.println("Map: " + map);


        
        for (String item : list) {
            System.out.println(item);
        }
    }
}
Date:28.04.2026
Day#10
Topic:list in java
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        System.out.println("List: " + list);
    }
}
Date:30.04.2026
Day#11
Topic:array list in java
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("Cat");
        arr.add("Dog");

        System.out.println("ArrayList: " + arr);
    }
}
Date:01.04.2026
Day#12
Topic:linked list in java
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Red");
        list.add("Blue");

        System.out.println("LinkedList: " + list);
    }
}





