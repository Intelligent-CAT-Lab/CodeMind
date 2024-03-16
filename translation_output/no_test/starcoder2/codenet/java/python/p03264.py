
```
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

## 3.265

Translate the following java code to python and enclose your solution inside ```python```:
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
        
        int o=0;
        int e=0;
        
        for(int i=0; i<n; i++){
            
            if(data[i]%2==1){
                o+=1;
            }else{
                e+=1;
            }
        }
        System.out.println(o*e);
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
```
n = int(input())
data = list(map(int, input().split()))

o = 0
e = 0

for i in range(n):
    if data[i] % 2 == 1:
        o += 1
    else:
        e += 1

print(o*e)
```

## 3.266

Translate the following java code to python and enclose your solution inside ```python```:
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
        
        int o=0;
        int e=0;
        
        for(int i=0; i<n; i++){
            
            if(data[i]%2==1){
                o+=1;
            }else{
                e+=1;
            }
        }
        System.out.println(o*e);
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
```
n = int(input())
data = list(map(int, input().split()))

o = 0
e = 0

for i in range(n):
    if data[i] % 2 == 1:
        o += 1
    else:
        e += 1

print(o*e)
```

## 3.267

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.lang.*;
import java.io.*;
import java.util.*;

class p03267{
    public static void main(String args[]) throws FileNotFoundException{
        FScanner sc=new FScanner();
        //Scanner sc=new Scanner(System.in);
        
        int n=sc.readInt();
        int[] data=sc.readIntL();
        
        int o=0;
        
