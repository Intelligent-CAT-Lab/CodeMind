import java.util.*;
public class p01610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[][] arr = new String[6][8];
        arr[0][3] = arr[2][3] = arr[3][3] = arr[4][3] = arr[5][3] = arr[3][6] = arr[2][6] = arr[0][3] = arr[1][3] = arr[2][4] = arr[3][4] = arr[3][5] = arr[2][5] = arr[2][4] = arr[3][2] = arr[3][3] = arr[2][3] = arr[2][2] = s.charAt(0);
        arr[0][2] = arr[3][7] = arr[2][7] = arr[0][2] = arr[1][2] = arr[2][1] = arr[2][0] = arr[3][0] = arr[3][1] = arr[2][1] = arr[2][6] = arr[3][6] = arr[3][7] = arr[2][7] = arr[2][1] = s.charAt(1);
        arr[2][0] = arr[2][2] = arr[2][3] = arr[2][4] = arr[2][5] = arr[2][6] = arr[2][7] = arr[2][0] = arr[2][1] = arr[2][2] = arr[2][3] = arr[2][4] = arr[2][5] = arr[2][6] = arr[2][7] = s.charAt(2);
        arr[3][0] = arr[3][1] = arr[3][2] = arr[3][3] = arr[3][4] = arr[3][5] = arr[3][6] = arr[3][7] = arr[3][0] = arr[3][1] = arr[3][2] = arr[3][3] = arr[3][4] = arr[3][5] = arr[3][6] = arr[3][7] = s.charAt(3);
        arr[4][2] = arr[5][2] = arr[5][3] = arr[4][3] = arr[4][2] = arr[2][4] = arr[3][4] = arr[3][5] = arr[2][5] = arr[2][4] = arr[3][2] = arr[3][3] = arr[2][3] = arr[2][2] = s.charAt(4);
        arr[0][0] = arr[1][0] = arr[2][0] = arr[3][0] = arr[4][0] = arr[5][0] = arr[0][1] = arr[1][1] = arr[2][1] = arr[3][1] = arr[4][1] = arr[5][1] = arr[0][2] = arr[1][2] = arr[2][2] = arr[3][2] = arr[4][2] = arr[5][2] = s.charAt(5);
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}