import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrData = new int[1][2];
        int r1, r2;
        boolean flag = true;
        try {
            while (flag) {
                String input = scanner.nextLine();
                String[] splitData = input.split(" ");
                arrData[0][0] = Integer.parseInt(splitData[0]);
                arrData[0][1] = Integer.parseInt(splitData[1]);
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
        }
        r1 = arrData[0][0];
        r2 = arrData[0][1];
        System.out.println(1 / ((r2 + r1) / (r1 * r2)));
    }
}