

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int[] a = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            a[i] = Integer.parseInt(x[i]);
        }
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print(min + " ");
        if (Math.abs(a[0] - a[1]) >= 2) {
            System.out.println(Math.abs(a[0] - a[1]) / 2);
        } else {
            System.out.println(0);
        }
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findMax(a));
    }

    /**
     * 找出数组中最大的那个元素
     *
     * @param array 给定的数组
     * @return 数组中最大的那个元素
     */
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其粘贴到下方的代码框中。
// 请在这里编写你的代码，并将其
