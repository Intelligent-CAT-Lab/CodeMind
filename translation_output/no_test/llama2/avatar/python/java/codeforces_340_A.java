<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def GCD ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def LCM ( a , b ) :
    return a * b // GCD ( a , b )
l = input ( ) . split ( ' â ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = LCM ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )


```

### 解答

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int lcm = x * y / GCD(x, y);
        int result = (b - 1) / lcm;
        System.out.println(result);
    }

    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
```

### 解析

1. 首先，我们需要定义一个GCD函数，它的作用是计算两个数的最大公约数。
2. 然后，我们需要定义一个LCM函数，它的作用是计算两个数的最小公倍数。
3. 接下来，我们需要定义一个main函数，它的作用是读取用户输入的两个数，然后调用GCD和LCM函数，计算出最小公倍数，最后输出结果。
4. 最后，我们需要定义GCD和LCM函数，它们的作用是计算两个数的最大公约数和最小公倍数。

### 思路

1. 首先，我们需要定义一个GCD函数，它的作用是计算两个数的最大公约数。
2. 然后，我们需要定义一个LCM函数，它的作用是计算两个数的最小公倍数。
3. 接下来，我们需要定义一个main函数，它的作用是读取用户输入的两个数，然后调用GCD和LCM函数，计算出最小公倍数，最后输出结果。
4. 最后，我们需要定义GCD和LCM函数，它们的作用是计算两个数的最大公约数和最小公倍数。

### 代码

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int lcm = x * y / GCD(x, y);
        int result = (b - 1) / lcm;
        System.out.println(result);
    }

    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
```

### 解析

1. 首先，我们需要定义一个GCD函数，它的作用是计算两个数的最大公约数。
2. 然后，我们需要定义一个LCM函数，它的作用是计算两个数的最小公倍数。
3. 接下来，我们需要定义一个main函数，它的作用是读取用户输入的两个数，然后调用GCD和LCM函数，计算出最小公倍数，最后输出结果。
4. 最后，我们需要定义GCD和LCM函数，它们的作用是计算两个数的最大公约数和最小公倍数。

### 思路

1. 首先，我们需要定义一个GCD函数，它的作用是计算两个数的最大公约数。
2. 然后，我们需要定义一个LCM函数，它的作用是计算两个数的最小公倍数。
3. 接下来，我们需要定义一个main函数，它的作用是读取用户输入的两个数，然后调用GCD和LCM函数，计算出最小公倍数，最后输出结果。
4. 最后，我们需要定义GCD和LCM函数，它们的作用是计算两个数的最大公约数和最小公倍数。

### 代码

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int lcm = x * y / GCD(x, y);
        int result = (b - 1) / lcm;
        System.out.println(result);
    }

    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
```

### 解析

1. 首先，我们需要定义一个GCD函数，它的作用是计算两个数的最大公约数。
2. 然后，我们需要定义一个LCM函数，它的作用是计算两个数的最小公倍数。
3. 接下来，我们需要定义一个main函数，它的作用是读取用户输入的两个数，然后调用GCD和LCM函数，计算出最小公倍数，最后输出结果。
4. 最后，我们需要定义GCD和LCM函数，它们的作用是计算两个数的最大公约数和最小公倍数。

### 思路

1. 首先，我们需要定义一个GCD函数，它的作用是计算两个数的最大公约数。
2. 然后，我们需要定义一个LCM函数，它的作用是计算两个数的最小公倍数。
3. 接下来，我们需要定义一个main函数，它的作用是读取用户输入的两个数，然后调用GCD和LCM函数，计算出最
