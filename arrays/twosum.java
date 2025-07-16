public class twosum {
    public static void main(String[] args) {
        int n[]={2,7,11,15};
        int k=9;
        for(int i=0;i<=n.length;i++){
            for(int j=i;j<n.length;j++){
                if(n[i]+n[j]==k){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}
