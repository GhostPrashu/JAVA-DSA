package oops;
class multi{
    int mul(int a,int b){
        return a*b;
    }
    float mul(float a,float b){
        return a*b;
    }
    int mul(int a,int b,int c){
        return a+b+c;
    }
    double mul(float a,float b,float c){
        return a/b/c;
    }
    void mul(int a,float b){
        System.out.println(a+b);
    }
    void mul(){
        System.out.println("Hello");
    }
    //constructor overloading
    multi(){
        System.out.println("Hi");
    }
    multi(int a){
        System.out.println(a);
    }
}
public class overloading{
    public static void main(String[] args) {
        multi m=new multi();
        System.out.println(m.mul(5,6));
        m.mul(5, 6.5f);
        multi ob=new multi();
        multi ob1=new multi(5);
    }
}