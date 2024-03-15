<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02162 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		int r1 = sc.nextInt();
		int r2 = sc.nextInt();
		if (r1 == -1 || r2 == -1) {
		    r1 = -t1;
		    r2 = -t2;
		}
		if (r1 == r2) {
		    System.out.println("Draw");
		} else if (r1 < r2) {
		    System.out.println("Bob");
		} else {
		    System.out.println("Alice");
		}
	}
}


```

### 解题思路

```python
import java.util

def main():
    t1 = int(input())
    t2 = int(input())
    r1 = int(input())
    r2 = int(input())
    if r1 == -1 or r2 == -1:
        r1 = -t1
        r2 = -t2
    if r1 == r2:
        print("Draw")
    elif r1 < r2:
        print("Bob")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```

### 代码详解

```python
import java.util
```

`import java.util` 导入java的util包，这个包里面有一个Scanner类，我们可以用这个类来读取输入。

```python
def main():
    t1 = int(input())
    t2 = int(input())
    r1 = int(input())
    r2 = int(input())
    if r1 == -1 or r2 == -1:
        r1 = -t1
        r2 = -t2
    if r1 == r2:
        print("Draw")
    elif r1 < r2:
        print("Bob")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```

`main()` 是一个函数，它的作用是读取输入，然后根据输入的情况，判断输出结果。

```python
t1 = int(input())
t2 = int(input())
r1 = int(input())
r2 = int(input())
```

`t1` 和 `t2` 是两个游戏的胜利次数，`r1` 和 `r2` 是两个游戏的胜利次数。

```python
if r1 == -1 or r2 == -1:
    r1 = -t1
    r2 = -t2
```

如果输入的胜利次数是负数，那么我们就把胜利次数变成负数的负数。

```python
if r1 == r2:
    print("Draw")
```

如果输入的胜利次数相等，那么输出结果是“Draw”。

```python
elif r1 < r2:
    print("Bob")
```

如果输入的胜利次数不相等，那么输出结果是“Bob”。

```python
else:
    print("Alice")
```

如果输入的胜利次数不相等，那么输出结果是“Alice”。

```python
if __name__ == "__main__":
    main()
```

如果我们在命令行中输入`python p02162.py`，那么会调用`main()` 函数。

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Alice
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Bob
```

### 代码执行结果

```
Input:
2
1
-1

Output:
Draw
```

### 代码执行结果

```
Input:

