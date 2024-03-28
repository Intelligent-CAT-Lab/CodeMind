

```python
n = int(input())
o = 0
e = 0
for i in range(1, n+1):
    if i % 2 == 1:
        o += 1
    else:
        e += 1
print(o*e)
```

## 03265

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

```
import java.lang.*;
import java.io.*;
import java.util.*;

class p03265{
    public static void main(String args[]) throws FileNotFoundException{
        FScanner sc=new FScanner();
        //Scanner sc=new Scanner(System.in);
        
        int n=sc.readInt();
        
        int[] data=sc.readIntL();
        
        int[] cnt=new int[1000001];
        
        for(int i=0; i<n; i++){
            cnt[data[i]]++;
        }
        
        int max=0;
        int max_i=0;
        for(int i=0; i<1000001; i++){
            if(cnt[i]>max){
                max=cnt[i];
                max_i=i;
            }
        }
        System.out.println(max_i);
    }
    
    static void solve(){}

    static void disp(int[] data){
        for(int i=0; i<data.length; i++){
                System.out.printf("%d ",data[i]);
        }
            System.out.println();
    }
    
    static void disp(String[] data){
        for(int i=0; i<data.length; i++){
                System.out.printf("%s ",data[i]);
        }
            System.out.println();
    }
    
    static class FScanner{
        Scanner sc;
        FScanner() throws FileNotFoundException{
            sc=new Scanner(System.in);
        }
        boolean hasNextLine(){
            boolean has=true;
            if(!sc.hasNextLine()){
                has=false;
            }
            return has;
        }
        int readInt(){
            int i=sc.nextInt();
            return i;
        }
        long readLong(){
            long i=Long.parseLong(sc.nextLine());
            return i;
        }
        int[] readIntL(){
            String[] buf=sc.nextLine().split(" ");
            int[] num=new int[buf.length];
            for(int i=0; i<buf.length; i++){
                num[i]=Integer.parseInt(buf[i]);
            }
            return num;
        }
        
        String readString(){
            return sc.nextLine();
        }
        String[] readStringL(String dlm){
            String[] s=sc.nextLine().split(dlm);
            return s;
        }
    }
}

```

python code:

```python
n = int(input())
data = list(map(int, input().split()))
cnt = [0] * 1000001
for i in range(n):
    cnt[data[i]] += 1
max = 0
max_i = 0
for i in range(1000001):
    if cnt[i] > max:
        max = cnt[i]
        max_i = i
print(max_i)
```

## 03266

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
1

```
import java.lang.*;
import java.io.*;
import java.util.*;

class p03266{
    public static void main(String args[]) throws FileNotFoundException{
        FScanner sc=new FScanner();
        //Scanner sc=new Scanner(System.in);
        
        int n=sc.readInt();
        
        int[] data=sc.readIntL();
        
        int[] cnt=new int[1000001];
        
        for(int i=0; i<n; i++){
            cnt[data[i]]++;
        }
        
        int max=0;
        int max_i=0;
        for(int i=0; i<1000001; i++){
            if(cnt[i]>max){
                max=cnt[i];
                max_i=i;
            }
        }
        System.out.println(max_i);
    }
    
    static void solve(){}

    static void disp(int[] data){
        for(int i=0; i<data.length; i++){
                System.out.printf("%d ",data[i]);
        }
            System.out.println();
    }
    
    static void disp(String[] data){
        for(int i=0; i<data.length; i++){
                System.out.printf("%s ",data[i]);
        }
            System.out.println();
    }
    
    static class FScanner{
        Scanner sc;
        FScanner() throws FileNotFoundException{
            sc=new Scanner(System.in);
        }
        boolean hasNextLine(){
            boolean has=true;
            if(!sc.hasNextLine()){
                has=false;
            }
            return has;
        }
        int readInt(){
            int i=sc.nextInt();
            return i;
        }
        long readLong(){
            long i=Long.parseLong(sc.nextLine());
            return i;
        }
        int[] readIntL(){
            String[] buf=sc.nextLine().split(" ");
            int[] num=new int[buf.length];
            for(int i=0; i<buf.length; i++){
                num[i]=Integer.parseInt(buf[i]);
            }
            return num;
        }
        
        String readString(){
            return sc.nextLine();
        }
        String[] readStringL(String dlm){
            String[] s=sc.nextLine().split(dlm);
            return s;
        }
    }
}

```


