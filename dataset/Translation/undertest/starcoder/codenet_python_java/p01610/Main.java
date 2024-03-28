import java.util.*;
public class p01610 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[][] arr = new String[6][8];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 8; j++) {
                arr[i][j] = ".";
            }
        }
        arr[0][3] = arr[2][3] = arr[3][3] = arr[4][3] = arr[5][3] = ".";
        arr[4][3] = arr[3][6] = arr[2][6] = arr[0][3] = arr[1][3] = ".";
        arr[2][4] = arr[3][4] = arr[3][5] = arr[2][5] = arr[2][4] = ".";
        arr[0][2] = arr[2][5] = arr[3][5] = arr[5][3] = arr[5][2] = ".";
        arr[5][3] = arr[3][0] = arr[2][0] = arr[0][2] = arr[0][3] = ".";
        arr[2][6] = arr[3][6] = arr[3][7] = arr[2][7] = arr[2][6] = ".";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                String temp = arr[0][3];
                arr[0][3] = arr[2][3];
                arr[2][3] = arr[3][3];
                arr[3][3] = arr[4][3];
                arr[4][3] = arr[5][3];
                arr[5][3] = temp;

                temp = arr[4][3];
                arr[4][3] = arr[3][6];
                arr[3][6] = arr[2][6];
                arr[2][6] = arr[0][3];
                arr[0][3] = arr[1][3];
                arr[1][3] = temp;

                temp = arr[2][4];
                arr[2][4] = arr[3][4];
                arr[3][4] = arr[3][5];
                arr[3][5] = arr[2][5];
                arr[2][5] = arr[2][4];
            }
            else if(s.charAt(i) == 'L') {
                String temp = arr[0][2];
                arr[0][2] = arr[3][7];
                arr[3][7] = arr[2][7];
                arr[2][7] = arr[0][2];
                arr[0][2] = arr[1][2];
                arr[1][2] = temp;

                temp = arr[4][2];
                arr[4][2] = arr[2][2];
                arr[2][2] = arr[3][2];
                arr[3][2] = arr[3][7];
                arr[3][7] = arr[4][2];
                arr[4][2] = temp;

                temp = arr[2][1];
                arr[2][1] = arr[2][0];
                arr[2][0] = arr[3][0];
                arr[3][0] = arr[3][1];
                arr[3][1] = arr[2