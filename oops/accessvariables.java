package oops;
class first{
    int a=10;
    first(){
        System.out.println("First class constructor");
    }
}
class Second extends first{
    int a=15;
    Second(){
        System.out.println("Second class constructor");
    }
    void access(){
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(a*super.a);
    }
}
public class accessvariables {
    public static void main(String[] args) {
        Second ob=new Second();
        ob.access();
    }
}
