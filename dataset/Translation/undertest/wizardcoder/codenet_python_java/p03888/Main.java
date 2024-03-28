import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // é
ååæå
        int[][] arr_data = new int[100][100];
        int i = 0, j = 0;

        // ååæå
        String input = sc.nextLine();
        String[] arr_temp = input.split(" ");
        arr_data[i][j] = Integer.parseInt(arr_temp[0]);
        arr_data[i][j+1] = Integer.parseInt(arr_temp[1]);
        j += 2;

        // ååæå
        while (true) {
            input = sc.nextLine();
            if (input.equals("")) {
                break;
            }
            arr_temp = input.split(" ");
            arr_data[i][j] = Integer.parseInt(arr_temp[0]);
            arr_data[i][j+1] = Integer.parseInt(arr_temp[1]);
            j += 2;
        }

        // ååæå
        int r1 = arr_data[0][0];
        int r2 = arr_data[0][1];

        // ååæå
        double result =