

```python
import math

def main():
    input_str = input()
    count = [0] * 26
    for c in input_str:
        count[ord(c) - ord('a')] += 1
    allow_odd = 0 if len(input_str) % 2 == 0 else 1
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i
    if allow_odd < odd_count:
        print(0)
        return
    if odd_pos != -1:
        count[odd_pos] -= 1
    for i in range(26):
        count[i] //= 2
    valid = 0
    for i in range(26):
        valid += count[i]
    sum = math.factorial(valid)
    for i in range(26):
        sum //= math.factorial(count[i])
    print(sum)

if __name__ == '__main__':
    main()
```

## 01474

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1


```
import java.util.Arrays;
import java.util.Scanner;
 
public class p01474{
    
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        
        int[] input = new int[10];
        for(int i = 0; i < 10; i++){
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        
        for(int i = 9; i >= 0; i--){
            System.out.print(input[i] + " ");
        }
    }
}
```

python code:

```python
def main():
    input_list = list(map(int, input().split()))
    input_list.sort()
    for i in range(9, -1, -1):
        print(input_list[i], end=' ')

if __name__ == '__main__':
    main()
```

## 01475

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.util.Arrays;
import java.util.Scanner;
 
public class p01475{
    
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        
        int[] input = new int[10];
        for(int i = 0; i < 10; i++){
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        
        for(int i = 0; i < 10; i++){
            System.out.print(input[i] + " ");
        }
    }
}
```

python code:

```python
def main():
    input_list = list(map(int, input().split()))
    input_list.sort()
    for i in range(10):
        print(input_list[i], end=' ')

if __name__ == '__main__':
    main()
```

## 01476

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1


```
import java.util.Arrays;
import java.util.Scanner;
 
public class p01476{
    
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        
        int[] input = new int[10];
        for(int i = 0; i < 10; i++){
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        
        for(int i = 9; i >= 0; i--){
            System.out.print(input[i] + " ");
        }
    }
}
```

python code:

```python
def main():
    input_list = list(map(int, input().split()))
    input_list.sort()
    for i in range(9, -1, -1):
        print(input_list[i], end=' ')

if __name__ == '__main__':
    main()
```

## 01477

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.util.Arrays;
import java.util.Scanner;
 
public class p01477{
    
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        
        int[] input = new int[10];
        for(int i = 0; i < 10; i++){
            input[i] = sc.nextInt();
        }
        
        Arrays.sort(input);
        
        for(int i = 0; i < 10; i++){
            System.out.print(input[i] + " ");
        }
    }
}
```

python code:

```python
def main():
    input_list = list(map(int, input().split()))
    input_list.sort()
    for i in range(10):
        print(input_list[i], end=' ')

if __name__ == '__main__':
    main()
```

## 01478

Translate the following java code to python and enclose your solution inside
