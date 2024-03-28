import java.util.Scanner;

public class p02690 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        for (int i = -1000; i < 1000; i++) {
            for (int j = -1000; j < 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    return;
                }
            }
        }
    }
}