
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<Character, String> d1 = new HashMap<>();
        d1.put(' ', "101");
        d1.put('\'', "000000");
        d1.put(',', "000011");
        d1.put('-', "10010001");
        d1.put('.', "010001");
        d1.put('?', "000001");
        d1.put('A', "100101");
        d1.put('B', "10011010");
        d1.put('C', "0101");
        d1.put('D', "0001");
        d1.put('E', "110");
        d1.put('F', "01001");
        d1.put('G', "10011011");
        d1.put('H', "010000");
        d1.put('I', "0111");
        d1.put('J', "10011000");
        d1.put('K', "0110");
        d1.put('L', "00100");
        d1.put('M', "10011001");
        d1.put('N', "10011110");
        d1.put('O', "00101");
        d1.put('P', "111");
        d1.put('Q', "10011111");
        d1.put('R', "1000");
        d1.put('S', "00110");
        d1.put('T', "00111");
        d1.put('U', "10011100");
        d1.put('V', "10011101");
        d1.put('W', "000010");
        d1.put('X', "10010010");
        d1.put('Y', "10010011");
        d1.put('Z', "10010000");

        Map<Integer, Character> d2 = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            d2.put(i, (char) (i + 'A'));
        }
        d2.put(26, ' ');
        d2.put(27, '.');
        d2.put(28, ',');
        d2.put(29, '-');
        d2.put(30, '\'');
        d2.put(31, '?');

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                sb.append(d1.get(c));
            }
            String s = sb.toString();
            for (int i = 0; i < s.length(); i += 5) {
                System.out.print(d2.get(Integer.parseInt(s.substring(i, i + 5), 2)));
            }
            System.out.println();
        }
    }
}
```

## 10004

### 题目描述

给定一个图，判断是否是二分图。

### 输入格式

第一行包含两个整数n和m，分别表示图的顶点数和边数。

接下来m行，每行包含两个整数u和v，表示u和v之间有一条边。

### 输出格式

如果是二分图，输出```Yes```，否则输出```No```。

### 样例输入

```
4 4
1 2
2 3
3 4
4 1
```

### 样例输出

```
Yes
```

### 样例输入

```
4 5
1 2
2 3
3 4
4 1
1 3
```

### 样例输出

```
No
```

### 样例输入

```
4 3
1 2
2 3
3 4
```

### 样例输出

```
Yes
```

### 样例输入

```
4 4
1 2
2 3
3 4
4 2
```

### 样例输出

```
No
```

### 样例输入

```
4 4
1 2
2 3
3 4
4 1
```

### 样例输出

```
Yes
```

### 样例输入

```
4 5
1 2
2 3
3 4
4 1
1 3
```

### 样例输出

```
No
```

### 样例输入

```
4 3
1 2
2 3
3 4
```

### 样例输出

```
Yes
```

### 样例输入

```
4 4
1 2
2 3
3 4
4 2
```

### 样例输出

```
No
```

### 样例输入

```
4 4
1 2
2 3
3 4
4 1
```

### 样例输出

```
Yes
```

### 样例输入

```
4 5
1 2
2 3
3 4
4 1
1 3
```

### 样例输出

```
No
```

### 样例输入

```
4 3
1 2
2 3
3 4
```

### 样例输出

```
Yes
```

### 样例输入

```
4 4
1 2
2
