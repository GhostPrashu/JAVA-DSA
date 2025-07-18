

public class basic {
    public static void main(String[] args) {
        int od=0;
        int ev=0;
        int[] a={1,2,3,4,5,6,7,8};
        for(int i=0;i<a.length;i++){
            if(i%2==0){
                ev+=a[i];

            }
            else{
                od+=a[i];
            }


        }
                System.out.println(od-ev);
                odd(a);


    }
    static void odd(int a[]){
        int ev=0;
        int od=0;
        for(int ar: a){
            if(ar%2==0){
                ev+=ar;

            }
            else{
                od+=ar;
            }

        }
        System.out.println(od-ev);
        
    }
}
