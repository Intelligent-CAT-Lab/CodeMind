import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();        int N = Integer.parseInt(newVariable_0);
        int[][] numArray = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                numArray[i][j] = 0;
            }
        }
        for(int i=1;i<=N;i++){
var newVariable_1 = String.valueOf(i).substring(0,1);var newVariable_2 = String.valueOf(i);            int topNum = Integer.parseInt(newVariable_2.substring(0,1));
            int bottomNum = i % 10;
            numArray[topNum][bottomNum]++;
        }
        int res = 0;
        for(int i=1;i<=N;i++){
var newVariable_3 = String.valueOf(i).substring(0,1);var newVariable_4 = String.valueOf(i);            int topNum = Integer.parseInt(newVariable_4.substring(0,1));
            int bottomNum = i % 10;
            res += numArray[bottomNum][topNum];
        }
        System.out.println(res);
    }
}
