import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
        int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
        int C = sc.nextInt();
System.out.println("[INST]7;C;sc.nextInt();"+C);

        if(A==B && A==C ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
