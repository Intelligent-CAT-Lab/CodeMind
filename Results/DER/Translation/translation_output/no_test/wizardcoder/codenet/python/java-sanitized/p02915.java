import java.util.Scanner;

public class p02915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] input = sc.nextLine().split(" ");
            int n = Integer.parseInt(input[0]);
            System.out.println(Math.pow(n, 3));
        }
    }
}