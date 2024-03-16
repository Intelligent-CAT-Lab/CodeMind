<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```

import sys
#sys.stdin=open("data.txt")
input=sys.stdin.readline
mii=lambda:map(int,input().split())

# n=4k+3 <=> the line graph works
# these fail: 1 2 4 8 16 32...

# 1 2 3 1 2 3
# 4 5 1 4 5
# 6 7 1 6 7

# so n=2k+1 (except n=1) works

def get(n):
    e=[]
    p=1
    while p*2<=n:
        p*=2
    if n!=p:
        # make line graph
        m=n
        while m%4!=3: m-=1
        for i in range(1,m):
            e.append([i,i+1])
            e.append([n+i,n+i+1])
        e.append([m,n+1])
        if n%4==1 or n%4==2:
            m=n
            if n%4==2: m-=1
            e.append([m-1,m])
            e.append([m,n+1])
            e.append([n+1,n+m-1])
            e.append([n+m-1,n+m])
        if n%4==0 or n%4==2:    # not a power of 2
            t=n-1
            e.append([n,t])
            for i in range(1,n+1):
                t^=i
                if t==n:
                    e.append([n+i,n+n])
                    break
    return e

n=int(input())
e=get(n)
if e:
    print("Yes")
    for i,j in e:
        print("%d %d"%(i,j))
else:
    print("No")

"""
def dfs(u):
    vis[u]=1
    root[u]^=(u-1)%n+1
    for v in g[u]:
        if vis[v]: continue
        root[v]=root[u]
        dfs(v)

for n in range(1,50):
    g=[[] for _ in range(2*n+1)]
    e=get(n)
    if not e: continue
    assert len(e)==n*2-1
    for i,j in e:
        g[i].append(j)
        g[j].append(i)
    for i in range(1,n+1):
        vis=[0]*(2*n+1)
        root=[0]*(2*n+1)
        dfs(i)
        assert root[n+i]==i
"""

```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static int[] root;
    static int[] vis;
    static ArrayList<Integer>[] g;
    static boolean[] vis2;
    static int[] p;
    static int[] q;
    static int[] r;
    static int[] s;
    static int[] t;
    static int[] u;
    static int[] v;
    static int[] w;
    static int[] x;
    static int[] y;
    static int[] z;
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int[] e;
    static int[] f;
    static int[] g1;
    static int[] g2;
    static int[] g3;
    static int[] g4;
    static int[] g5;
    static int[] g6;
    static int[] g7;
    static int[] g8;
    static int[] g9;
    static int[] g10;
    static int[] g11;
    static int[] g12;
    static int[] g13;
    static int[] g14;
    static int[] g15;
    static int[] g16;
    static int[] g17;
    static int[] g18;
    static int[] g19;
    static int[] g20;
    static int[] g21;
    static int[] g22;
    static int[] g23;
    static int[] g24;
    static int[] g25;
    static int[] g26;
    static int[] g27;
    static int[] g28;
    static int[] g29;
    static int[] g30;
    static int[] g31;
    static int[] g32;
    static int[] g33;
    static int[] g34;
    static int[] g35;
    static int[] g36;
    static int[] g37;
    static int[] g38;
    static int[] g39;
    static int[] g40;
    static int[] g41;
    static int[] g42;
    static int[] g43;
    static int[] g44;
    static int[] g45;
    static int[] g46;
    static int[] g47;
    static int[] g48;
    static int[] g49;
    static int[] g50;
    static int[] g51;
    static int[] g52;
    static int[] g53;
    static int[] g54;
    static int[] g55;
    static int[] g56;
    static int[] g57;
    static int[] g58;
    static int[] g59;
    static int[] g60;
    static int[] g61;
    static int[] g62;
    static int[] g63;
    static int[] g64;
    static int[] g65;
    static int[] g66;
    static int[] g67;
    static int[] g68;
    static int[] g69;
    static int[] g70;
    static int[] g71;
    static int[] g72;
    static int[] g73;
    static int[] g74;
    static int[] g75;
    static int[] g76;
    static int[] g77;
    static int[] g78;
    static int[] g79;
    static int[] g80;
    static int[] g81;
    static int[] g82;
    static int[] g83;
    static int[] g84;
    static int[] g85;
    static int[] g86;
    static int[] g87;
    static int[] g88;
    static int[] g89;
    static int[] g90;
    static int[] g91;
    static int[] g92;
    static int[] g93;
    static int[] g94;
    static int[] g95;
    static int[] g96;
    static int[] g97;
    static int[] g98;
    static int[] g99;
    static int[] g100;
    static int[] g101;
    static int[] g102;
    static int[] g103;
    static int[] g104;
    static int[] g105;
    static int[] g106;
    static int[] g107;
    static int[] g108;
    static int[] g109;
    static int[] g110;
    static int[] g111;
    static int[] g112;
    static int[] g113;
    static int[] g114;
    static int[] g115;
    static int[] g116;
    static int[] g117;
    static int[] g118;
    static int[] g119;
    static int[] g120;
    static int[] g121;
    static int[] g122;
    static int[] g123;
    static int[] g124;
    static int[] g125;
    static int[] g126;
    static int[] g127;
    static int[] g128;
    static int[] g129;
    static int[] g130;
    static int[] g131;
    static int[] g132;
    static int[] g133;
    static int[] g134;
    static int[] g135;
    static int[] g136;
    static int[] g137;
    static int[] g138;
    static int[] g139;
    static int[] g140;
    static int[] g141;
    static int[] g142;
    static int[] g143;
    static int[] g144;
    static int[] g145;
    static int[] g146;
    static int[] g147;
    static int[] g148;
    static int[] g149;
    static int[]
