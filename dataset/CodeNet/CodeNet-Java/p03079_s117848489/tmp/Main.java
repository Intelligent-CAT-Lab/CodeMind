import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
System.out.println("[INST]4;a;scan.nextInt();"+a);
        int b = scan.nextInt();
System.out.println("[INST]5;b;scan.nextInt();"+b);
        int c = scan.nextInt();
System.out.println("[INST]6;c;scan.nextInt();"+c);

        if((a == b) && (a == c)){            
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
