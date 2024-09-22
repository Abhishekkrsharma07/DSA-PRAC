
import java.util.Scanner;
public class star {
    public static void main(String []args){

        int a;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value : ");
        a=sc.nextInt();

        for(int i=0;i<a;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
