<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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
        String S = in.next();
        if(S.charAt(0) == S.charAt(1) && S.charAt(1) == S.charAt(2)){
            println("No");
        }
        else{
            println("Yes");
        }    
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

@@ Response
```python
#  author : Atul Anand   
#  created on : Tue Mar 31 2020

import sys

class Reader:
    def __init__(self):
        self.input = sys.stdin.readline().strip()

    def next(self):
        return self.input

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLong(self):
        return int(self.next())

    def nextLine(self):
        return self.input

    def close(self):
        pass

def read(arr, N):
    for i in range(N):
        arr[i] = in.nextInt()

def print(O):
    sys.stdout.write(str(O))

def println(O):
    sys.stdout.write(str(O) + '\n')

def println(arr):
    for i in arr:
        print(i, end=' ')
    println("")

def println(arr):
    for i in arr:
        println(i)

def debug(O):
    println(O)

in = Reader()
S = in.next()
if S[0] == S[1] and S[1] == S[2]:
    println("No")
else:
    println("Yes")
in.close()
```

Please note that Python does not have a built-in equivalent to Java's `println` and `print` methods. Instead, we use `sys.stdout.write` to achieve similar functionality. Also, Python does not have a built-in equivalent to Java's `Reader` class, so we use `sys.stdin.readline().strip()` to read input.<｜end▁of▁sentence｜>
