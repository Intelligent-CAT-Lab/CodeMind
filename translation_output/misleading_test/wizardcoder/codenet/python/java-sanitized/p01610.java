import java.util.*;
public class p01610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] arr = new String[6][8];
        for(int i=0;i<6;i++){
            String str = sc.nextLine();
            for(int j=0;j<8;j++){
                arr[i][j] = str.charAt(j) + "";
            }
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='R'){
                rotateRight(arr);
            }else if(ch=='L'){
                rotateLeft(arr);
            }else if(ch=='U'){
                rotateUp(arr);
            }else if(ch=='D'){
                rotateDown(arr);
            }else if(ch=='F'){
                rotateFront(arr);
            }else{
                rotateBack(arr);
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<8;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void rotateRight(String[][] arr){
        String temp = arr[0][3];
        arr[0][3] = arr[2][3];
        arr[2][3] = arr[4][3];
        arr[4][3] = arr[3][3];
        arr[3][3] = temp;

        temp = arr[4][3];
        arr[4][3] = arr[3][6];
        arr[3][6] = arr[2][6];
        arr[2][6] = arr[0][3];
        arr[0][3] = temp;

        temp = arr[2][4];
        arr[2][4] = arr[3][4];
        arr[3][4] = arr[3][5];
        arr[3][5] = arr[2][5];
        arr[2][5] = temp;
    }
    public static void rotateLeft(String[][] arr){
        String temp = arr[0][2];
        arr[0][2] = arr[3][7];
        arr[3][7] = arr[4][2];
        arr[4][2] = arr[2][2];
        arr[2][2] = temp;

        temp = arr[4][2];
        arr[4][2] = arr[2][2];
        arr[2][2] = arr[3][2];
        arr[3][2] = arr[3][7];
        arr[3][7] = temp;

        temp = arr[2][1];
        arr[2][1] = arr[2][0];
        arr[2][0] = arr[3][0];
        arr[3][0] = arr[3][1];
        arr[3][1] = temp;
    }
    public static void rotateUp(String[][] arr){
        String temp = arr[2][0];
        arr[2][0] = arr[2][2];
        arr[2][2] = arr[2][4];
        arr[2][4] = arr[2][6];
        arr[2][6] = temp;

        temp = arr[2][4];
        arr[2][4] = arr[2][6];
        arr[2][6] = arr[2][0];
        arr[2][0] = arr[2