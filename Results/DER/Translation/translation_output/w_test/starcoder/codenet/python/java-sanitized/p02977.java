import java.util.*;
import java.io.*;

public class p02977 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] g=new int[2*n+1][2*n+1];
        for(int i=1;i<=n;i++) {
            g[i][i]=1;
            g[i][i+n]=1;
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(g[i][j]==0) {
                    g[i][j]=1;
                    g[j][i]=1;
                }
            }
        }
        for(int i=1;i<=2*n;i++) {
            for(int j=1;j<=2*n;j++) {
                if(g[i][j]==1) {
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}