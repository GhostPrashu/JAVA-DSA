import java.util.Arrays;
import java.util.Scanner;

public class flipimage {
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
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    mat[i][j]=1;
                }
                else{
                    mat[i][j]=0;
                }
            }
        }
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
