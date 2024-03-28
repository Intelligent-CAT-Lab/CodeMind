
```
S = input()
if S[0] == S[1] and S[1] == S[2]:
    print("No")
else:
    print("Yes")
```

## Problem 3

### Problem Statement

Write a program to find the sum of the first N natural numbers.

### Input Format

The first line of the input contains a single integer N.

### Output Format

Print a single line containing the sum of the first N natural numbers.

### Sample Input 0

```
3
```

### Sample Output 0

```
6
```

### Explanation 0

The first 3 natural numbers are 1, 2 and 3. Their sum is 1 + 2 + 3 = 6.

### Solution

Translate the following java code to python and enclose your solution inside ```python```:
```
/*
 *  author : Atul Anand   
 *  created on : Tue Mar 31 2020
 */

import java.io.*;
import java.util.*;

public class p02753{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        println(sum);
        in.close();
        out.close();
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static void read(int arr[], int N) throws IOException { 
        for(int i = 0; i < N; i++){ 
            arr[i] = in.nextInt(); 
        } 
    }
    
    static void read(long arr[], int N) throws IOException { 
        for(int i = 0; i < N; i++){ 
            arr[i] = in.nextLong(); 
        } 
    }
    
    static void read(String arr[], int N) throws IOException { 
        for(int i = 0; i < N; i++){ 
            arr[i] = in.next(); 
        } 
    }
    
    static void print(Object O) {  
        out.print(O); 
    }
    
    static void println(Object O) { 
        out.println(O); 
    }
    
    static void println(int arr[]) { 
        for(int i = 0; i < arr.length; i++){ 
            print(arr[i]+" "); 
        } 
        println(""); 
    }

    static void println(int arr[][]) { 
        for(int i = 0; i < arr.length; i++){ 
            println(arr[i]); 
        }
    }
    
    static void debug(Object O) { 
        System.out.println(O); 
    }
}

class Reader {
    BufferedReader reader;
    StringTokenizer tokenizer;

    Reader() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        tokenizer = new StringTokenizer("");
    }

    String next() throws IOException {
        while (!tokenizer.hasMoreTokens() ) { 
            tokenizer = new StringTokenizer(reader.readLine()); 
        }
        return tokenizer.nextToken();
    }

    int nextInt() throws IOException { 
        return Integer.parseInt(next()); 
    }
    
    double nextDouble() throws IOException { 
        return Double.parseDouble(next());
    }
    
    long nextLong() throws IOException { 
        return Long.parseLong(next()); 
    }
    
    String nextLine() throws IOException { 
        return reader.readLine(); 
    }
    
    void close() throws IOException { 
        reader.close(); 
    }
}
```

python code:
```
N = int(input())
sum = 0
for i in range(1, N+1):
    sum += i
print(sum)
```

## Problem 4

### Problem Statement

Write a program to find the sum of the first N natural numbers.

### Input Format

The first line of the input contains a single integer N.

### Output Format

Print a single line containing the sum of the first N natural numbers.

### Sample Input 0

```
3
```

### Sample Output 0

```
6
```

### Explanation 0

The first 3 natural numbers are 1, 2 and 3. Their sum is 1 + 2 + 3 = 6.

### Solution

Translate the following java code to python and enclose your solution inside ```python```:
```
/*
 *  author : Atul Anand   
 *  created on : Tue Mar 31 2020
 */

import java.io.*;
import java.util.*;

public class p02753{

    public static void main(String[] args) throws IOException {
        int N = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= N; i++){
            sum += i;
        }
        println(sum);
        in.close();
        out.close();
    }

    static int MIN = Integer.MIN_VALUE;
    static int MAX = Integer.MAX_VALUE;
    static Reader in = new Reader();
    static PrintWriter out = new PrintWriter(System.out);

    static void read(int arr[], int N) throws IOException { 
        for(int i = 0; i < N; i++){ 
            arr[i] = in.nextInt(); 
        } 
    }
    
    static void read(long arr[], int N) throws IOException { 
        for(int i = 0; i < N; i++){ 
            arr[i] = in.nextLong(); 
        } 
    }
    
    static void read(String arr[], int N) throws IOException { 
        for(int i = 0; i < N; i++){ 
            arr[i] = in.next(); 
        } 
    }
    
    static void print(Object O) {  
        out.print(O); 
    }
    
    static void println(Object O) { 
        out.println(O); 
    }
    
    static void println(int arr[]) { 
        for(int i = 
