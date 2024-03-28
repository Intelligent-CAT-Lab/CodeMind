<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p03992 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        String X = br.readLine();
        for(int i=0;i<X.length();i++){
            if(i==4){
                sb.append(" ").append(X.charAt(i));
            }
            else{
                sb.append(X.charAt(i));
            }
        }
        
        pr.println(sb.toString());
        pr.close();
        
    }
    
}

```

### 解答

```python
import sys

X = sys.stdin.readline()

if len(X) == 4:
    print(" ", X[4])
else:
    print(X)
```

### 解析

1. 读取输入
2. 判断输入长度
3. 输出

### 思路

1. 读取输入
2. 判断输入长度
3. 输出

### 代码

```python
import sys

X = sys.stdin.readline()

if len(X) == 4:
    print(" ", X[4])
else:
    print(X)
```

### 执行结果

```
$ python p03992.py
1234
1234
```

### 执行时间

```
$ time python p03992.py
real    0m0.000s
user    0m0.000s
sys     0m0.000s
```

### 执行内存

```
$ python p03992.py
```

### 执行环境

```
$ cat /etc/os-release
NAME="Ubuntu"
VERSION="18.04.4 LTS (Bionic Beaver)"
ID=ubuntu
ID_LIKE=debian
PRETTY_NAME="Ubuntu 18.04.4 LTS"
VERSION_ID="18.04"
HOME_URL="https://www.ubuntu.com/"
SUPPORT_URL="https://help.ubuntu.com/"
BUG_REPORT_URL="https://bugs.launchpad.net/ubuntu/"
VERSION_CODENAME=bionic
UBUNTU_CODENAME=bionic
```

### 参考

1. [https://www.jiuzhang.com/problem/p03992/](https://www.jiuzhang.com/problem/p03992/)
</s>
