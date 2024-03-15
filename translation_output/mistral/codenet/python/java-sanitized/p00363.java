import java.util.Scanner;

public class p00363 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width, height and character: ");
        String input = sc.nextLine();
        String[] values = input.split(" ");
        int w = Integer.parseInt(values[0]);
        int h = Integer.parseInt(values[1]);
        String c = values[2];

        System.out.println("+" + "-" * (w - 2) + "+");
        for (int i = 0; i < h - 2; i++) {
            if (i * 2 == h - 3) {
                System.out.println("|" + "." * ((w - 3) / 2) + c + "." * ((w - 3) / 2) + "|");
            } else {
                System.out.println("|" + "." * (w - 2) + "|");
            }
        }
        System.out.println("+" + "-" * (w - 2) + "+");
    }
}