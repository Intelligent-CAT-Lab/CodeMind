import java.util.*;

public class p02726 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] ans = new int[n-1];
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int a = j-i;
                int b = Math.abs((y-1)-j) + Math.abs(i-(x-1))+1;
                ans[Math.min(a,b)-1]++;
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.println(ans[i]);
        }
    }
}