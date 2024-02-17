import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[][] numArray = new int[10][10];
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                numArray[i][j] = 0;
            }
        }
        for(int i=1;i<=N;i++){
            int topNum = Integer.parseInt(String.valueOf(i).substring(0,1));
            int bottomNum = i % 10;
            numArray[topNum][bottomNum]++;
        }
        int res = 0;
        for(int i=1;i<=N;i++){
            int topNum = Integer.parseInt(String.valueOf(i).substring(0,1));
            int bottomNum = i % 10;
            res += numArray[bottomNum][topNum];
        }
        System.out.println(res);
    }
}
