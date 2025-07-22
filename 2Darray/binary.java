import java.util.Scanner;

public class binary {
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
            int count=0;
            for(int j=0;j<col;j++){

                if(mat[i][j]%2==1){
                    mat[i][j]=1;
                    count++;
                }
                else{
                    mat[i][j]=0;
                }
            }
            System.out.println(count);
        }
    }
}
