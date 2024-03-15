
```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double theta_h = 2.5 * Math.PI - (2 * Math.PI * ((h + (m / 60.0)) / 12));
        double theta_m = 2.5 * Math.PI - (2 * Math.PI * (m / 60.0));
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);
        System.out.println(Math.sqrt(Math.pow(x_h - x_m, 2) + Math.pow(y_h - y_m, 2)));
    }
}
```

## 2.

Write a program that takes a number and prints its digits in reverse order.

```
Input:
12345

Output:
54321
```

```
Input:
123456789

Output:
987654321
```

```
Input:
1234567890

Output:
0987654321
```

```
Input:
12345678901

Output:
10987654321
```

```
Input:
123456789012

Output:
210987654321
```

```
Input:
1234567890123

Output:
3210987654321
```

```
Input:
12345678901234

Output:
43210987654321
```

```
Input:
123456789012345

Output:
543210987654321
```

```
Input:
1234567890123456

Output:
6543210987654321
```

```
Input:
12345678901234567

Output:
76543210987654321
```

```
Input:
123456789012345678

Output:
876543210987654321
```

```
Input:
1234567890123456789

Output:
9876543210987654321
```

```
Input:
12345678901234567890

Output:
09876543210987654321
```

```
Input:
123456789012345678901

Output:
109876543210987654321
```

```
Input:
1234567890123456789012

Output:
2109876543210987654321
```

```
Input:
12345678901234567890123

Output:
32109876543210987654321
```

```
Input:
123456789012345678901234

Output:
432109876543210987654321
```

```
Input:
1234567890123456789012345

Output:
5432109876543210987654321
```

```
Input:
12345678901234567890123456

Output:
65432109876543210987654321
```

```
Input:
123456789012345678901234567

Output:
765432109876543210987654321
```

```
Input:
1234567890123456789012345678

Output:
8765432109876543210987654321
```

```
Input:
12345678901234567890123456789

Output:
98765432109876543210987654321
```

```
Input:
123456789012345678901234567890

Output:
098765432109876543210987654321
```

```
Input:
1234567890123456789012345678901

Output:
1098765432109876543210987654321
```

```
Input:
12345678901234567890123456789012

Output:
21098765432109876543210987654321
```

```
Input:
123456789012345678901234567890123

Output:
321098765432109876543210987654321
```

```
Input:
1234567890123456789012345678901234

Output:
4321098765432109876543210987654321
```

```
Input:
12345678901234567890123456789012
