import java.util.Scanner;

public class diagonaldiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][] mat=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    
                    sum1+=mat[i][j];
                }
                if(i+j==row-1){
                    sum2+=mat[i][j];
                }
            }
        }
        
        System.out.println(Math.abs(sum1-sum2));
        sc.close();
    }
}
