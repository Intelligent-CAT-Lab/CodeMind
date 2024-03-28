import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        String w = scanner.nextLine();
        boolean isEven = true;

        for (int i = 0; i < alfa.length(); i++) {
            int count = 0;
            for (int j = 0; j < w.length(); j++) {
                if (alfa.charAt(i) == w.charAt(j)) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                isEven = false;
                System.out.println("No");
                return;
            }
        }
        
        if (isEven) {
            System.out.println("Yes");
        }
        scanner.close();
    }
}