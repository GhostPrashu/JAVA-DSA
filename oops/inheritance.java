package oops;
class First{
    int a,b;
    First(int x,int y){
        System.out.println("First class constructor");
        a=x;
        b=y;
    }
    void sum(){
        System.out.println(a+b);
    }
    void sub(){
        System.out.println(a-b);
    }
}
class Second extends First{
    Second(){
        super(10,20);
        System.out.println("Second class constructor");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Second ob=new Second();
        ob.sum();
    }
}
