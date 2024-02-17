import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A==B && A==C ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
