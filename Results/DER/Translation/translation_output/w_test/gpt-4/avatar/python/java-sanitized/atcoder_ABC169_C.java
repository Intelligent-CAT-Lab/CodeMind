import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1].charAt(0) + inputs[1].substring(2));
        
        System.out.println((long) a * b / 100);
        
        scanner.close();
    }
}