import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      final long mod = 1_000_000_007L;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] p = br.readLine().split(" ");
System.out.println("[INST]8;p;br.readLine().split(' ');"+p);
System.out.println("[INST]8;None;br.readLine();"+br.readLine());
	  int h = Integer.parseInt(p[0]);
System.out.println("[INST]9;h;Integer.parseInt(p[0]);"+h);
	  int w = Integer.parseInt(p[1]);
System.out.println("[INST]10;w;Integer.parseInt(p[1]);"+w);
	  int k = Integer.parseInt(p[2]);
System.out.println("[INST]11;k;Integer.parseInt(p[2]);"+k);
      br.close();
	  long[][] a = new long[h+1][w+2];
	  long[] f = new long[w+2];
	  a[0][1] = 1; f[0] = 0; f[1] = f[2] = 1;
	  for (int i=3;i<w+2;i++) f[i] = f[i-1] + f[i-2];
	  for (int i=1;i<h+1;i++) for (int j=1;j<w+1;j++) a[i][j] = (f[j-1]*f[w-j+1]*a[i-1][j-1]%mod + f[j]*f[w-j+1]*a[i-1][j]%mod + f[j]*f[w-j]*a[i-1][j+1]%mod) % mod;
	  System.out.println(a[h][k]);
    }
}