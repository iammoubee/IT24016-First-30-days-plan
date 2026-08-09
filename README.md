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
Date:9.05.2026
Day#13
Topic:Abstruct Class
Video Link:https://youtu.be/lWFzm8qIR1c?si=F4xqcZjL5OdrfHzZ
*******************
Example
********************
import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void perimeter();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Circle Area = " + (3.14 * radius * radius));
    }

    void perimeter() {
        System.out.println("Circle Perimeter = " + (2 * 3.14 * radius));
    }
}

class Triangle extends Shape {
    double side1, side2, side3, base, height;

    Triangle(double side1, double side2, double side3, double base, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    void area() {
        System.out.println("Triangle Area = " + (0.5 * base * height));
    }

    void perimeter() {
        System.out.println("Triangle Perimeter = " + (side1 + side2 + side3));
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        System.out.println("Rectangle Area = " + (length * width));
    }

    void perimeter() {
        System.out.println("Rectangle Perimeter = " + (2 * (length + width)));
    }
}

class Trapezium extends Shape {
    double side1, side2, side3, side4, height;

    Trapezium(double side1, double side2, double side3, double side4, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.height = height;
    }

    void area() {
        System.out.println("Trapezium Area = " + (0.5 * (side1 + side2) * height));
    }

    void perimeter() {
        System.out.println("Trapezium Perimeter = " + (side1 + side2 + side3 + side4));
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter triangle sides and height: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double h = input.nextDouble();

        System.out.print("Enter rectangle length and width: ");
        double length = input.nextDouble();
        double width = input.nextDouble();

        System.out.print("Enter trapezium sides and height: ");
        double t1 = input.nextDouble();
        double t2 = input.nextDouble();
        double t3 = input.nextDouble();
        double t4 = input.nextDouble();
        double th = input.nextDouble();

        Shape circle = new Circle(radius);
        Shape triangle = new Triangle(a, b, c, b, h);
        Shape rectangle = new Rectangle(length, width);
        Shape trapezium = new Trapezium(t1, t2, t3, t4, th);

        System.out.println("\n----- RESULTS -----");

        circle.area();
        circle.perimeter();

        System.out.println();

        triangle.area();
        triangle.perimeter();

        System.out.println();

        rectangle.area();
        rectangle.perimeter();

        System.out.println();

        trapezium.area();
        trapezium.perimeter();
        ================================================================================
DAY 13: QUEUES IN JAVA
=============================================================================
Day: 14
Topic: Queues in Java
Video Link: https://www.youtube.com/watch?v=Hk5VlG6OgPI

CODE:
================================================================================
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        
        queue.add("First");
        queue.add("Second");
        queue.add("Third");
        
        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("After removal: " + queue);
        System.out.println("First element: " + queue.peek());
    }
}
================================================================================

================================================================================
DAY 14: USING MAP
===========================================================================
Day:15
Topic: Using Map Interface in Java
Video Link: https://www.youtube.com/watch?v=6jqMMHlA6G4

CODE:
================================================================================
import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(101, "John");
        map.put(102, "Emma");
        map.put(103, "Michael");
        
        System.out.println("Map: " + map);
        System.out.println("Get ID 102: " + map.get(102));
        System.out.println("Contains key 103? " + map.containsKey(103));
        map.remove(103);
        System.out.println("After removal: " + map);
    }
}
================================================================================

================================================================================
DAY 15: HASHMAP & COLLECTIONS REAL WORLD
================================================================================

Day:16
Topic: HashMap and Collections Real World Scenario
Video Link: https://www.youtube.com/watch?v=2v0eE4m5KVY

CODE:
================================================================================
import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Laptop", 899.99);
        products.put("Mouse", 29.99);
        products.put("Keyboard", 49.99);
        
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        
        System.out.println("Products: " + products);
        System.out.println("Cart: " + cart);
        
        double total = products.get("Laptop") + products.get("Mouse");
        System.out.println("Total: $" + total);
    }
}
================================================================================

================================================================================
DAY 16: JAVA FILE HANDLING
================================================================================

Day: 17
Topic: Java File Handling
Video Link: https://www.youtube.com/watch?v=4RjH0AD-EhA

CODE:
================================================================================
import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        }
        
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Exists: " + file.exists());
    }
}
================================================================================

================================================================================
DAY 17: BYTE STREAM
================================================================================
Day: 18
Topic: Using Byte Stream in Java
Video Link: https://www.youtube.com/watch?v=JKLjIEg78lE

CODE:
================================================================================
import java.io.*;

public class ByteStream {
    public static void main(String[] args) throws IOException {
        // Write
        FileOutputStream fos = new FileOutputStream("byte.txt");
        fos.write("Hello Java".getBytes());
        fos.close();
        
        // Read
        FileInputStream fis = new FileInputStream("byte.txt");
        int data;
        while ((data = fis.read()) != -1) {
            System.out.print((char) data);
        }
        fis.close();
    }
}
================================================================================

================================================================================
DAY 18: MANAGING DIRECTORIES
================================================================================
Day:19
Topic: Managing Directories in Java
Video Link: https://www.youtube.com/watch?v=qSm3_3XY0_c

CODE:
================================================================================
import java.io.File;

public class Directories {
    public static void main(String[] args) {
        File dir = new File("MyFolder");
        
        if (dir.mkdir()) {
            System.out.println("Directory created: " + dir.getName());
        }
        
        File nested = new File("MyFolder/SubFolder");
        nested.mkdirs();
        System.out.println("Nested directories created");
        
        System.out.println("Is directory? " + dir.isDirectory());
        dir.delete();
        System.out.println("Directory deleted");
    }
}
================================================================================

================================================================================
DAY 19: DATE AND TIME CLASS
================================================================================
Day: 20
Topic: Java Date and Time Class
Video Link: https://www.youtube.com/watch?v=4nVbsujz5lc

CODE:
================================================================================
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dt);
        System.out.println("Tomorrow: " + date.plusDays(1));
        System.out.println("Year: " + date.getYear());
    }
}
================================================================================

================================================================================
DAY 20: FORMATTING DATE
===============================================================================
Day:21
Topic: Formatting Date in Java
Video Link: https://www.youtube.com/watch?v=7-jJY-6n90c

CODE:
================================================================================
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        
        System.out.println("Format 1: " + now.format(f1));
        System.out.println("Format 2: " + now.format(f2));
        System.out.println("Format 3: " + now.format(f3));
    }
}
================================================================================

================================================================================
DAY 21: TIME ZONE
================================================================================
Day:22
Topic: Time Zone in Java
Video Link: https://www.youtube.com/watch?v=L7ZKSFm4V8I

CODE:
================================================================================
import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZone {
    public static void main(String[] args) {
        ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime london = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        
        System.out.println("New York: " + ny);
        System.out.println("London: " + london);
        System.out.println("Tokyo: " + tokyo);
    }
}
================================================================================

================================================================================
DAY 22: PARSING DATA FROM STRING
===============================================================================
Day: 23
Topic: Parsing Data from String
Video Link: https://www.youtube.com/watch?v=2zZGR7cV3F8

CODE:
================================================================================
import java.time.LocalDate;

public class StringParsing {
    public static void main(String[] args) {
        // Parse numbers
        int num = Integer.parseInt("100");
        double dbl = Double.parseDouble("45.67");
        System.out.println("Number: " + num);
        System.out.println("Double: " + dbl);
        
        // Parse date
        LocalDate date = LocalDate.parse("2026-08-09");
        System.out.println("Date: " + date);
        
        // Split string
        String data = "John,25,Engineer";
        String[] parts = data.split(",");
        System.out.println("Name: " + parts[0]);
        System.out.println("Age: " + parts[1]);
        System.out.println("Job: " + parts[2]);
    }
}
================================================================================

================================================================================
DAY 23: FILE INPUT OUTPUT
================================================================================
Day:24
Topic: File Input Output in Java
Video Link: https://www.youtube.com/watch?v=wU6uj5hP2H0

CODE:
================================================================================
import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {
        // Write to file
        FileWriter writer = new FileWriter("data.txt");
        writer.write("Hello World!\n");
        writer.write("Java Programming");
        writer.close();
        System.out.println("File written");
        
        // Read from file
        BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("Read: " + line);
        }
        reader.close();
    }
}
================================================================================

        input.close();
    }
}



