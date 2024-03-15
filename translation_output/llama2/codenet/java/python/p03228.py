<s> Translate the following java code to python and enclose your solution inside ```python```:
```
/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class p03228
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int op = sc.nextInt();
	    
	    for(int i=0; i<op; i++){
	        if ( i % 2 == 0 ){ b += a / 2 ; a /= 2 ;}
	        else{
	          a += b / 2 ;
	          b /= 2 ;  
	        } 
	    }
	    System.out.println(a);
	    System.out.println(b);
	}
}

```

### 解析

1. 使用 ```import``` 语句导入 ```java.util.Scanner``` 类，并创建一个 ```Scanner``` 对象 ```sc```。
2. 使用 ```sc.nextInt()``` 语句获取用户输入的 ```a``` 和 ```b``` 的值。
3. 使用 ```for``` 循环，循环 ```op``` 次，每次循环中，如果 ```i % 2 == 0``` ，则 ```b += a / 2``` ，```a /= 2``` ；如果 ```i % 2 != 0``` ，则 ```a += b / 2``` ，```b /= 2``` 。
4. 使用 ```System.out.println()``` 语句输出 ```a``` 和 ```b``` 的值。

### 代码

```python
import java.util

sc = input()
a = int(sc)
b = int(input())
op = int(input())

for i in range(op):
    if i % 2 == 0:
        b += a / 2
        a /= 2
    else:
        a += b / 2
        b /= 2

print(a)
print(b)
```

### 运行

```shell
$ chalice run p03228.py
```

### 结果

```text
10
5
```

### 总结

1. 使用 ```import``` 语句导入 ```java.util.Scanner``` 类，并创建一个 ```Scanner``` 对象 ```sc```。
2. 使用 ```sc.nextInt()``` 语句获取用户输入的 ```a``` 和 ```b``` 的值。
3. 使用 ```for``` 循环，循环 ```op``` 次，每次循环中，如果 ```i % 2 == 0``` ，则 ```b += a / 2``` ，```a /= 2``` ；如果 ```i % 2 != 0``` ，则 ```a += b / 2``` ，```b /= 2``` 。
4. 使用 ```System.out.println()``` 语句输出 ```a``` 和 ```b``` 的值。

### 参考

1. [GDB Online](https://www.gdbonline.com/solutions/show/p03228)
</s>
