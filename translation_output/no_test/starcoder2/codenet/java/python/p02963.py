
```
s = int(input())
a = 1000000000
print("0 0", a, "1", (a-s%a)%a, ((s-1)//a+1))
```

## p02964

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02964{
    public static void main(String[]i){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),k=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        int[]b=new int[m];
        for(int i=0;i<m;i++)b[i]=s.nextInt();
        int[]c=new int[k];
        for(int i=0;i<k;i++)c[i]=s.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int x=0,y=0,z=0;
        while(x<n&&y<m&&z<k){
            if(a[x]==b[y]&&b[y]==c[z]){
                System.out.println(a[x]);
                x++;y++;z++;
            }else if(a[x]<b[y]){
                if(a[x]<c[z])x++;
                else z++;
            }else if(b[y]<c[z]){
                y++;
            }else z++;
        }
    }
}
```

python code:
```
n, m, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
a.sort()
b.sort()
c.sort()
x = y = z = 0
while x < n and y < m and z < k:
    if a[x] == b[y] and b[y] == c[z]:
        print(a[x])
        x += 1
        y += 1
        z += 1
    elif a[x] < b[y]:
        if a[x] < c[z]:
            x += 1
        else:
            z += 1
    elif b[y] < c[z]:
        y += 1
    else:
        z += 1
```

## p02965

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02965{
    public static void main(String[]i){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt(),k=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        int[]b=new int[m];
        for(int i=0;i<m;i++)b[i]=s.nextInt();
        int[]c=new int[k];
        for(int i=0;i<k;i++)c[i]=s.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int x=0,y=0,z=0;
        while(x<n&&y<m&&z<k){
            if(a[x]==b[y]&&b[y]==c[z]){
                x++;y++;z++;
            }else if(a[x]<b[y]){
                if(a[x]<c[z])x++;
                else z++;
            }else if(b[y]<c[z]){
                y++;
            }else z++;
        }
        System.out.println(n+m+k-x-y-z);
    }
}
```

python code:
```
n, m, k = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))
c = list(map(int, input().split()))
a.sort()
b.sort()
c.sort()
x = y = z = 0
while x < n and y < m and z < k:
    if a[x] == b[y] and b[y] == c[z]:
        x += 1
        y += 1
        z += 1
    elif a[x] < b[y]:
        if a[x] < c[z]:
            x += 1
        else:
            z += 1
    elif b[y] < c[z]:
        y += 1
    else:
        z += 1
print(n+m+k-x-y-z)
```

## p02966

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02966{
    public static void main(String[]i){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=s.nextInt();
        int[]b=new int[n];
        for(int i=0;i<n;i++)b[i]=s.nextInt();
        int[]c=new int[n];
        for(int i=0;i<n;i++)c[i]=s.nextInt();
        int[]d=new int[n];
        for(int i=0;i<n;i++)d[i]=s.nextInt();
        int[]e=new int[n];
        for(int i=0;i<n;i++)e[i]=s.nextInt();
        int[]f=new int[n];
        for(int i=0;i<n;i++)f[i]=s.nextInt();
        int[]g=new int[n];
        for(int i=0;i<n;i++)g[i]=s.nextInt();
        int[]h=new int[n];
        for(int i=0;i<n;i++)h[i]=s.nextInt();
        int[]i=new int[n];
        for(int j=0;j<n;j++)i[j]=s.nextInt();
        int[]j=new int[n];
        for(int k=0;k<n;k++)j[k]=s.nextInt();
        int[]k=new int[n];
        for(int l=0;l<n;l++)k[l]=s.nextInt();
        int[]l=new int[n];
        for(int m=0;m<n;m++)l[m]=s.nextInt();
        int[]m=new int[n];
        for(int o=0;o<n;o++)m[o]=s.nextInt();
        int[]o=new int[n];
        for(int p=0;p<n;p++)o[p]=s.nextInt();
        int[]p=new int[n];
        for(int q=0;q<n;q++)p[q]=s.nextInt();
        int[]q=new int[n];
        for(int r=0;r<n;r++)q[r]=s.nextInt();
        int[]r=new int[n];
        for(int t=0;t<n;t++)r[t]=s.nextInt();
        int[]t=new int[n];
        for(int u=0;u<n;u++)t[u]=s.nextInt();
        int[]u=new int[n];
        for(int v=0;v<n;v++)u[v]=s.nextInt();
        int[]
