<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import java.io.File
import java.math.BigInteger
import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Properties
import java.util.Scanner
import java.util.Set
import java.util.Stack

class p03090:
    static Scanner sc = Scanner(System.in)
    static Properties pps = System.getProperties()
    static bool dbg = true

    def main(args):
        # TODO Auto-generated method stub
        a = int(input())

        l = []
        solve(a, l)
        print(len(l))
        for str in l:
            print(str)

    def solve(a, l):
        # TODO Auto-generated method stub
        if a % 2 == 0:
            for i in range(1, a // 2 + 1):
                for j in range(i + 1, a // 2 + 1):
                    l.append(str(i) + " " + str(j))
                    l.append(str(i) + " " + (a - j + 1))
                    l.append((a - i + 1) + " " + str(j))
                    l.append((a - i + 1) + " " + (a - j + 1))
        else:
            solve(a - 1, l)
            for i in range(1, a):
                l.append(str(a) + " " + str(i))

    def out(l):
        # TODO Auto-generated method stub
        for i in l:
            print(i)

    def out(b):
        # TODO Auto-generated method stub
        for i in b:
            print(i)

    def out(s):
        # TODO Auto-generated method stub
        if dbg:
            print(s)

    def out(n):
        # TODO Auto-generated method stub
        if dbg:
            print(n)

    def ni():
        # TODO Auto-generated method stub
        return int(input())

    def ns():
        # TODO Auto-generated method stub
        return input().strip()

    def ni(k):
        # TODO Auto-generated method stub
        res = []
        for i in range(k):
            res.append(int(input()))
        res.append(input().strip())
        return res

    def ns(k):
        # TODO Auto-generated method stub
        res = []
        for i in range(k):
            res.append(input().strip())
        return res

    def ni(a, b):
        # TODO Auto-generated method stub
        res = []
        for i in range(a):
            for j in range(b):
                res.append(int(input()))
        res.append(input().strip())
        return res


```</s>
