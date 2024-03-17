

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a-1)*(b-1));
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
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-max-of-array.md
# Max of array

Write a program to find the maximum element in an array.

## Input

The first line contains an integer ```n```, the size of the array.

The second line contains ```n``` space-separated integers ```a[i]```, each denoting the element of the array.

## Output

Print the maximum element in the array.

## Constraints

```1 <= n <= 1000```

```-1000 <= a[i] <= 1000```

## Sample Input 0

```
5
1 2 3 4 5
```

## Sample Output 0

```
5
```

## Explanation 0

The maximum element in the array is ```5```.

## Sample Input 1

```
5
-1 -2 -3 -4 -5
```

## Sample Output 1

```
-1
```

## Explanation 1

The maximum element in the array is ```-1```.

## Sample Input 2

```
5
1 2 3 4 5
```

## Sample Output 2

```
5
```

## Explanation 2

The maximum element in the array is ```5```.

## Sample Input 3

```
5
-1 -2 -3 -4 -5
```

## Sample Output 3

```
-1
```

## Explanation 3

The maximum element in the array is ```-1```.

## Sample Input 4

```
5
1 2 3 4 5
```

## Sample Output 4

```
5
```

## Explanation 4

The maximum element in the array is ```5```.

## Sample Input 5

```
5
-1 -2 -3 -4 -5
```

## Sample Output 5

```
-1
```

## Explanation 5

The maximum element in the array is ```-1```.

## Sample Input 6

```
5
1 2 3 4 5
```

## Sample Output 6

```
5
```

## Explanation 6

The maximum element in the array is ```5```.

## Sample Input 7

```
5
-1 -2 -3 -4 -5
```

## Sample Output 7

```
-1
```

## Explanation 7

The maximum element in the array is ```-1```.

## Sample Input 8

```
5
1 2 3 4 5
```

## Sample Output 8

```
5
```

## Explanation 8

The maximum element in the array is ```5```.

## Sample Input 9

```
5
-1 -2 -3 -4 -5
```

## Sample Output 9

```
-1
```

## Explanation 9

The maximum element in the array is ```-1```.

## Sample Input 10

```
5
1 2 3 4 5
```

## Sample Output 10

```
5
```

## Explanation 10

The maximum element in the array is ```5```.

## Sample Input 11

```
5
-1 -2 -3 -4 -5
```

## Sample Output 11

```
-1
```

## Explanation 11

The maximum element in the array is ```-1```.

## Sample Input 12

```
5
1 2 3 4 5
```

## Sample Output 12

```
5
```

## Explanation 12

The maximum element in the array is ```5```.

## Sample Input 13

```
5
-1 -2 -3 -4 -5
```

## Sample Output 13

```
-1
```

## Explanation 13

The maximum element in the array is ```-1```.

## Sample Input 14

```
5
1 2 3 4 5
```

## Sample Output 14

```
5
```

## Explanation 14

The maximum element in the array is ```5```.

## Sample Input 15

```
5
-1 -2 -3 -4 -5
```

## Sample Output 15

```
-1
```

## Explanation 15

The maximum element in the array is ```-1```.

## Sample Input 16

```
5
1 2 3 4 5
```

## Sample Output 16

```
5
```

## Explanation 16

The maximum element in the array is ```5```.

## Sample Input 17

```
5
-1 -2 -3 -4 -5
```

## Sample Output 17

```
-1
```

## Explanation 17

The maximum element in the array is ```-1```.

## Sample Input 18

```
5
1 2 3 4 5
```

## Sample Output 18

```
5
```

## Explanation 18

The maximum element in the array is ```5```.

## Sample Input 19

```
5
-1 -2 -3 -4 -5
```

## Sample Output 19

```
-1
```

## Explanation 19

The maximum element in the array is ```-1```.

## Sample Input 20

```
5
1 2 3 4 5
```

## Sample Output 20

```
5
```

## Explanation 20

The maximum element in the array is ```5```.

## Sample Input 21

```
5
-1 -2 -3 -4 -5
```

## Sample Output 21

```
-1
```

## Explanation 21

The maximum element in the array is ```-1```.

## Sample Input 22

```
5
1 2 3 4 5
```

## Sample Output 22

```
5
```

## Explanation 22

The maximum element in the array is ```5```.

## Sample Input 23

```
5
-1 -2 -3 -4 -5
```

## Sample Output 23

```
-1
```

## Explanation 23

The maximum element in the array is ```-1```.

## Sample Input 24

```
5
1 2 3 4 5
```

## Sample Output 24

```
5
```

## Explanation 24

The maximum element in the array is ```5```.

## Sample Input 25

```
5
-1 -2 -3 -4 -5
```

## Sample Output 25

```
-1
```

## Explanation 25

The maximum element in the array is ```-1```.

## Sample Input 26

```

