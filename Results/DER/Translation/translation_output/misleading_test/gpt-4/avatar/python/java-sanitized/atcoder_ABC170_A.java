import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        for (int e = 0; e < inputs.length; e++) {
            int i = Integer.parseInt(inputs[e]);
            if (i == 0) {
                System.out.println(-(e + 1) * (e + 1));
                break;
            }
        }
        scanner.close();
    }
}