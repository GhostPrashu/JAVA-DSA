public class maxones {
    public static void main(String[] args) {
        int[] n={1,1,0,1,1,1};
        int max_count=0;
        int count=0;
        for(int i=0;i<n.length;i++){
            
            if (n[i]==1){
                count+=1;
            }
            else{
                if(max_count<count){
                max_count=count;
                count=0;
            }

            }
            
        }
        if(max_count<count)
            max_count=count;
        System.out.println(max_count);
    }
}
