

```python
import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    e.sort()
    if len(set(e)) > 3:
        print("no")
        return
    for i in set(e):
        if e.count(i) != 4 and e.count(i) != 8 and e.count(i) != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()
```

## 00342

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1 1 1 1 1 1 1

Expected output:
yes


```
import java.util.Scanner;

public class p00342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] e = new int[12];
        int[] disinct = new int[3];
        int index = 0;
        int each;

        for(int i = 0; i < 12; i++) {
            e[i] = sc.nextInt();
        }

        for(int i = 0; i < 12; i++) {
            if(index == 3) {
                break;
            }
            if(i == 0) {
                disinct[index++] = e[i];
                continue;
            }
            if(e[i] != disinct[0] && e[i] != disinct[1] && e[i] != disinct[2]) {
                disinct[index++] = e[i];
            }
        }

        for(int i = 0; i < 3; i++) {
            each = 0;
            for(int j = 0; j < 12; j++) {
                if(disinct[i] == e[j]) {
                    each++;
                }
            }
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```

python code:

```python
import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    disinct = []
    index = 0
    for i in range(12):
        if index == 3:
            break
        if i == 0:
            disinct.append(e[i])
            index += 1
            continue
        if e[i] not in disinct:
            disinct.append(e[i])
            index += 1
    for i in disinct:
        each = 0
        for j in e:
            if i == j:
                each += 1
        if each != 4 and each != 8 and each != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()
```

## 00343

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1 1 1 1 1 1 1

Expected output:
yes


```
import java.util.Scanner;

public class p00343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] e = new int[12];
        int[] disinct = new int[3];
        int index = 0;
        int each;

        for(int i = 0; i < 12; i++) {
            e[i] = sc.nextInt();
        }

        for(int i = 0; i < 12; i++) {
            if(index == 3) {
                break;
            }
            if(i == 0) {
                disinct[index++] = e[i];
                continue;
            }
            if(e[i] != disinct[0] && e[i] != disinct[1] && e[i] != disinct[2]) {
                disinct[index++] = e[i];
            }
        }

        for(int i = 0; i < 3; i++) {
            each = 0;
            for(int j = 0; j < 12; j++) {
                if(disinct[i] == e[j]) {
                    each++;
                }
            }
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```

python code:

```python
import sys

def main():
    e = []
    for i in range(12):
        e.append(int(sys.stdin.readline()))
    disinct = []
    index = 0
    for i in range(12):
        if index == 3:
            break
        if i == 0:
            disinct.append(e[i])
            index += 1
            continue
        if e[i] not in disinct:
            disinct.append(e[i])
            index += 1
    for i in disinct:
        each = 0
        for j in e:
            if i == j:
                each += 1
        if each != 4 and each != 8 and each != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()
```

## 00344

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1 1 1 1 1 1 1 1 1

Expected output:
yes


```
import java.util.Scanner;

public class p00344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] e = new int[12];
        int[] disinct = new int[3];
        int index = 0;
        int each;

        for(int i = 0; i < 12; i++) {
            e[i] = sc.nextInt();
        }

        for(int i = 0; i < 12; i++) {
            if(index == 3) {
                break;
            }
            if(i == 0) {
                disinct[index++] = e[i];
                continue;
            }
            if(e[i] != disinct[0] && e[i] != disinct[1] && e[i] != disinct[2]) {
                disinct[index++] = e[i];
            }
        }

        for(int i = 0; i < 3; i++) {
            each = 0;
            for(int j = 0; j < 12; j++) {
                if(disinct[i] == e[j]) {
                    each++;
                }
            }
            if(each != 4 && each != 8 && each != 12) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
```

python code:

```python
import sys

def main():
    e
