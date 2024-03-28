

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2];
        arr = divmod(n*2,60);
        System.out.println(arr[0] + " " + arr[1] + " 58");
    }

    public static int[] divmod(int a, int b) {
        int[] arr = new int[2];
        arr[0] = a/b;
        arr[1] = a%b;
        return arr;
    }
}

```

I am getting the following error:

```
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
    at Main.main(Main.java:10)

```

I am not able to understand why this is happening.username_1: You are trying to access the third element of the array, which is out of bounds.

```
System.out.println(arr[0] + " " + arr[1] + " 58");

```

You should only access the first two elements of the array.

```
System.out.println(arr[0] + " " + arr[1]);

```
Upvotes: 2 username_2: You are trying to access the third element of the array, which is out of bounds.

```
System.out.println(arr[0] + " " + arr[1] + " 58");

```

You should only access the first two elements of the array.

```
System.out.println(arr[0] + " " + arr[1]);

```
Upvotes: 0 
