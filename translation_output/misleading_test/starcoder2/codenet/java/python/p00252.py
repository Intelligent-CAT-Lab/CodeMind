
```python
a = [int(x) for x in input().split()]
if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```

## p00253
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1

Expected output:
"Open"

```
import java.util.Scanner;
public class p00253 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = stdIn.nextInt();
        }
        if(a[0] == 1 && a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else {
            System.out.println("Close");
        }
        
    }

}
```

python code:
```python
a = [int(x) for x in input().split()]
if a[0] == 1 and a[1] == 1 and a[2] == 1:
    print("Open")
else:
    print("Close")
```

## p00254
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1

Expected output:
"Open"

```
import java.util.Scanner;
public class p00254 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = stdIn.nextInt();
        }
        if(a[0] == 1 && a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1 && a[1] == 1) {
            System.out.println("Open");
        }
        else if(a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else {
            System.out.println("Close");
        }
        
    }

}
```

python code:
```python
a = [int(x) for x in input().split()]
if a[0] == 1 and a[1] == 1 and a[2] == 1:
    print("Open")
elif a[0] == 1 and a[1] == 1:
    print("Open")
elif a[1] == 1 and a[2] == 1:
    print("Open")
elif a[0] == 1 and a[2] == 1:
    print("Open")
else:
    print("Close")
```

## p00255
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1

Expected output:
"Open"

```
import java.util.Scanner;
public class p00255 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = stdIn.nextInt();
        }
        if(a[0] == 1 && a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1 && a[1] == 1) {
            System.out.println("Open");
        }
        else if(a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1) {
            System.out.println("Open");
        }
        else if(a[1] == 1) {
            System.out.println("Open");
        }
        else if(a[2] == 1) {
            System.out.println("Open");
        }
        else {
            System.out.println("Close");
        }
        
    }

}
```

python code:
```python
a = [int(x) for x in input().split()]
if a[0] == 1 and a[1] == 1 and a[2] == 1:
    print("Open")
elif a[0] == 1 and a[1] == 1:
    print("Open")
elif a[1] == 1 and a[2] == 1:
    print("Open")
elif a[0] == 1 and a[2] == 1:
    print("Open")
elif a[0] == 1:
    print("Open")
elif a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
```

## p00256
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1

Expected output:
"Open"

```
import java.util.Scanner;
public class p00256 {
    
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = stdIn.nextInt();
        }
        if(a[0] == 1 && a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1 && a[1] == 1) {
            System.out.println("Open");
        }
        else if(a[1] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1 && a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 1) {
            System.out.println("Open");
        }
        else if(a[1] == 1) {
            System.out.println("Open");
        }
        else if(a[2] == 1) {
            System.out.println("Open");
        }
        else if(a[0] == 0 && a[1] == 0 && a[2] == 0) {
            System.out.println("Open");
        }
        else {
            System.out.println("Close");
        }
        
    }

}
```

python code:

