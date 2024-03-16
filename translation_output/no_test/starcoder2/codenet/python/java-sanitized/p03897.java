import java.util.*;
public class p03897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans[][] = new int[n*n][2];
        int k = 0;
        for(int i = 0; i < n-1; i++){
            if(i%2 == 1){
                ans[k][0] = i;
                ans[k][1] = 0;
                k++;
            }
        }
        for(int i = 0; i < n-1; i++){
            if(i%6 == 1){
                for(int j = 2; j < n; j++){
                    if(j%2 == 0){
                        ans[k][0] = i;
                        ans[k][1] = j;
                        k++;
                    }
                }
            }
            if(i%6 == 4){
                for(int j = 0; j < n; j++){
                    if(j%2 == 1){
                        ans[k][0] = i;
                        ans[k][1] = j;
                        k++;
                    }
                }
            }
        }
        for(int j = 0; j < n; j++){
            if((n-1+j)%2 == 1){
                ans[k][0] = n-1;
                ans[k][1] = j;
                k++;
            }
        }
        System.out.println(k);
        for(int i = 0; i < k; i++){
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }
    }
}




import java.util.*;
public class p03897 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(a[i] == b[j]){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}

/2020-09-28/README.md
# 2020-09-28