import java.util.Scanner;

public class p00332 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int E = scanner.nextInt();
        int Y = scanner.nextInt();
        String output = "";

        if (E == 0) {
            if (Y > 1912) {
                output = "M" + (Y - 1867);
            } else if (Y > 1926) {
                output = "T" + (Y - 1911);
            } else if (Y > 1989) {
                output = "S" + (Y - 1925);
            } else {
                output = "H" + (Y - 1988);
            }
        } else if (E == 1) {
            output = "1867" + Y;
        } else if (E == 2) {
            output = "1911" + Y;
        } else if (E == 3) {
            output = "1925" + Y;
        } else {
            output = "1988" + Y;
        }

        System.out.println(output);
    }
}