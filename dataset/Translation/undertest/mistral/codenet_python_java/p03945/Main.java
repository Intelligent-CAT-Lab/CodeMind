import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = (input.count("WB") + input.count("BW"));
        System.out.println(count);
    }
}