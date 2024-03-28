import java.util.Scanner;

public class atcoder_ABC170_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("0")) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}



You can test this code with the input "1 2 3 4 0" and it will output "5".