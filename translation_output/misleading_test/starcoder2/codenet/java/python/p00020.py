
```python
s = input()
t = ""
for i in range(len(s)):
    c = s[i]
    if c >= 'a' and c <= 'z':
        c = chr(ord(c) - 32)
    t += c
print(t)
```
/p00001.md
# Problem 1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.*;

public class p00001 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null){
            System.out.println(s);
        }
    }
}
```

python code:
```python
s = input()
print(s)
```


python code:
```python
s = input()
print(s[::-1])
```
/p00002.md
# Problem 2

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321

```
import java.io.*;

public class p00002 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null){
            System.out.println(new StringBuffer(s).reverse().toString());
        }
    }
}
```/p00003.md
# Problem 3

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.*;

public class p00003 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null){
            int i,j,k,l,m,n,o,p,q,r,t,u,v,w,x,y,z;
            i=j=k=l=m=n=o=p=q=r=t=u=v=w=x=y=z=0;
            for(int a=0,b=s.length();a<b;a++){
                char c=s.charAt(a);
                if(c>=48&&c<=57){i++;}
                else if(c>=65&&c<=90){j++;}
                else if(c>=97&&c<=122){k++;}
                else if(c==32){l++;}
                else if(c==46){m++;}
                else if(c==44){n++;}
                else if(c==33){o++;}
                else if(c==63){p++;}
                else if(c==39){q++;}
                else if(c==40){r++;}
                else if(c==41){t++;}
                else if(c==91){u++;}
                else if(c==93){v++;}
                else if(c==123){w++;}
                else if(c==125){x++;}
                else if(c==58){y++;}
                else if(c==59){z++;}
            }
            System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z);
        }
    }
}
```

python code:
```python
s = input()
i = j = k = l = m = n = o = p = q = r = t = u = v = w = x = y = z = 0
for c in s:
    if c >= '0' and c <= '9':
        i += 1
    elif c >= 'A' and c <= 'Z':
        j += 1
    elif c >= 'a' and c <= 'z':
        k += 1
    elif c == ' ':
        l += 1
    elif c == '.':
        m += 1
    elif c == ',':
        n += 1
    elif c == '!':
        o += 1
    elif c == '?':
        p += 1
    elif c == '\'':
        q += 1
    elif c == '(':
        r += 1
    elif c == ')':
        t += 1
    elif c == '[':
        u += 1
    elif c == ']':
        v += 1
    elif c == '{':
        w += 1
    elif c == '}':
        x += 1
    elif c == ':':
        y += 1
    elif c == ';':
        z += 1
print(i, j, k, l, m, n, o, p, q, r, t, u, v, w, x, y, z)
```

# Problem 3.1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.*;

public class p00003 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null){
            int i,j,k,l,m,n,o,p,q,r,t,u,v,w,x,y,z;
            i=j=k=l=m=n=o=p=q=r=t=u=v=w=x=y=z=0;
            for(int a=0,b=s.length();a<b;a++){
                char c=s.charAt(a);
                if(c>=48&&c<=57){i++;}
                else if(c>=65&&c<=90){j++;}
                else if(c>=97&&c<=122){k++;}
                else if(c==32){l++;}
                else if(c==46){m++;}
                else if(c==44){n++;}
                else if(c==33){o++;}
                else if(c==63){p++;}
                else if(c==39){q++;}
                else if(c==40){r++;}
                else if(c==41){t++;}
                else if(c==91){u++;}
                else if(c==93){v++;}
                else if(c==123){w++;}
                else if(c==125){x++;}
                else if(c==58){y++;}
                else if(c==59){z++;}
            }
            System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q+" "+r+" "+t+" "+u+" "+v+" "+w+" "+x+" "+y+" "+z
