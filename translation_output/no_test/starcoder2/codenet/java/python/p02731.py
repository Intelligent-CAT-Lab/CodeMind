
```
import math
L = int(input())
print(math.pow(L/3, 3))
```

## 2.7.32
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02732{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        System.out.println(N*2);
    }
}

```

python code:
```
N = int(input())
print(N*2)
```

## 2.7.33
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02733{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        System.out.println(N/2);
    }
}

```

python code:
```
N = int(input())
print(N/2)
```

## 2.7.34
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02741{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for(int i=1; i<=N; i++){
            System.out.println(i);
        }
    }
}

```

python code:
```
N = int(input())
for i in range(1, N+1):
    print(i)
```

## 2.7.35
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02742{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        for(int i=N; i>=1; i--){
            System.out.println(i);
        }
    }
}

```

python code:
```
N = int(input())
for i in range(N, 0, -1):
    print(i)
```

## 2.7.36
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02743{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        scan.close();
        System.out.println(S.length());
    }
}

```

python code:
```
S = input()
print(len(S))
```

## 2.7.37
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02753{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();
        if(N%4==0 && N%100!=0 || N%400==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}

```

python code:
```
N = int(input())
if N%4==0 and N%100!=0 or N%400==0:
    print(1)
else:
    print(0)
```

## 2.7.38
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02754{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        scan.close();
        if(S.equals("A+")){
            System.out.println(4.3);
        }else if(S.equals("A0")){
            System.out.println(4.0);
        }else if(S.equals("A-")){
            System.out.println(3.7);
        }else if(S.equals("B+")){
            System.out.println(3.3);
        }else if(S.equals("B0")){
            System.out.println(3.0);
        }else if(S.equals("B-")){
            System.out.println(2.7);
        }else if(S.equals("C+")){
            System.out.println(2.3);
        }else if(S.equals("C0")){
            System.out.println(2.0);
        }else if(S.equals("C-")){
            System.out.println(1.7);
        }else if(S.equals("D+")){
            System.out.println(1.3);
        }else if(S.equals("D0")){
            System.out.println(1.0);
        }else if(S.equals("D-")){
            System.out.println(0.7);
        }else{
            System.out.println(0.0);
        }
    }
}

```

python code:
```
S = input()
if S == "A+":
    print(4.3)
elif S == "A0":
    print(4.0)
elif S == "A-":
    print(3.7)
elif S == "B+":
    print(3.3)
elif S == "B0":
    print(3.0)
elif S == "B-":
    print(2.7)
elif S == "C+":
    print(2.3)
elif S == "C0":
    print(2.0)
elif S == "C-":
    print(1.7)
elif S == "D+":
    print(1.3)
elif S == "D0":
    print(1.0)
elif S == "D-":
    print(0.7)
else:
    print(0.0)
```

## 2.7.39
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02755{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        scan.close();
        if(S.equals("A+")){
            System.out.println(4.3);
        }else if(S.equals("A0")){
            System.out.println(4.0);
        }else if(S.equals("A-")){
            System.out.println(3.7);
        }else if(S.equals("B+")){
            System.out.println(3.3);
        }else if(S.equals("B0")){
            System.out.println(3.0);
        }else if(S.equals("B-")){
            System.out.println(2.7);
        }else if(S.equals("C+")){
            System.out.println(2.3);
        }else if(S.equals("C0")){
            System.out.println(2.0);
        }else if(S.equals("C-")){
            System.out.println(1.7);
        }else if(S.equals("D+")){
            System.out.println(1.3);
        }else if(S.equals("D0")){
            System.out.println(1.0);
        }else if(S.equals("D-")){
            System.out.println(0.7);
        
