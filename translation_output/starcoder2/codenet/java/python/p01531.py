
```
in = [["wa","nn","wo",""],["a","u","o","i","e"],["ka","ku","ko","ki","ke"],["sa","su","so","si","se"],["ta","tu","to","ti","te"],["na","nu","no","ni","ne"],["ha","hu","ho","hi","he"],["ma","mu","mo","mi","me"],["ya","yu","yo",""],["ra","ru","ro","ri","re"]]
while True:
    try:
        fl = input()
        for i in range(0,len(fl),2):
            c = 0
            if fl[i+1] == 'T':
                c = 0
            elif fl[i+1] == 'L':
                c = 3
            elif fl[i+1] == 'U':
                c = 1
            elif fl[i+1] == 'R':
                c = 4
            elif fl[i+1] == 'D':
                c = 2
            print(in[int(fl[i])][c],end='')
        print()
    except:
        break
```

## 01532

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01532{
    public static void main(String[] args){
        new p01532().run();
    }
    public void run(){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = scan.nextInt();
            }
            int[] b = new int[n];
            for(int i = 0;i < n;i++){
                b[i] = scan.nextInt();
            }
            int[] c = new int[n];
            for(int i = 0;i < n;i++){
                c[i] = scan.nextInt();
            }
            int[] d = new int[n];
            for(int i = 0;i < n;i++){
                d[i] = scan.nextInt();
            }
            int[] e = new int[n];
            for(int i = 0;i < n;i++){
                e[i] = scan.nextInt();
            }
            int[] f = new int[n];
            for(int i = 0;i < n;i++){
                f[i] = scan.nextInt();
            }
            int[] g = new int[n];
            for(int i = 0;i < n;i++){
                g[i] = scan.nextInt();
            }
            int[] h = new int[n];
            for(int i = 0;i < n;i++){
                h[i] = scan.nextInt();
            }
            int[] i = new int[n];
            for(int j = 0;j < n;j++){
                i[j] = scan.nextInt();
            }
            int[] j = new int[n];
            for(int k = 0;k < n;k++){
                j[k] = scan.nextInt();
            }
            int[] k = new int[n];
            for(int l = 0;l < n;l++){
                k[l] = scan.nextInt();
            }
            int[] l = new int[n];
            for(int m = 0;m < n;m++){
                l[m] = scan.nextInt();
            }
            int[] m = new int[n];
            for(int o = 0;o < n;o++){
                m[o] = scan.nextInt();
            }
            int[] o = new int[n];
            for(int p = 0;p < n;p++){
                o[p] = scan.nextInt();
            }
            int[] p = new int[n];
            for(int q = 0;q < n;q++){
                p[q] = scan.nextInt();
            }
            int[] q = new int[n];
            for(int r = 0;r < n;r++){
                q[r] = scan.nextInt();
            }
            int[] r = new int[n];
            for(int s = 0;s < n;s++){
                r[s] = scan.nextInt();
            }
            int[] s = new int[n];
            for(int t = 0;t < n;t++){
                s[t] = scan.nextInt();
            }
            int[] t = new int[n];
            for(int u = 0;u < n;u++){
                t[u] = scan.nextInt();
            }
            int[] u = new int[n];
            for(int v = 0;v < n;v++){
                u[v] = scan.nextInt();
            }
            int[] v = new int[n];
            for(int w = 0;w < n;w++){
                v[w] = scan.nextInt();
            }
            int[] w = new int[n];
            for(int x = 0;x < n;x++){
                w[x] = scan.nextInt();
            }
            int[] x = new int[n];
            for(int y = 0;y < n;y++){
                x[y] = scan.nextInt();
            }
            int[] y = new int[n];
            for(int z = 0;z < n;z++){
                y[z] = scan.nextInt();
            }
            int[] z = new int[n];
            for(int A = 0;A < n;A++){
                z[A] = scan.nextInt();
            }
            int[] A = new int[n];
            for(int B = 0;B < n;B++){
                A[B] = scan.nextInt();
            }
            int[] B = new int[n];
            for(int C = 0;C < n;C++){
                B[C] = scan.nextInt();
            }
            int[] C = new int[n];
            for(int D = 0;D < n;D++){
                C[D] = scan.nextInt();
            }
            int[] D = new int[n];
            for(int E = 0;E < n;E++){
                D[E] = scan.nextInt();
            }
            int[] E = new int[n];
            for(int F = 0;F < n;F++){
                E[F] = scan.nextInt();
            }
            int[] F = new int[n];
            for(int G = 0;G < n;G++){
                F[G] = scan.nextInt();
            }
            int[] G = new int[n];
            for(int H = 0;H <
