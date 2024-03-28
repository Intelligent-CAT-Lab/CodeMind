import java.util.Scanner;

public class p02873 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = input.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '>') {
                sho[i + 1] = 0;
            } else {
                sho[i + 1] = sho[i] + 1;
            }
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += seq[i];
        }

        System.out.println(sum);
    }
}