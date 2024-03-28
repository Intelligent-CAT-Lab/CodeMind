import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // é
ååæå
        int[][] array_result = new int[100][100];
        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;

        String data = sc.nextLine();

        array_result[i][j] = Integer.parseInt(data.split(" ")[0]);
        array_result[i][j+1] = Integer.parseInt(data.split(" ")[1]);

        while (true) {
            data = sc.nextLine();

            if (data.equals("")) {
                break;
            }

            array_result[i][j+2+k] = Integer.parseInt(data.split(" ")[0]);
            array_result[i][j+3+k] = Integer.parseInt(data.split(" ")[1]);

            k += 2;
        }

        int r1 = array_result[0][0];
        int r2 = array_result[0][1];

        double result = 1 / ((r2 + r1) / (r1 * r2));

        System.out.println(result);
    }
}