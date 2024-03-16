<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p03679 {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String[] tmpArray = line.split(" ");
        
        int overLimit = Integer.parseInt(tmpArray[0]);
        int prevDay = Integer.parseInt(tmpArray[1]);
        int overDay = Integer.parseInt(tmpArray[2]);
        
        if(prevDay >= overDay){
            System.out.println("delicious");
        }
        else if(prevDay + overLimit < overDay){
            System.out.println("dangerous");
        }
        else {
            System.out.println("safe");
        }
    }
}

```

### 解析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip())

if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")
```

### 测试

```
$ python p03679.py
10 10 15
delicious
```

### 分析

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 思路

1. 读取输入
2. 解析输入
3. 判断是否超过限制
4. 输出结果

### 代码

```python
import sys

overLimit = int(sys.stdin.readline().strip())
prevDay = int(sys.stdin.readline().strip())
overDay = int(sys.stdin.readline().strip
