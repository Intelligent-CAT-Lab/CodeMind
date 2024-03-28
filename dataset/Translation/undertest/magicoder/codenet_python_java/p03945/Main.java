import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countSwaps(input));
    }

    public static int countSwaps(String input) {
        return input.split("WB").length - 1 + input.split("BW").length - 1;
    }
}



You can test this code with the following test case:

Test input:
BBBWW

Expected output:
1