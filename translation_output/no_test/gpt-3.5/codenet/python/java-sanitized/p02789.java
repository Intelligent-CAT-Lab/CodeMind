import java.util.Scanner;

public class p02789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        
        int a0 = Integer.parseInt(inputs[0]);
        int a1 = Integer.parseInt(inputs[1]);
        
        if (a0 == a1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}