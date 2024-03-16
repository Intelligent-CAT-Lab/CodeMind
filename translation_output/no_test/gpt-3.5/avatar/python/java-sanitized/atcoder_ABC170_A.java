import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        
        int[] a = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            a[i] = Integer.parseInt(inputArray[i]);
        }
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}