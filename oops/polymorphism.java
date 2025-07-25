package oops;
class Animal{
    void sound(){
        
    }
}
class dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meows");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Animal a;
        a=new dog();
        a.sound();
        a=new cat();
        a.sound();
    }
}
