package oops;
class constructor1{
    String name;
    int rollno;
    double marks;
    void display(){
        System.out.println("name:"+name+"\nRollno:"+rollno+"\nmarks:"+marks);
    }
    constructor1(){
        name="umesh";
        rollno=123;
        marks=234.2;
        System.out.println("Hello");
    }
}
public class constructor {
    public static void main(String[] args) {
        constructor1 ob=new constructor1();
        ob.display();
    }
}
