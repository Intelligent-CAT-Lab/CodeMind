class main:
    import sys
    
    l = sys.stdin.readline()
    answer = int(l) // 3
    print(answer)
    
    
    
    
    import sys
    
    l = sys.stdin.readline()
    answer = int(l) // 3
    print(answer)
    
    /p03423.md
    # p03423
    
    Translate the following java code to python and enclose your solution inside .
    A sample test case is provided below:
    
    Test input:
    8
    
    Expected output:
    2
    
    
    
    import java.io.*;
    import java.util.*;
    
    class p03423 {
      public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String l = br.readLine();
             StringTokenizer st = new StringTokenizer(l);
        int answer = (int)Math.floor(Integer.parseInt(st.nextToken())/3);
        System.out.println(answer);
        
      }
    }