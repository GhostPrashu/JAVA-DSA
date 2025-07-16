public class halfarray{
public static void main(String[] args) {
    int[] a={1,2,0,3,2,10};
    for(int i=(a.length/2);i<a.length-1;i++){
        for(int j=(a.length/2)+1;j<a.length;j++){
            if(a[j]>a[i]){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            
            
        }
        

  }

  for(int i:a){
  System.out.print(i+" ");
  }
}
}
  