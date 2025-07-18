import java.util.Scanner;

public class toeplitzmatrix {
    
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
        boolean toeplitz=true;
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
                if(i<=j){
                    if(mat[i][j]!=mat[i-1][j-1]){
                        System.out.println(true);
                        toeplitz=false;
                        break;
                    }

                }
            }
            if(!toeplitz)
                break;
        }
        if(toeplitz){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        sc.close();
    }
}
