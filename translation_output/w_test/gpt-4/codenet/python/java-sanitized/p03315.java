import java.util.Scanner;

public class p03315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = countOccurrences(a, '+');
        int f = countOccurrences(a, '-');
        System.out.println(e - f);
    }

    public static int countOccurrences(String str, char toFind) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == toFind) {
                count++;
            }
        }
        return count;
    }
}