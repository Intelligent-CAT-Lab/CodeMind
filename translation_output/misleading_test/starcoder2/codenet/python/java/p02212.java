

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();
        int[] sorted = new int[4];
        for (int i = 0; i < 4; i++) {
            int min = l[i];
            int minIndex = i;
            for (int j = i; j < 4; j++) {
                if (l[j] < min) {
                    min = l[j];
                    minIndex = j;
                }
            }
            sorted[i] = min;
            l[minIndex] = Integer.MAX_VALUE;
        }
        System.out.println(Math.abs((sorted[0] + sorted[3]) - (sorted[1] + sorted[2])));
    }
}

```

I am not sure if this is the best way to do it.

I am also not sure if I should use `Integer.MAX_VALUE` to replace the value of the array.

Is there a better way to do it?username_1: You can use `Arrays.sort()` to sort the array.

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[3]) - (l[1] + l[2])));
    }
}

```
Upvotes: 3 [selected_answer]username_2: You can use `Arrays.sort()` to sort the array.

```
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[4];
        for (int i = 0; i < 4; i++) {
            l[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[3]) - (l[1] + l[2])));
    }
}

```
Upvotes: 1 
