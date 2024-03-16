<s> Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-
S = input()

s_frq_dict = {'a': 0, 'b': 0, 'c': 0}
for s in S:
    s_frq_dict[s] += 1

frqs = list(s_frq_dict.values())
if max(frqs) - min(frqs) <= 1:
    print('YES')
else:
    print('NO')




```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] s_frq_dict = new int[26];
        for (char s : S.toCharArray()) {
            s_frq_dict[s - 'a']++;
        }
        int max = 0, min = 0;
        for (int i : s_frq_dict) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 最后，我们需要判断最大值和最小值之间的差值是否小于等于1，如果是，则输出YES，否则输出NO。

### 思路

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 最后，我们需要判断最大值和最小值之间的差值是否小于等于1，如果是，则输出YES，否则输出NO。

### 代码

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 最后，我们需要判断最大值和最小值之间的差值是否小于等于1，如果是，则输出YES，否则输出NO。

### 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] s_frq_dict = new int[26];
        for (char s : S.toCharArray()) {
            s_frq_dict[s - 'a']++;
        }
        int max = 0, min = 0;
        for (int i : s_frq_dict) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 最后，我们需要判断最大值和最小值之间的差值是否小于等于1，如果是，则输出YES，否则输出NO。

### 思路

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 最后，我们需要判断最大值和最小值之间的差值是否小于等于1，如果是，则输出YES，否则输出NO。

### 代码

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 最后，我们需要判断最大值和最小值之间的差值是否小于等于1，如果是，则输出YES，否则输出NO。

### 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] s_frq_dict = new int[26];
        for (char s : S.toCharArray()) {
            s_frq_dict[s - 'a']++;
        }
        int max = 0, min = 0;
        for (int i : s_frq_dict) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为字符数组，然后遍历字符数组，将每个字符转换为字符串，然后将字符串转换为整数，然后将整数加入到字典中。
2. 然后，我们需要将字典中的每个键值对转换为整数数组，然后计算最大值和最小值。
3. 
