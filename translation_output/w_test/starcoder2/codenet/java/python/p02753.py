

```python
S = input()
if S[0] == S[1] and S[1] == S[2]:
    print("No")
else:
    print("Yes")
```

## Problem 2

Write a program to find the sum of all the elements in an array.

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
        int arr[] = new int[N];
        read(arr, N);
        int sum = 0;
        for(int i = 0; i < N; i++){
            sum += arr[i];
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

```python
N = int(input())
arr = list(map(int, input().split()))
sum = 0
for i in range(N):
    sum += arr[i]
print(sum)
```

## Problem 3

Write a program to find the maximum element in an array.

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
        int arr[] = new int[N];
        read(arr, N);
        int max = MIN;
        for(int i = 0; i < N; i++){
            max = Math.max(max, arr[i]);
        }
        println(max);
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
