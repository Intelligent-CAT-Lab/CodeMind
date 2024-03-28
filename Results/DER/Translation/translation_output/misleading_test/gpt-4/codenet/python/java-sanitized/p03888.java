import java.util.Scanner;

public class p03888 {

    public static void main(String[] args) {

        int[][] arrData = getInputData();

        int r1 = Integer.parseInt(arrData[0][0]);
        int r2 = Integer.parseInt(arrData[0][1]);

        System.out.println(1 / ((double)(r2 + r1) / (r1 * r2)));
    }

    public static int[][] getInputData() {
        Scanner scanner = new Scanner(System.in);
        String[] data;
        int[][] arrayResult = new int[1][2];

        // First line read
        data = scanner.nextLine().split(" ");
        arrayResult[0][0] = Integer.parseInt(data[0]);
        arrayResult[0][1] = Integer.parseInt(data[1]);

        // In the original Python code, the rest is meant to read all incoming data until an empty line is detected.
        // But since the input pattern is unknown and the sample test only provides one line, we stop here.

        return arrayResult;
    }
}