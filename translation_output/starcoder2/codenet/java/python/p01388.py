
```
s = input()
c = [0,0,0,0]
for i in range(len(s)):
    if s[i] == 'K':
        c[0] += 1
    if s[i] == 'U':
        c[1] += 1
    if s[i] == 'P':
        c[2] += 1
    if s[i] == 'C':
        c[3] += 1
print(min(c))
```

## p01389
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01389 {
    
    void run(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int[] b = new int[n];
        for(int i=0;i<n;i++)b[i]=sc.nextInt();
        int[] c = new int[n];
        for(int i=0;i<n;i++)c[i]=sc.nextInt();
        int[] d = new int[n];
        for(int i=0;i<n;i++)d[i]=sc.nextInt();
        int[] e = new int[n];
        for(int i=0;i<n;i++)e[i]=sc.nextInt();
        int[] f = new int[n];
        for(int i=0;i<n;i++)f[i]=sc.nextInt();
        int[] g = new int[n];
        for(int i=0;i<n;i++)g[i]=sc.nextInt();
        int[] h = new int[n];
        for(int i=0;i<n;i++)h[i]=sc.nextInt();
        int[] i = new int[n];
        for(int j=0;j<n;j++)i[j]=sc.nextInt();
        int[] j = new int[n];
        for(int k=0;k<n;k++)j[k]=sc.nextInt();
        int[] k = new int[n];
        for(int l=0;l<n;l++)k[l]=sc.nextInt();
        int[] l = new int[n];
        for(int m=0;m<n;m++)l[m]=sc.nextInt();
        int[] m = new int[n];
        for(int o=0;o<n;o++)m[o]=sc.nextInt();
        int[] o = new int[n];
        for(int p=0;p<n;p++)o[p]=sc.nextInt();
        int[] p = new int[n];
        for(int q=0;q<n;q++)p[q]=sc.nextInt();
        int[] q = new int[n];
        for(int r=0;r<n;r++)q[r]=sc.nextInt();
        int[] r = new int[n];
        for(int s=0;s<n;s++)r[s]=sc.nextInt();
        int[] s = new int[n];
        for(int t=0;t<n;t++)s[t]=sc.nextInt();
        int[] t = new int[n];
        for(int u=0;u<n;u++)t[u]=sc.nextInt();
        int[] u = new int[n];
        for(int v=0;v<n;v++)u[v]=sc.nextInt();
        int[] v = new int[n];
        for(int w=0;w<n;w++)v[w]=sc.nextInt();
        int[] w = new int[n];
        for(int x=0;x<n;x++)w[x]=sc.nextInt();
        int[] x = new int[n];
        for(int y=0;y<n;y++)x[y]=sc.nextInt();
        int[] y = new int[n];
        for(int z=0;z<n;z++)y[z]=sc.nextInt();
        int[] z = new int[n];
        for(int aa=0;aa<n;aa++)z[aa]=sc.nextInt();
        int[] aa = new int[n];
        for(int bb=0;bb<n;bb++)aa[bb]=sc.nextInt();
        int[] bb = new int[n];
        for(int cc=0;cc<n;cc++)bb[cc]=sc.nextInt();
        int[] cc = new int[n];
        for(int dd=0;dd<n;dd++)cc[dd]=sc.nextInt();
        int[] dd = new int[n];
        for(int ee=0;ee<n;ee++)dd[ee]=sc.nextInt();
        int[] ee = new int[n];
        for(int ff=0;ff<n;ff++)ee[ff]=sc.nextInt();
        int[] ff = new int[n];
        for(int gg=0;gg<n;gg++)ff[gg]=sc.nextInt();
        int[] gg = new int[n];
        for(int hh=0;hh<n;hh++)gg[hh]=sc.nextInt();
        int[] hh = new int[n];
        for(int ii=0;ii<n;ii++)hh[ii]=sc.nextInt();
        int[] ii = new int[n];
        for(int jj=0;jj<n;jj++)ii[jj]=sc.nextInt();
        int[] jj = new int[n];
        for(int kk=0;kk<n;kk++)jj[kk]=sc.nextInt();
        int[] kk = new int[n];
        for(int ll=0;ll<n;ll++)kk[ll]=sc.nextInt();
        int[] ll = new int[n];
        for(int mm=0;mm<n;mm++)ll[mm]=sc.nextInt();
        int[] mm = new int[n];
        for(int nn=0;nn<n;nn++)mm[nn]=sc.nextInt();
        int[] nn = new int[n];
        for(int oo=0;oo<n;oo++)nn[oo]=sc.nextInt();
        int[] oo = new int[n];
        for(int pp=0;pp<n;pp++)oo[pp]=sc.nextInt();
        int[] pp = new int[n];
        for(int qq=0;qq<n;qq++)pp[qq]=sc.nextInt();
        int[] qq = new int[n];
        for(int rr=0;rr<n;rr++)qq[rr]=sc.nextInt();
        int[] rr = new int[n];
        for(int ss=0;ss<n;ss++)rr[ss]=sc.nextInt();
        int[] ss = new int[n];
        for(int tt=0;tt<n;tt++)ss[tt]=sc.nextInt();
        int[] tt = new int[n];
        for(int uu=0;uu<n;uu++)tt[uu]=sc.nextInt();
        int[] uu = new int[n];
        for(int vv=0;vv<n;vv++)uu[vv]=sc.nextInt();
        int[] vv = new int[n];
        for(int ww=0;ww<n;ww++)vv[ww]=sc.nextInt();
        int[] ww = new int[n];
        for(int xx=0;xx<n;xx
