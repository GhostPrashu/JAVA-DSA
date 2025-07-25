package oops;
class student {
    static String name="Abc";
    static int rollno=123;
    static double marks=76.9;
    static void display(){
        System.out.println(name+" "+rollno+" "+marks);
    }

}
class student2{
    String name;
    int rollno;
    double marks;
    void display(String n,int r,double m){
        System.out.println("Name:"+n);
        System.out.println("rollno:"+r);
        System.out.println("marks:"+m);
    }
}
public class call{ 
    public static void main(String[] args) {
        student s1=new student();
        student.display();
        //using class
        System.out.println(student.name);
        System.out.println(student.rollno);
        System.out.println(student.marks);
        //using object
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.marks);
        //Methods with parameters
        student2 ob=new student2();
        ob.display("umesh", 12, 45.5);
        ob.display("prasanth", 152, 68.23);
    }
}
