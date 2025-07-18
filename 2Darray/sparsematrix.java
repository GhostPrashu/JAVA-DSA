import java.util.Scanner;

public class sparsematrix {
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
        int total=row*col;
        int count=0;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==0){
                    count++;
                }
            }
        }
        if(count>total/2){
            System.out.println("Sparse matrix");
        }
        else{
            System.out.println("Not a sparse matrix");
        }
        sc.close();
    }
}
