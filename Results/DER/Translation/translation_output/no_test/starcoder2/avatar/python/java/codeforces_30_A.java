
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] M = sc.nextLine().split(" ");
        int a = Integer.parseInt(M[0]);
        int b = Integer.parseInt(M[1]);
        int n = Integer.parseInt(M[2]);
        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No solution");
            } else {
                b = b / a;
                int x = 0;
                int y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x++;
                    }
                    if (y > b) {
                        System.out.println("No solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x--;
                        }
                        if (y < b) {
                            System.out.println("No solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No solution");
            }
        }
    }
}
```

## 3.

Write a program that reads a number and prints the sum of its digits.

### Input

The input is a single integer.

### Output

Print the sum of the digits of the number.

### Sample Input 1

```
12345
```

### Sample Output 1

```
15
```

### Sample Input 2

```
123456789
```

### Sample Output 2

```
45
```

### Sample Input 3

```
1234567890
```

### Sample Output 3

```
45
```

### Sample Input 4

```
12345678901234567890
```

### Sample Output 4

```
180
```

### Sample Input 5

```
1234567890123456789012345678901234567890
```

### Sample Output 5

```
360
```

### Sample Input 6

```
1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890
