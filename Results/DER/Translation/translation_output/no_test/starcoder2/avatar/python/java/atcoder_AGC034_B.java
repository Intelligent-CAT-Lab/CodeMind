
```java

```
/problems/1000/1000.md
# 1000. A+B

## Description

Calculate the sum of two integers.

## Input

The first line contains an integer $T$ ($1 \leq T \leq 1000$), indicating the number of test cases.

Each test case contains two integers $A$ and $B$ ($-1000 \leq A, B \leq 1000$).

## Output

For each test case, output a single line containing one integer, indicating the sum of $A$ and $B$.

## Sample Input

```
2
1 2
-3 4
```

## Sample Output

```
3
1
```

## Hint

For the first test case, $1 + 2 = 3$.

For the second test case, $-3 + 4 = 1$.

## Solution

### Python

```python
T = int(input())
for i in range(T):
    A, B = map(int, input().split())
    print(A + B)
```

### Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
```

### C++

```cpp
#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;
    for (int i = 0; i < T; i++) {
        int A, B;
        cin >> A >> B;
        cout << A + B << endl;
    }
    return 0;
}
```

### C

```c
#include <stdio.h>

int main() {
    int T;
    scanf("%d", &T);
    for (int i = 0; i < T; i++) {
        int A, B;
        scanf("%d %d", &A, &B);
        printf("%d\n", A + B);
    }
    return 0;
}
```

### JavaScript

```javascript
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let T;
let i = 0;

rl.on('line', (line) => {
    if (i === 0) {
        T = parseInt(line);
        i++;
    } else {
        const [A, B] = line.split(' ').map(Number);
        console.log(A + B);
        i++;
        if (i > T) {
            rl.close();
        }
    }
});
```

### Go

```go
package main

import (
    "bufio"
    "fmt"
    "os"
    "strconv"
    "strings"
)

func main() {
    scanner := bufio.NewScanner(os.Stdin)
    scanner.Scan()
    T, _ := strconv.Atoi(scanner.Text())
    for i := 0; i < T; i++ {
        scanner.Scan()
        line := scanner.Text()
        nums := strings.Split(line, " ")
        A, _ := strconv.Atoi(nums[0])
        B, _ := strconv.Atoi(nums[1])
        fmt.Println(A + B)
    }
}
```

### Rust

```rust
use std::io;

fn main() {
    let mut T = String::new();
    io::stdin().read_line(&mut T).unwrap();
    let T: i32 = T.trim().parse().unwrap();
    for _ in 0..T {
        let mut line = String::new();
        io::stdin().read_line(&mut line).unwrap();
        let mut iter = line.split_whitespace();
        let A: i32 = iter.next().unwrap().parse().unwrap();
        let B: i32 = iter.next().unwrap().parse().unwrap();
        println!("{}", A + B);
    }
}
```

### Swift

```swift
import Foundation

let T = Int(readLine()!)!
for _ in 0..<T {
    let line = readLine()!
    let nums = line.split(separator: " ").map { Int($0)! }
    print(nums[0] + nums[1])
}
```

### Kotlin

```kotlin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val T = scanner.nextInt()
    for (i in 0 until T) {
        val A = scanner.nextInt()
        val B = scanner.nextInt()
        println(A + B)
    }
}
```

### Scala

```scala
import scala.io.StdIn

object Main {
    def main(args: Array[String]): Unit = {
        val T = StdIn.readInt()
        for (_ <- 0 until T) {
            val line = StdIn.readLine()
            val nums = line.split(" ").map(_.toInt)
            println(nums(0) + nums(1))
        }
    }
}
```

### PHP

```php
<?php
fscanf(STDIN, "%d", $T);
for ($i = 0; $i < $T; $i++) {
    fscanf(STDIN, "%d %d", $A, $B);
    echo $A + $B . "\n";
}
```

### Ruby

```ruby
T = gets.to_i
T.times do
    A, B = gets.split.map(&:to_i)
    puts A + B
end
```

### Pascal

```pascal
var
    T, A, B: integer;
begin
    readln(T);
    for i := 1 to T do
    begin
        readln(A, B);
        writeln(A + B);
    end;
end.
```

### Lua

```lua
T = io.read("*n")
for i = 1, T do
    A, B = io.read("*n", "*n")
    print(A + B)
end
```

### Perl

```perl
$T = <STDIN>;
for ($i = 0; $i < $T; $i++) {
    ($A, $B) = split(" ", <STDIN>);
    print $A + $B . "\n";
}
```

### Haskell

```haskell
import Control.Monad

main = do
    T <- readLn :: IO Int
    forM_ [1..T] $ \_ -> do
        [A, B] <- map read . words <$> getLine :: IO [Int]
        print $ A + B
```

### Erlang

```erlang
-module(main).
-export([main/0]).

main() ->
    {ok, [T]} = io:fread("", "~d"),
    read_and_print(T).

read_and_print(0) ->
    ok;
read_and_print(T) ->
    {ok, [A, B]} = io:fread("", "~d~d"),
    io:format("~p~n", [A + B]),
    read_and_print(T - 1).
```

### Clojure

```clojure
(defn read-int []
  (Integer/parseInt (read-line)))

(defn read-ints []
  (map read-int (clojure.string/split (read-line) #" ")))

(defn -main []
  (let [T (read-int)]
    (dotimes [_ T]
      (let [[A B] (read-ints)]
        (println (+ A B))))))
```

### OCaml

```ocaml
let read_int () = Scanf.scanf " %d " (fun x -> x)

let () =
  let T = read_int () in
  for _ = 1 to T do
    let A, B = Scanf.scanf " %d %d " (fun x y -> (x, y)) in
   
