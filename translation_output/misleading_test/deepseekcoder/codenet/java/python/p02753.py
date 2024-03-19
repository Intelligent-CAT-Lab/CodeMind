<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ABA

Expected output:
|,s

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

### Response:
```python
import sys

class p02753:

    @staticmethod
    def main():
        S = sys.stdin.readline().strip()
        if S[0] == S[1] == S[2]:
            print("No")
        else:
            print("Yes")

    MIN = -sys.maxsize - 1
    MAX = sys.maxsize

    @staticmethod
    def read(arr, N):
        arr[:] = [int(x) for x in sys.stdin.readline().split()[:N]]

    @staticmethod
    def read_long(arr, N):
        arr[:] = [long(x) for x in sys.stdin.readline().split()[:N]]

    @staticmethod
    def read_str(arr, N):
        arr[:] = [str(x) for x in sys.stdin.readline().split()[:N]]

    @staticmethod
    def print(O):
        sys.stdout.write(str(O))

    @staticmethod
    def println(O):
        sys.stdout.write(str(O) + '\n')

    @staticmethod
    def println_arr(arr):
        sys.stdout.write(' '.join(map(str, arr)) + '\n')

    @staticmethod
    def println_arr_arr(arr):
        for row in arr:
            p02753.println_arr(row)

    @staticmethod
    def debug(O):
        sys.stderr.write(str(O) + '\n')


if __name__ == "__main__":
    p02753.main()
```

This Python code does the same thing as the provided Java code. It reads a string from the standard input, checks if the first character of the string is the same as the second and third characters, and prints "No" if they are and "Yes" otherwise. It also provides methods for reading arrays of integers, long integers, and strings from the standard input, printing objects, arrays, and 2D arrays to the standard output or standard error, and a debug method that prints to the standard error.
<|EOT|>
