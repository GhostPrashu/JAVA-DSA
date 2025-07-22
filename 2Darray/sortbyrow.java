import java.util.Arrays;
import java.util.Scanner;

public class sortbyrow {
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
            Arrays.sort(mat[i]);
        }
        System.out.println(Arrays.deepToString(mat));
    }
}

