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
