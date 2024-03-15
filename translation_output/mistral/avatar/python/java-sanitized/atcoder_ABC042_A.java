import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split(" ");
        int[] ABC = new int[splitInput.length];
        for (int i = 0; i < splitInput.length; i++) {
            ABC[i] = Integer.parseInt(splitInput[i]);
        }
        if (Arrays.asList(ABC).contains(5) == 2) {
            if (Arrays.stream(ABC).sum() == 17) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}