import java.util.*;
public class p02625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[n+1];
        d[0] = 1;
        for(int i = 0; i < n; i++){
            d[i+1] = ((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(1000000007);
        }
        System.out.println(d[n]);
    }
}




Can anyone help me with this?username_1: You can use `str.split` to split the string into a list of strings, then use `int` to convert each string to an integer.


n, m = map(int, input().split())


Upvotes: 2 username_2: You can use `split()` to split the input into a list of strings, then use `int()` to convert each string to an integer.


n, m = map(int, input().split())


Upvotes: 0