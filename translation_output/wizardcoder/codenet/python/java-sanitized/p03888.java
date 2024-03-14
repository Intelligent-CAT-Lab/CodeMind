import java.util.Scanner;

public class p03888 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // é
ååæå
        int[][] array_result = new int[100][100];
        int i = 0, j = 0;

        String data = sc.nextLine();

        while (!data.equals("")) {
            String[] temp = data.split(" ");
            for (int k = 0; k < temp.length; k++) {
                array_result[i][j] = Integer.parseInt(temp[k]);
                j++;
            }
            i++;
            j = 0;
            data = sc.nextLine();
        }

        int r1 = array_result[0][0];
        int r2 = array_result[0][1];

        System.out.println(