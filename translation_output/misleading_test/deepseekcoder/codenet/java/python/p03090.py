<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
-97
*n+
P Z

```
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class p03090 {
	static Scanner sc = new Scanner(System.in);
	static Properties pps = System.getProperties();
	static boolean dbg = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ni();
	
		List<String> l=new ArrayList<String>();
		solve(a,l);
		System.out.println(l.size());
		for(String str:l)
			out(str);
		
	}



	private static void solve(int a,List<String> l) {
		// TODO Auto-generated method stub
		
		if(a%2==0) {
			for(int i=1;i<=a/2;i++) {
				for(int j=i+1;j<=a/2;j++) {
					l.add(i+" "+j);
					l.add(i+" "+(a+1-j));
					l.add((a+1-i)+" "+j);
					l.add((a+1-i)+" "+(a+1-j));
				}
			}
		}
		else {
			solve(a-1, l);
			for(int i=1;i<a;i++) {
				l.add(a+" "+i);
			}
		}
		
	}



	private static void out(List<Integer> l) {
		// TODO Auto-generated method stub
		for (int i : l)
			System.out.println(i);

	}

	private static void out(int[] b) {
		// TODO Auto-generated method stub
		for (int i : b)
			System.out.println(i);

	}

	public static void out(String str) {

		if (dbg)
			System.out.println(str);
	}

	public static void out(int str) {

		if (dbg)
			System.out.println(str);
	}

	public static int ni() {

		return sc.nextInt();

	}

	public static String ns() {

		return sc.nextLine();
	}

	public static int[] ni(int k) {
		int[] res = new int[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextInt();
		sc.nextLine();
		return res;
	}

	public static String[] ns(int k) {
		String[] res = new String[k];
		for (int i = 0; i < k; i++)
			res[i] = sc.nextLine();
		return res;
	}

	public static int[][] ni(int a, int b) {
		int[][] res = new int[a][b];
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = sc.nextInt();
		sc.nextLine();
		return res;
	}
}

```

### Response:
Here is the Python equivalent of the provided Java code:

```python
import sys
import os
import math
import re
import itertools
import collections
import string
import functools
import operator
import heapq
import random
import bisect

def ni():
    return int(sys.stdin.readline())

def ns():
    return sys.stdin.readline().strip()

def out(s):
    sys.stdout.write(str(s) + '\n')

def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(str(i) + " " + str(j))
                l.append(str(i) + " " + str(a + 1 - j))
                l.append(str(a + 1 - i) + " " + str(j))
                l.append(str(a + 1 - i) + " " + str(a + 1 - j))
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(str(a) + " " + str(i))

def main():
    a = ni()
    l = []
    solve(a, l)
    out(len(l))
    for s in l:
        out(s)

if __name__ == '__main__':
    main()
```

Please note that Python and Java are different languages with different syntax and semantics. The Python code above is a direct translation of the given Java code. However, it's important to note that Python uses zero-based indexing and the range function is exclusive of the end value, so some adjustments were made to the code to match these differences.
<|EOT|>
