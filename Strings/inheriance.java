class firstinher{
    int a=10,b=20;
}
class secondinher extends firstinher{
    int sum(int c,int d){
        return a+b;
    }
    
}
public class inheriance {
    public static void main(String[] args) {
        secondinher ob=new secondinher();
        System.out.println(ob.sum(3, 4));
    }
}
