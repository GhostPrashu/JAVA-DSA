public class pivotindex {
    public static int main(String args[]){
        int[] ind={1,7,3,6,5,6};
        int tsum=0;
         for(int i:ind){
            tsum+=ind[i];
         }
         int lsum=0;
         for(int i=0;i<ind.length;i++){
            if(lsum==tsum-lsum-ind[i]){
                
                return i;
            }
            lsum+=ind[i];
         }
         return -1;
    }
}
