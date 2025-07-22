import java.util.Scanner;

public class xmatrix {
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
        boolean flag=true;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==j)||(i+j==col-1)){
                    if(mat[i][j]==0){
                        flag=false;
                        break;
                    }
                }
                else{
                    if(mat[i][j]!=0){
                        flag=false;
                        break;
                    }
                }
            }
        }
    }
}
