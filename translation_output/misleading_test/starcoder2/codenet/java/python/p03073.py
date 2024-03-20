

```python
tail = input()
n = len(tail)
tailsp = list(tail)
zero = '0'
one = '1'
count = 0
for i in range(n):
    if i % 2 == 0 and tailsp[i] == zero:
        count += 1
    if i % 2 == 1 and tailsp[i] == one:
        count += 1
n -= count
if count > n:
    print(n)
else:
    print(count)
```

## 03074

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class p03074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] numsp = num.split("");
        int n = numsp.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(numsp[i].equals("0")){
                count ++;
            }
        }
        if(count == n){
            System.out.print(0);
        }else{
            for(int i=0;i<n;i++){
                if(numsp[i].equals("0")){
                    continue;
                }else{
                    System.out.print(numsp[i]);
                }
            }
        }
    }
    
}
```

python code:

```python
num = input()
numsp = list(num)
n = len(numsp)
count = 0
for i in range(n):
    if numsp[i] == '0':
        count += 1
if count == n:
    print(0)
else:
    for i in range(n):
        if numsp[i] == '0':
            continue
        else:
            print(numsp[i], end='')
```

## 03075

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class p03075 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] numsp = num.split("");
        int n = numsp.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(numsp[i].equals("0")){
                count ++;
            }
        }
        if(count == n){
            System.out.print(0);
        }else{
            for(int i=0;i<n;i++){
                if(numsp[i].equals("0")){
                    continue;
                }else{
                    System.out.print(numsp[i]);
                }
            }
        }
    }
    
}
```

python code:

```python
num = input()
numsp = list(num)
n = len(numsp)
count = 0
for i in range(n):
    if numsp[i] == '0':
        count += 1
if count == n:
    print(0)
else:
    for i in range(n):
        if numsp[i] == '0':
            continue
        else:
            print(numsp[i], end='')
```

## 03076

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class p03076 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] numsp = num.split("");
        int n = numsp.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(numsp[i].equals("0")){
                count ++;
            }
        }
        if(count == n){
            System.out.print(0);
        }else{
            for(int i=0;i<n;i++){
                if(numsp[i].equals("0")){
                    continue;
                }else{
                    System.out.print(numsp[i]);
                }
            }
        }
    }
    
}
```

python code:

```python
num = input()
numsp = list(num)
n = len(numsp)
count = 0
for i in range(n):
    if numsp[i] == '0':
        count += 1
if count == n:
    print(0)
else:
    for i in range(n):
        if numsp[i] == '0':
            continue
        else:
            print(numsp[i], end='')
```

## 03077

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class p03077 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] numsp = num.split("");
        int n = numsp.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(numsp[i].equals("0")){
                count ++;
            }
        }
        if(count == n){
            System.out.print(0);
        }else{
            for(int i=0;i<n;i++){
                if(numsp[i].equals("0")){
                    continue;
                }else{
                    System.out.print(numsp[i]);
                }
            }
        }
    }
    
}
```

python code:

```python
num = input()
numsp = list(num)
n = len(numsp)
count = 0
for i in range(n):
    if numsp[i] == '0':
        count += 1
