
```
import java.util.*;
public class Main {
    static ArrayList<Long> l = new ArrayList<Long>();
    static long limit = 10000000000L;
    static void gen(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven);
        gen(number * 10 + 7, four, seven + 1);
    }
    static void main(String[] args) {
        gen(0, 0, 0);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1
```

```
Sample Input:

Apple

Sample Output:

1
```

```
Sample Input:

banana

Sample Output:

3
```

```
Sample Input:

mango

Sample Output:

0
```

```
Sample Input:

Orange

Sample Output:

3
```

```
Sample Input:

Pineapple

Sample Output:

4
```

```
Sample Input:

Strawberry

Sample Output:

5
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1
```

```
Sample Input:

Apple

Sample Output:

1
```

```
Sample Input:

banana

Sample Output:

3
```

```
Sample Input:

mango

Sample Output:

0
```

```
Sample Input:

Orange

Sample Output:

3
```

```
Sample Input:

Pineapple

Sample Output:

4
```

```
Sample Input:

Strawberry

Sample Output:

5
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

## 2.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1
```

```
Sample Input:

Apple

Sample Output:

1
```

```
Sample Input:

banana

Sample Output:

3
```

```
Sample Input:

mango

Sample Output:

0
```

```
Sample Input:

Orange

Sample Output:

3
```

```
Sample Input:

Pineapple

Sample Output:

4
```

```
Sample Input:

Strawberry

Sample Output:

5
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

## 3.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1
```

```
Sample Input:

Apple

Sample Output:

1
```

```
Sample Input:

banana

Sample Output:

3
```

```
Sample Input:

mango

Sample Output:

0
```

```
Sample Input:

Orange

Sample Output:

3
```

```
Sample Input:

Pineapple

Sample Output:

4
```

```
Sample Input:

Strawberry

Sample Output:

5
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

## 4.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1
```

```
Sample Input:

Apple

Sample Output:

1
```

```
Sample Input:

banana

Sample Output:

3
```

```
Sample Input:

mango

Sample Output:

0
```

```
Sample Input:

Orange

Sample Output:

3
```

```
Sample Input:

Pineapple

Sample Output:

4
```

```
Sample Input:

Strawberry

Sample Output:

5
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

```
Sample Input:

Peach

Sample Output:

2
```

## 5.

Write a program that reads a string and prints the number of times that the letter a (lowercase or uppercase) appears in the string.

```
Sample Input:

apple

Sample Output:

1
```

```
Sample Input:

Apple

Sample Output:

1
```

```
Sample Input
