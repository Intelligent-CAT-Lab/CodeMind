
```

```


```
/problems/1000/1000.md
# 1000 - A+B Problem

## Problem Description

Your task is to Calculate a + b.

## Input

Input contains multiple test cases. Each test case contains a pair of integers a and b, one pair of integers per line. A test case containing 0 0 terminates the input and this test case is not to be processed.

## Output

For each pair of input integers a and b you should output the sum of a and b in one line, and with one line of output for each line in input.

## Sample Input

```
1 5
10 20
0 0
```

## Sample Output

```
6
30
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(a + b);
        }
    }
}
```

## Solution in Python

```
while True:
    try:
        a, b = map(int, input().split())
        print(a + b)
    except:
        break
```

## Solution in C++

```
#include <iostream>
using namespace std;

int main() {
    int a, b;
    while (cin >> a >> b) {
        if (a == 0 && b == 0) {
            break;
        }
        cout << a + b << endl;
    }
    return 0;
}
```

## Solution in C

```
#include <stdio.h>

int main() {
    int a, b;
    while (scanf("%d %d", &a, &b) != EOF) {
        if (a == 0 && b == 0) {
            break;
        }
        printf("%d\n", a + b);
    }
    return 0;
}
```

## Solution in Go

```
package main

import (
    "fmt"
)

func main() {
    var a, b int
    for {
        _, err := fmt.Scanf("%d %d", &a, &b)
        if err != nil {
            break
        }
        if a == 0 && b == 0 {
            break
        }
        fmt.Println(a + b)
    }
}
```

## Solution in PHP

```
<?php
while (true) {
    $line = trim(fgets(STDIN));
    if ($line == "0 0") {
        break;
    }
    list($a, $b) = explode(" ", $line);
    echo $a + $b . "\n";
}
```

## Solution in Ruby

```
while true
    line = gets.chomp
    if line == "0 0"
        break
    end
    a, b = line.split(" ").map(&:to_i)
    puts a + b
end
```

## Solution in Scala

```
object Main {
    def main(args: Array[String]) {
        var a = 0
        var b = 0
        while (true) {
            val line = readLine()
            if (line == "0 0") {
                break
            }
            a = line.split(" ")(0).toInt
            b = line.split(" ")(1).toInt
            println(a + b)
        }
    }
}
```/problems/1001/1001.md
# 1001 - Exponentiation

## Problem Description

Write a program which for each data set from a sequence of several data sets:

reads a pair of integers n, k (1 <= n, k <= 10000),
computes the number nk,
writes the result.

## Input

The first line of the input file contains exactly one positive integer d equal to the number of data sets, 1 <= d <= 10. The data sets follow.

Each data set consists of exactly one line containing a pair of integers separated by a single space.

## Output

The output should consist of exactly d lines, one line for each data set.

## Sample Input

```
2
2 10
3 5
```

## Sample Output

```
1024
243
```

## Solution

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int i = 0; i < d; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println((int) Math.pow(n, k));
        }
    }
}
```

## Solution in Python

```
d = int(input())
for i in range(d):
    n, k = map(int, input().split())
    print(n ** k)
```

## Solution in C++

```
#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int d;
    cin >> d;
    for (int i = 0; i < d; i++) {
        int n, k;
        cin >> n >> k;
        cout << (int) pow(n, k) << endl;
    }
    return 0;
}
```

## Solution in C

```
#include <stdio.h>
#include <math.h>

int main() {
    int d;
    scanf("%d", &d);
    for (int i = 0; i < d; i++) {
        int n, k;
        scanf("%d %d", &n, &k);
        printf("%d\n", (int) pow(n, k));
    }
    return 0;
}
```

## Solution in Go

```
package main

import (
    "fmt"
    "math"
)

func main() {
    var d int
    fmt.Scanf("%d", &d)
    for i := 0; i < d; i++ {
        var n, k int
        fmt.Scanf("%d %d", &n, &k)
        fmt.Println(int(math.Pow(float64(n), float64(k))))
    }
}
```

## Solution in PHP

```
<?php
$d = trim(fgets(STDIN));
for ($i = 0; $i < $d; $i++) {
    $line = trim(fgets(STDIN));
    list($n, $k) = explode(" ", $line);
    echo pow($n, $k) . "\n";
}
```

## Solution in Ruby

```
d = gets.chomp.to_i
d.times do
    n, k = gets.chomp.split(" ").map(&:to_i)
    puts n ** k
end
```

## Solution in Scala

```
object Main {
    def main(args: Array[String]) {
        val d = readInt()
        for (i <- 0 until d) {
            val line = readLine()
            val n = line.split(" ")(0).toInt
            val k = line.split(" ")(1).toInt
            println(math.pow(n, k).toInt)
        }
    }
}
```
/problems/1002/1002.md
# 1002 - A+B for Input-Output Practice (II)

## Problem Description


