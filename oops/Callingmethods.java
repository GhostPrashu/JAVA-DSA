package oops;
class First{
    int a,b;
    First(int x,int y){
        a=x;
        b=y;
    }
    void sum(int m,int n){
        System.out.println(m+n);
    }
    void sub(){
        
        System.out.println(a-b);
    }
}
class Second extends First{
    Second(){
        super(100,50);
        super.sum(2, 5);
        super.sub();
        
    }
}
public class Callingmethods {
    public static void main(String[] args) {
        Second ob=new Second();
    }
}
