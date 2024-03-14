<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

class p02753:

    def __init__(self):
        self.MIN = -sys.maxsize - 1
        self.MAX = sys.maxsize
        self.in_ = Reader()
        self.out = sys.stdout

    def main(self):
        S = self.in_.next()
        if S[0] == S[1] and S[1] == S[2]:
            self.println("No")
        else:
            self.println("Yes")
        self.in_.close()
        self.out.close()

    def read(self, arr, N):
        for i in range(N):
            arr[i] = self.in_.nextInt()

    def read(self, arr, N):
        for i in range(N):
            arr[i] = self.in_.nextLong()

    def read(self, arr, N):
        for i in range(N):
            arr[i] = self.in_.next()

    def print(self, O):
        self.out.write(str(O))

    def println(self, O):
        self.out.write(str(O) + '\n')

    def println(self, arr):
        for i in arr:
            self.print(i + " ")
        self.println("")

    def println(self, arr):
        for i in arr:
            self.println(i)

    def debug(self, O):
        print(O)


class Reader:
    def __init__(self):
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while True:
            if not self.tokenizer or not self.tokenizer.hasMoreTokens():
                self.tokenizer = shlex.shlex(self.reader.readline())
            yield self.tokenizer.get_token()

    def nextInt(self):
        return int(next(self))

    def nextDouble(self):
        return float(next(self))

    def nextLong(self):
        return long(next(self))

    def nextLine(self):
        return self.reader.readline().strip()

    def close(self):
        self.reader.close()


if __name__ == "__main__":
    p02753().main()
```
<|EOT|>
