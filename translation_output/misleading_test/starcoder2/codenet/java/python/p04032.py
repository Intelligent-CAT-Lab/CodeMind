
```python
import sys

for line in sys.stdin:
    line = line.strip()
    strArray = list(line)
    resultNum1 = -1
    resultNum2 = -1

    for i in range(len(strArray)):
        if i + 1 <= len(strArray) - 1 and strArray[i] == strArray[i + 1]:
            resultNum1 = i + 1
            resultNum2 = i + 2
            break

        if i + 2 <= len(strArray) - 1 and strArray[i] == strArray[i + 2]:
            resultNum1 = i + 1
            resultNum2 = i + 3
            break

    print(resultNum1, resultNum2)
```


```

python code:
```python
import sys

for line in sys.stdin:
    line = line.strip()
    strArray = list(line)
    resultNum1 = -1
    resultNum2 = -1

    for i in range(len(strArray)):
        if i + 1 <= len(strArray) - 1 and strArray[i] == strArray[i + 1]:
            resultNum1 = i + 1
            resultNum2 = i + 2
            break

        if i + 2 <= len(strArray) - 1 and strArray[i] == strArray[i + 2]:
            resultNum1 = i + 1
            resultNum2 = i + 3
            break

    print(resultNum1, resultNum2)
```
/p04032.md
# p04032

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
6 -76

```
import java.io.IOException;
import java.util.Scanner;

public class p04032 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String line;
        for (; cin.hasNext();) {
            line = cin.nextLine();

            String[] strArray = line.split("");
            int resultNum1 = -1;
            int resultNum2 = -1;

            for(int i =0; i < strArray.length; i++){

                if(i + 1 <= strArray.length - 1 && strArray[i].equals(strArray[i + 1])){
                    resultNum1 = i + 1;
                    resultNum2 = i + 2;
                    break;
                }


                if(i + 2 <= strArray.length - 1 && strArray[i].equals(strArray[i + 2])){
                    resultNum1 = i + 1;
                    resultNum2 = i + 3;
                    break;
                }
            }


            System.out.println(resultNum1 + " " + resultNum2);
        }
    }
}/p04031.md
# p04031

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.IOException;
import java.util.Scanner;

public class p04031 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String line;
        for (; cin.hasNext();) {
            line = cin.nextLine();

            String[] strArray = line.split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            int[] resultArray = new int[intArray.length];
            for (int i = 0; i < intArray.length; i++) {
                resultArray[i] = intArray[i];
            }

            for (int i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + " ");
            }
            System.out.println();
        }
    }
}
```

python code:
```python
import sys

for line in sys.stdin:
    line = line.strip()
    strArray = line.split(" ")
    intArray = [int(i) for i in strArray]
    resultArray = [i for i in intArray]

    for i in range(len(resultArray)):
        print(resultArray[i], end=" ")
    print()
```

# p04031

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.IOException;
import java.util.Scanner;

public class p04031 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String line;
        for (; cin.hasNext();) {
            line = cin.nextLine();

            String[] strArray = line.split(" ");
            int[] intArray = new int[strArray.length];
            for (int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }

            int[] resultArray = new int[intArray.length];
            for (int i = 0; i < intArray.length; i++) {
                resultArray[i] = intArray[i];
            }

            for (int i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + " ");
            }
            System.out.println();
        }
    }
}
```

python code:
```python
import sys

for line in sys.stdin:
    line = line.strip()
    strArray = line.split(" ")
    intArray = [int(i) for i in strArray]
    resultArray = [i for i in intArray]

    for i in range(len(resultArray)):
        print(resultArray[i], end=" ")
    print()
```

# p04031

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

```
import java.io.IOException;
import java.util.Scanner;

public class p04031 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String line;
    
