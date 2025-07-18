import java.util.Scanner;
public class diagonalmaxmin {
 
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

        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==j){
                    if(max<mat[i][j]){
                        max=mat[i][j];
                    }
                    
                }
                if(i+j==row-1){
                    
                    if(mat[i][j]<min){
                        min=mat[i][j];
                    }
                }
            }
        }
        System.out.println(max-min);
        sc.close();
    }
}


