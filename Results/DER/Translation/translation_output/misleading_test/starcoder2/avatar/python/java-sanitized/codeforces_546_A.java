import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= w; i++) {
            sum += k * i;
        }
        if (sum <= n) {
            System.out.println(0);
        } else {
            System.out.println(sum - n);
        }
    }
}




import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println(max - min);
    }
}

/src/main/java/com/github/hcsp/controlflow/Main.md
# 最大的差值

请实现一个方法，对于给定的数组，返回最大的差值。

例如：

- `[1,2,5,4,10]`，最大差值是`10-1=9`
- `[1,2,5,4,10,100]`，最大差值是`100-1=99`
- `[1,2,5,4,10,100,1000]`，最大差值是`1000-1=999`

在提交Pull Request之前，你应当在本地确保所有代码已经编译通过，并且通过了测试(`mvn clean verify`)

-----
注意！我们只允许你修改以下文件，对其他文件的修改会被拒绝：
- [src/main/java/com/github/hcsp/controlflow/Main.java](https://github.com/hcsp/fix-max-min-difference/blob/master/src/main/java/com/github/hcsp/controlflow/Main.java)
-----


Translate the following python code to java and enclose your solution inside .
A sample test case is provided below:

Test input:
1 2 5 4 10 100 1000

Expected output:
999


a = [ int ( i ) for i in input ( ) . strip ( ) . split ( ) ]
print ( max ( a ) - min ( a ) )