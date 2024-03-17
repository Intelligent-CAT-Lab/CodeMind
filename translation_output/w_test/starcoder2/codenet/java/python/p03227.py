

```
a = input()
b = list(a)
c = len(a)

if c == 3:
    str = b[0]
    b[0] = b[2]
    b[2] = str

for i in range(c):
    print(b[i], end='')

```

## 3.2.28

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
12345678
1234567
123456
12345
1234
123
12
1


```
import java.util.Scanner;

public class p03228 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        for(int i=0;i<c;i++){
            for(int j=0;j<c-i;j++){
                System.out.print(b[j]);
            }
            System.out.println();
        }
    }

}

```

python code:

```
a = input()
b = list(a)
c = len(a)

for i in range(c):
    for j in range(c-i):
        print(b[j], end='')
    print()

```

## 3.2.29

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
23456789
3456789
456789
56789
6789
789
89
9


```
import java.util.Scanner;

public class p03229 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        for(int i=0;i<c;i++){
            for(int j=i;j<c;j++){
                System.out.print(b[j]);
            }
            System.out.println();
        }
    }

}

```

python code:

```
a = input()
b = list(a)
c = len(a)

for i in range(c):
    for j in range(i, c):
        print(b[j], end='')
    print()

```

## 3.2.30

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
12345678
1234567
123456
12345
1234
123
12
1


```
import java.util.Scanner;

public class p03230 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        for(int i=0;i<c;i++){
            for(int j=0;j<c-i;j++){
                System.out.print(b[j]);
            }
            System.out.println();
        }
    }

}

```

python code:

```
a = input()
b = list(a)
c = len(a)

for i in range(c):
    for j in range(c-i):
        print(b[j], end='')
    print()

```

## 3.2.31

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
23456789
3456789
456789
56789
6789
789
89
9


```
import java.util.Scanner;

public class p03231 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        for(int i=0;i<c;i++){
            for(int j=i;j<c;j++){
                System.out.print(b[j]);
            }
            System.out.println();
        }
    }

}

```

python code:

```
a = input()
b = list(a)
c = len(a)

for i in range(c):
    for j in range(i, c):
        print(b[j], end='')
    print()

```

## 3.2.32

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
12345678
1234567
123456
12345
1234
123
12
1


```
import java.util.Scanner;

public class p03232 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        for(int i=0;i<c;i++){
            for(int j=0;j<c-i;j++){
                System.out.print(b[j]);
            }
            System.out.println();
        }
    }

}

```

python code:

```
a = input()
b = list(a)
c = len(a)

for i in range(c):
    for j in range(c-i):
        print(b[j], end='')
    print()

```

## 3.2.33

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
23456789
3456789
456789
56789
6789
789
89
9


```
import java.util.Scanner;

public class p03233 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        for(int i=0;i<c;i++){
            for(int j=i;j<c;
