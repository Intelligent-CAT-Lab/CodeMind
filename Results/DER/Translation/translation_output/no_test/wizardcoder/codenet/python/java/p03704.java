Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def f(d,x,y):n=int("9"*x+"0"*y);return d==0 if x<1 else sum(f(d+i*n,x-2,y+1)*(10-abs(i)-(y<1))for i in range(-9,10)if abs(d+i*n)<n)
D=input();print sum(f(D,i,0)*(10-i%2*9)for i in range(1,21))
```

### Response:
```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            int n = 9 * i + 0 * (20 - i);
            sum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }

    public static int f(int d, int x, int y) {
        int n = Integer.parseInt("9" + "0".repeat(y));
        if (x < 1) {
            return d == 0? 1 : 0;
        }
        int sum = 0;
        for (int i = -9; i <= 9; i++) {
            int temp = d + i * n;
            if (Math.abs(temp) >= n) {
                continue;
            }
            sum += f(temp, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1));
        }
        return sum;
    }
}
```<|endoftext|>
