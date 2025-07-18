import java.util.Scanner;

public class sumofcorners {
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
        int sum=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i+j==0) || (i==0&j==row-1) || (i==row-1 & j==0) || (i==row-1 & j==col-1)){
                    sum+=mat[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}