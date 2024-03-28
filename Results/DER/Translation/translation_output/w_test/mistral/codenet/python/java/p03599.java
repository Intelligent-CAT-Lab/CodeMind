<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 10 20 15 200

Expected output:
110 10


```
a,b,c,d,e,f=map(int,input().split())
maxsugar=0
maxwater=100*a
for i in range(31):
    for j in range(31):
        for k in range(3001):
            water=100*a*i+100*b*j
            sugar=c*k
            if water+sugar>f:
                continue
            if sugar>(a*i+b*j)*e:
                continue
            sugar+=min((f-(water+sugar))//d*d,((a*i+b*j)*e-c*k)//d*d)
            if 100*maxsugar*(water+sugar)<100*sugar*(maxsugar+maxwater):
                maxsugar=sugar
                maxwater=water
print(maxsugar+maxwater,maxsugar)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for (int i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
        int maxSugar = 0;
        int maxWater = 100 * a[0];
        for (int i = 0; i < 31; i++) {
            for (int j = 0; j < 31; j++) {
                for (int k = 0; k < 3001; k++) {
                    int water = 100 * a[0] * i + 100 * a[1] * j;
                    int sugar = a[2] * k;
                    if (water + sugar > a[5]) {
                        continue;
                    }
                    if (sugar > (a[0] * i + a[1] * j) * a[3]) {
                        continue;
                    }
                    sugar += Math.min((a[5] - (water + sugar)) / (a[4] * a[4]), ((a[0] * i + a[1] * j) * a[3] - a[2] * k) / (a[4] * a[4]));
                    if (100 * maxSugar * (water + sugar) < 100 * sugar * (maxSugar + maxWater)) {
                        maxSugar = sugar;
                        maxWater = water;
                    }
                }
            }
        }
        System.out.println(maxSugar + maxWater + " " + maxSugar);
    }
}
```</s>
