

```python

str = input()
ch = []
for i in range(4):
    ch.append(str[i])

a = int(ch[0])
b = int(ch[1])
c = int(ch[2])
d = int(ch[3])

ans = []

if a + b + c + d == 7:
    ans.append("+")
    ans.append("+")
    ans.append("+")
elif a + b + c - d == 7:
    ans.append("+")
    ans.append("+")
    ans.append("-")
elif a + b - c + d == 7:
    ans.append("+")
    ans.append("-")
    ans.append("+")
elif a - b + c + d == 7:
    ans.append("-")
    ans.append("+")
    ans.append("+")
elif a + b - c - d == 7:
    ans.append("+")
    ans.append("-")
    ans.append("-")
elif a - b + c - d == 7:
    ans.append("-")
    ans.append("+")
    ans.append("-")
elif a - b - c + d == 7:
    ans.append("-")
    ans.append("-")
    ans.append("+")
elif a - b - c - d == 7:
    ans.append("-")
    ans.append("-")
    ans.append("-")

print(a, ans[0], b, ans[1], c, ans[2], d, "=7", sep="")

```

## p03546

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234

Expected output:
1+2+3+4=10


```


import java.util.Scanner;

public class p03546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] ch = new String[4];

        for (int i = 0; i < 4; i++) {
            ch[i] = str.substring(i, i + 1);
        }

        int a = Integer.parseInt(ch[0]);
        int b = Integer.parseInt(ch[1]);
        int c = Integer.parseInt(ch[2]);
        int d = Integer.parseInt(ch[3]);

        String[] ans = new String[3];

        if (a + b + c + d == 10) {
            ans[0] = "+";
            ans[1] = "+";
            ans[2] = "+";
        } else if (a + b + c - d == 10) {
            ans[0] = "+";
            ans[1] = "+";
            ans[2] = "-";
        } else if (a + b - c + d == 10) {
            ans[0] = "+";
            ans[1] = "-";
            ans[2] = "+";
        } else if (a - b + c + d == 10) {
            ans[0] = "-";
            ans[1] = "+";
            ans[2] = "+";
        } else if (a + b - c - d == 10) {
            ans[0] = "+";
            ans[1] = "-";
            ans[2] = "-";
        } else if (a - b + c - d == 10) {
            ans[0] = "-";
            ans[1] = "+";
            ans[2] = "-";
        } else if (a - b - c + d == 10) {
            ans[0] = "-";
            ans[1] = "-";
            ans[2] = "+";
        } else if (a - b - c - d == 10) {
            ans[0] = "-";
            ans[1] = "-";
            ans[2] = "-";
        }

        System.out.println(a + ans[0] + b + ans[1] + c + ans[2] + d + "=10");
    }

}

```

python code:

```python

str = input()
ch = []
for i in range(4):
    ch.append(str[i])

a = int(ch[0])
b = int(ch[1])
c = int(ch[2])
d = int(ch[3])

ans = []

if a + b + c + d == 10:
    ans.append("+")
    ans.append("+")
    ans.append("+")
elif a + b + c - d == 10:
    ans.append("+")
    ans.append("+")
    ans.append("-")
elif a + b - c + d == 10:
    ans.append("+")
    ans.append("-")
    ans.append("+")
elif a - b + c + d == 10:
    ans.append("-")
    ans.append("+")
    ans.append("+")
elif a + b - c - d == 10:
    ans.append("+")
    ans.append("-")
    ans.append("-")
elif a - b + c - d == 10:
    ans.append("-")
    ans.append("+")
    ans.append("-")
elif a - b - c + d == 10:
    ans.append("-")
    ans.append("-")
    ans.append("+")
elif a - b - c - d == 10:
    ans.append("-")
    ans.append("-")
    ans.append("-")

print(a, ans[0], b, ans[1], c, ans[2], d, "=10", sep="")

```

## p03547

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234


