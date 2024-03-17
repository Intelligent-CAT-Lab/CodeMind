

```python

```
/p00000.md
# Problem 00000

## Problem Statement

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:

Expected output:


```
import java.util.*;
import java.io.*;
public class p00000 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[m];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        for(int i = 0;i<m;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        int[] c = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if (a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<m){
            c[k] = b[j];
            j++;
            k++;
        }
        for(int        out.close();
    }

}

```

python code:

```python

```
 l = 0;l<n+m;l++){
            out.print(c[l]+" ");
        }
        out.println();
        out.println(c[n+m-1]+" "+c[n+m-2]+" "+c[n+m-3]);
/p00001.md
# Problem 00001

## Problem Statement

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:

Expected output:


```
import java.util.*;
import java.io.*;
public class p00001 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] a = new int[n];
        int[] b = new int[m];
        st = new StringTokenizer(bf.readLine());
        for(int i = 0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(bf.readLine());
        for(int i = 0;i<m;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        int[] c = new int[n+m];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if (a[i]<b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i<n){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j<m){
            c[k] = b[j];
            j++;
            k++;
        }
        for(int l = 0;l<n+m;l++){
            out.print(c[l]+" ");
        }
        out.println();
        out.println(c[n+m-1]+" "+c[n+m-2]+" "+c[n+m-3]);
        out.close();
    }

}

```

python code:

```python

```
/p00002.md
# Problem 00002

## Problem Statement

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:

Expected output:


```
import java.util.*;
import java.io.*;
public class p00002 {

    public static void main(String[] args) throws Exception{
        // TODO Auto-generated method stub
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken
