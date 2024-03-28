
```
import sys

s = []
for line in sys.stdin:
    s.append(line.strip())

r = [0] * len(s)
flag = [True] * len(s)

for i in range(len(s)):
    for j in range(i+1, len(s)):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_index = 0
for i in range(len(s)):
    if r[max_index] < r[i]:
        max_index = i

print(s[max_index], end=' ')

max_index = 0
for i in range(len(s)):
    if len(s[max_index]) < len(s[i]):
        max_index = i

print(s[max_index])
```

## 30. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00030
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 31. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00031
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 32. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00032
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 33. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00033
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 34. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00034
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 35. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00035
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 36. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00036
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 37. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00037
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1[] = s.split(" ");
        System.out.println(s1.length);
    }
}
```

## 38. 
Write a program to find the number of words in a sentence.

### Input
The input contains a sentence.

### Output
Print the number of words in the sentence.

### Sample Input
```
Hello World
```

### Sample Output
```
2
```

### Hint
```
import java.util.Scanner;

public class p00038
{
    public static void main(String atg[])
    {
        Scanner sc = new Scanner(
