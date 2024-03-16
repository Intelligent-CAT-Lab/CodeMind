import java.util.*;
public class p03329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> six = new ArrayList<>();
        List<Integer> nine = new ArrayList<>();
        for(int i=1;i<=7;i++){
            six.add((int)Math.pow(6,i));
            nine.add((int)Math.pow(9,i));
        }
        six.reverse();
        nine.reverse();
        int[][] dp = new int[N+1][2];
        for(int i=6;i<=N;i++){
            dp[i][0] = i;
            dp[i][1] = i;
            for(int j=0;j<six.size();j++){
                if(six.get(j)<=i){
                    dp[i][0] = Math.min(dp[i][0],dp[i-six.get(j)][0]+1);
                }
            }
            for(int j=0;j<nine.size();j++){
                if(nine.get(j)<=i){
                    dp[i][1] = Math.min(dp[i][1],dp[i-nine.get(j)][1]+1);
                }
            }
        }
        System.out.println(dp[N][0]);
    }
}