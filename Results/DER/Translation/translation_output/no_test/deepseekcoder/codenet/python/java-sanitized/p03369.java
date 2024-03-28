import java.util.Scanner;

public class p03369 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = countOccurrences(s, "o");
        System.out.println(700 + 100 * count);
    }

    public static int countOccurrences(String s, String sub) {
        int count = 0;
        int idx = 0;
        while ((idx = s.indexOf(sub, idx)) != -1) {
            count++;
            idx++;
        }
        return count;
    }
}