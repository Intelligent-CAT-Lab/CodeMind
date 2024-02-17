import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(Math.abs(n-m) > 1){
            System.out.println(0);
            return;
        }
        long answer = 0;
        if(n == m){
            answer = solve(n,m);
            answer += solve(n,m);
        }
        else if(n > m){
            answer = solve(n,m);
        }
        else if(m > n){
            answer = solve(m,n);
        }
        answer %= 1000000007;
        System.out.println(answer);
    }
    public static long solve(int max,int x){
        long answer = 1;
        while(max != 1){
            //System.out.println("max = "+ max);
            answer *= max;
            answer %= 1000000007;
            answer *= x;
            answer %= 1000000007;
            max--;
            x--;
        }
        return answer;
    }
}
