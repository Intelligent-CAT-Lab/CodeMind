
```
x,y=map(int,input().split())
ans=0
for i in range(x,y+1):
    if i%2==0:
        ans+=1
print(ans)
```

## 03480 - 1000000007

### 题目大意

给定一个数n，求n!%1000000007的值

### 解题思路

直接求阶乘，然后对1000000007取模

### 代码

java code:
```
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class p03480
{
    InputStream is;
    PrintWriter out;
    String INPUT = "";
    void solve()
    {
        int n=ni();
        long ans=1;
        for(int i=1;i<=n;i++) {
            ans*=i;
            ans%=1000000007;
        }
        out.println(ans);

    }
    
    
        
    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception 
    { new p03480().run(); }
    
    private byte[] inbuf = new byte[1024];
    public int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf)
        {
            ptrbuf = 0;
            try 
            { lenbuf = is.read(inbuf); } 
            catch (IOException e) 
            { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c)
    { return !(c >= 33 && c <= 126); }
    private int skip() 
    { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() 
    { return Double.parseDouble(ns()); }
    private char nc()
    { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b)))
        { // when nextLine, (isSpaceChar(b) && b != ' ')
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    
    private char[] ns(int n
