import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = countWB_BW(input);
        System.out.println(result);
    }

    public static int countWB_BW(String input) {
        return input.chars().filter(ch -> ch == 'W').map(ch -> 1).sum() + input.chars().filter(ch -> ch == 'B').map(ch -> 1).sum() - Math.min(input.lastIndexOf("WB"), input.lastIndexOf("BW")) + 1;
    }
}