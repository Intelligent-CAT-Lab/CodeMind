import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrData = new int[2];
        int r1, r2;
        boolean flag = true;
        try {
            while (flag) {
                String input = scanner.nextLine();
                String[] splitInput = input.split(" ");
                arrData[0] = Integer.parseInt(splitInput[0]);
                arrData[1] = Integer.parseInt(splitInput[1]);
                r1 = arrData[0];
                r2 = arrData[1];
                flag = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        double result = 1 / ((r2 + r1) / (r1 * r2));
        System.out.println(result);
    }
}