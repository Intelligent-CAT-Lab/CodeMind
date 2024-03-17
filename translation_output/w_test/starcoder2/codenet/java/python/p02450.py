

```python

```

## 2.4.51

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
import java.util.Scanner;

public class p02450 { 
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
        
        int n = scan.nextInt();
        String str = "";

        for(int i=1; i<=n; i++) {
            String str2 = String.valueOf(i);
            str += str2;
        }
        
        permutation(str, "");
    }
            
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
              if(ans.length() != 0) ans += " ";
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
                else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + q.charAt(i));
            }
        }
    }        
} 

```

python code:

```python

```

## 2.4.52

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
import java.util.Scanner;

public class p02450 { 
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
        
        int n = scan.nextInt();
        String str = "";

        for(int i=1; i<=n; i++) {
            String str2 = String.valueOf(i);
            str += str2;
        }
        
        permutation(str, "");
    }
            
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
              if(ans.length() != 0) ans += " ";
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
                else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + q.charAt(i));
            }
        }
    }        
} 

```

python code:

```python

```

## 2.4.53

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
import java.util.Scanner;

public class p02450 { 
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
        
        int n = scan.nextInt();
        String str = "";

        for(int i=1; i<=n; i++) {
            String str2 = String.valueOf(i);
            str += str2;
        }
        
        permutation(str, "");
    }
            
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
              if(ans.length() != 0) ans += " ";
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
                else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + q.charAt(i));
            }
        }
    }        
} 

```

python code:

```python

```

## 2.4.54

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
import java.util.Scanner;

public class p02450 { 
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
        
        int n = scan.nextInt();
        String str = "";

        for(int i=1; i<=n; i++) {
            String str2 = String.valueOf(i);
            str += str2;
        }
        
        permutation(str, "");
    }
            
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
              if(ans.length() != 0) ans += " ";
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                if(ans.length() == 0) permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
                else permutation(q.substring(0, i) + q.substring(i + 1),ans + " " + q.charAt(i));
            }
        }
    }        
} 

```

python code:

```python

```

## 2.4.55

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
import java.util.Scanner;

public class p02450 { 
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
        
        int n = scan.nextInt();
        String str = "";

        for(int i=1; i<=n; i++) {
            String str2 = String.valueOf(i);
            str += str2;
        }
        
        permutation(str, "");
    }
            
    public static void permutation(String q, String ans){
        // Base Case
        if(q.length() <= 1) {
              if(ans.length() != 0) ans += " ";
            System.out.println(ans + q);
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                if
