
```
s = input()
length = len(s)
count = 0
for i in range(length//2):
    a = s[i]
    b = s[length-1-i]
    if a != b:
        count += 1
print(count)
```

## 2837. 10진수를 2진수로 변환하기

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02837 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        System.out.println(s);
    }
}
```

python code:
```
n = int(input())
s = bin(n)
print(s)
```

## 2838. 2진수를 10진수로 변환하기

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02838 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s,2);
        System.out.println(n);
    }
}
```

python code:
```
s = input()
n = int(s,2)
print(n)
```

## 2839. 설탕 배달

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02839 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>=0){
            if(n%5 == 0){
                count += n/5;
                break;
            }
            n -= 3;
            count++;
        }
        if(n<0){
            count = -1;
        }
        System.out.println(count);
    }
}
```

python code:
```
n = int(input())
count = 0
while n>=0:
    if n%5 == 0:
        count += n//5
        break
    n -= 3
    count += 1
if n<0:
    count = -1
print(count)
```

## 2840. 나는 학급회장이다

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02840 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = k;
        for(int i=0;i<n;i++){
            index = (index+k)%n;
            System.out.print(arr[index]+" ");
        }
    }
}
```

python code:
```
n, k = map(int,input().split())
arr = list(map(int,input().split()))
index = k
for i in range(n):
    index = (index+k)%n
    print(arr[index],end=' ')
```

## 2841. 외계인의 기타 연주

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
import java.util.Stack;

public class p02841 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Stack<Integer>[] stack = new Stack[p+1];
        for(int i=1;i<=p;i++){
            stack[i] = new Stack<>();
        }
        int count = 0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            while(!stack[a].isEmpty() && stack[a].peek() > b){
                stack[a].pop();
                count++;
            }
            if(stack[a].isEmpty() || stack[a].peek() < b){
                stack[a].push(b);
                count++;
            }
        }
        System.out.println(count);
    }
}
```

python code:
```
n, p = map(int,input().split())
stack = [[] for _ in range(p+1)]
count = 0
for i in range(n):
    a, b = map(int,input().split())
    while stack[a] and stack[a][-1] > b:
        stack[a].pop()
        count += 1
    if not stack[a] or stack[a][-1] < b:
        stack[a].append(b)
        count += 1
print(count)
```

## 2845. 파티가 끝나고 난 뒤

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02845 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print((arr[i]-(l*p))+" ");
        }
    }
}
```

python code:
```
l, p = map(int,input().split())
n = int(input())
arr = list(map(int,input().split()))
for i in range(n):
    print(arr[i]-(l*p),end=' ')
```

## 2846. 오르막길

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02846 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int count = 0;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                count += arr[i] - arr[i-1];
            }else{
                max = Math.max(max,count);
                count = 0;
            }
        }
        max = Math.max(max,count);
        System.out.println(max);
    }
}
```

python code:
```
n = int(input())
arr = list(map(int,input().split()))
max = 0
count = 0
for i in range(1,n):
    if arr[i] > arr[i-1]:
        count += arr[i] - arr[i-1]
    else:
        max = max if max > count else count
        count = 0
max = max if max > count else count
print(max)
```

## 2847. 게임을 만든 동준이

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
