
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a = 1, b = N / 2;
        int c = N / 2 + 1, d = N;
        if (N % 2 == 0) {
            a += 1;
        }
        int i = 0;
        while (i < M) {
            if (i < M) {
                System.out.println(c + " " + d);
                i += 1;
                c += 1;
                d -= 1;
            } else {
                break;
            }
            if (i < M) {
                System.out.println(a + " " + b);
                a += 1;
                b -= 1;
                i += 1;
            } else {
                break;
            }
        }
    }
}
```

## 2.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

## 1.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```python
n = int(input())
sum = 0
for i in range(n+1):
    if i % 2 == 0:
        sum += i
print(sum)
```

## 2.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```c
#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int sum = 0;
    for (int i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    printf("%d", sum);
    return 0;
}
```

## 4.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```c++
#include <iostream>

using namespace std;

int main() {
    int n;
    cin >> n;
    int sum = 0;
    for (int i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    cout << sum;
    return 0;
}
```

## 5.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```go
package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)
    sum := 0
    for i := 0; i <= n; i++ {
        if i % 2 == 0 {
            sum += i
        }
    }
    fmt.Println(sum)
}
```

## 6.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```rust
use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: i32 = n.trim().parse().unwrap();
    let mut sum = 0;
    for i in 0..=n {
        if i % 2 == 0 {
            sum += i;
        }
    }
    println!("{}", sum);
}
```

## 7.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```swift
import Foundation

let n = Int(readLine()!)!
var sum = 0
for i in 0...n {
    if i % 2 == 0 {
        sum += i
    }
}
print(sum)
```

## 8.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```kotlin
fun main() {
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 0..n) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println(sum)
}
```

## 9.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```scala
object Main extends App {
    val n = scala.io.StdIn.readInt()
    var sum = 0
    for (i <- 0 to n) {
        if (i % 2 == 0) {
            sum += i
        }
    }
    println(sum)
}
```

## 10.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```php
<?php
$n = (int)fgets(STDIN);
$sum = 0;
for ($i = 0; $i <= $n; $i++) {
    if ($i % 2 == 0) {
        $sum += $i;
    }
}
echo $sum;
```

## 11.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```ruby
n = gets.to_i
sum = 0
for i in 0..n
    if i % 2 == 0
        sum += i
    end
end
puts sum
```

## 12.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```javascript
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (n) => {
    n = parseInt(n);
    let sum = 0;
    for (let i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    console.log(sum);
    rl.close();
});
```

## 13.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```typescript
import * as readline from 'readline';

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('', (n) => {
    n = parseInt(n);
    let sum = 0;
    for (let i = 0; i <= n; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    console.log(sum);
    rl.close();
});
```

## 14.

Write a program that reads a number and prints the sum of all the even numbers from 0 to that number.

```dart
import 'dart
