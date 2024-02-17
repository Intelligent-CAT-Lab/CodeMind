import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a*b%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

       
    }
    
}
