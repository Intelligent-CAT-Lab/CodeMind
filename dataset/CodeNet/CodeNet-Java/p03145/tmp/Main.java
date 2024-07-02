import java.util.Scanner;

/**
 *
 * @author kouki
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
System.out.println("[INST]9;x;scan.nextInt();"+x);
        int y = scan.nextInt();
System.out.println("[INST]10;y;scan.nextInt();"+y);
        int z = scan.nextInt();
System.out.println("[INST]11;z;scan.nextInt();"+z);
        
        System.out.println((x*y)/2);
        
    }
    
}