import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = Arrays.asList(alphabet).indexOf(input.charAt(0));
        System.out.println(alphabet[index + 1]);
    }
}