
// printing the no of rows by taking inpute 

import java.util.Scanner;
public class triangle {

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int row;

        row=sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
