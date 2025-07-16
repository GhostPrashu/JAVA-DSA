public class stocksellandbuy {
    public static void main(String args[]){
        int price[] ={7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i=0;i<price.length;i++){
            if(price[i]<min){
                min=price[i];
            
            }
            else if(price[i]-min>maxprofit){
                maxprofit=price[i]-min;
            }
        }
        System.out.println(maxprofit);
    }
}
