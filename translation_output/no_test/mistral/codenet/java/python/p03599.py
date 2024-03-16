<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03599 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextInt();
		double B = sc.nextInt();
		double C = sc.nextInt();
		double D = sc.nextInt();
		double E = sc.nextInt();
		double F = sc.nextInt();
		double ans1 = A * 100;
		double ans2 = 0;
		for(int a = 0; a <= F / (A * 100); a++) {
			for(int b = 0; b <= F / (B * 100); b++) {
				for(int c = 0; c <= F / C; c++) {
					for(int d = 0; d <= F / D; d++) {
						if(100 * a * A + 100 * b * B + C * c + D * d <= F && (double)(C * c + D * d) / (double)(a * A * 100 + b * B * 100) <= (double)E / (double)100) {
							if(a == 0 && b == 0) continue;
							if((double)ans2 / (double)ans1 < (double)(C * c + D * d) / (double)(100 * a * A + 100 * b * B + C * c + D * d)) {
								ans1 = 100 * a * A + 100 * b * B + C * c + D * d;
								ans2 = C * c + D * d;
							}
						}
					}
				}
			}
		}
		System.out.println((int)ans1 + " " + (int)ans2);

	}
}

```
[/INST]
```python
import sys

A, B, C, D, E, F = map(int, input().split())
ans1, ans2 = 0, 0
for a in range(F // (A * 100) + 1):
    for b in range(F // (B * 100) + 1):
        for c in range(F // C + 1):
            for d in range(F // D + 1):
                if 100 * a * A + 100 * b * B + C * c + D * d <= F and (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d) <= E / 100:
                    if a == 0 and b == 0:
                        continue
                    if (ans2 / ans1) < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                        ans1, ans2 = 100 * a * A + 100 * b * B + C * c + D * d, C * c + D * d
print(int(ans1) + int(ans2))
```</s>
