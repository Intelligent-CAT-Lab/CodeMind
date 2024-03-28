import java.util.Scanner;

public class p02786 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        
        int ans = atack(H);
        
        System.out.println(ans);
    }
    
    public static int atack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + atack(tairyoku / 2) * 2;
        }
    }
}