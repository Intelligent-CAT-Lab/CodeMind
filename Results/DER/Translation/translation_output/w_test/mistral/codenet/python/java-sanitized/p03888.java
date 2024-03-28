import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] arr_data = new double[2];
        int r1, r2;
        boolean flg = true;
        try {
            while (flg) {
                String input = scanner.nextLine();
                String[] temp = input.split(" ");
                arr_data[0] = Double.parseDouble(temp[0]);
                arr_data[1] = Double.parseDouble(temp[1]);
                flg = true;
            }
        } catch (NumberFormatException e) {
            flg = false;
        }
        r1 = (int) arr_data[0];
        r2 = (int) arr_data[1];
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}