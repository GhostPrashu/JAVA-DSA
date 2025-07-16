public class sort {
public static void main(String[] args) {
    int[] a={1,2,4,3,2,10};
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            if(a[j]<a[i]){
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
