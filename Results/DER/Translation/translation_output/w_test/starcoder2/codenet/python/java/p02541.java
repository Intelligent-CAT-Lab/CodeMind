

```java

```
/problems/1000/1000.md
# 1000. A+B

## Problem

### Description

Calculate a+b.

### Input

Two integers a and b.

### Output

Output a+b.

### Sample Input

```
1 2
```

### Sample Output

```
3
```

## Solution

### Python

```python
a, b = map(int, input().split())
print(a+b)
```

### Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}
```

### C++

```cpp
#include <iostream>
using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    cout << a + b << endl;
    return 0;
}
```

### C

```c
#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    printf("%d\n", a + b);
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

rl.on('line', (line) => {
    const [a, b] = line.split(' ').map(Number);
    console.log(a + b);
    rl.close();
});
```

### Swift

```swift
import Foundation

let input = readLine()!.split(separator: " ").map { Int($0)! }
print(input[0] + input[1])
```

### Kotlin

```kotlin
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(a + b)
}
```

### Rust

```rust
use std::io;

fn main() {
    let mut input = String::new();
    io::stdin().read_line(&mut input).unwrap();
    let mut iter = input.split_whitespace();
    let a: i32 = iter.next().unwrap().parse().unwrap();
    let b: i32 = iter.next().unwrap().parse().unwrap();
    println!("{}", a + b);
}
```

### Go

```go
package main

import (
    "fmt"
)

func main() {
    var a, b int
    fmt.Scan(&a, &b)
    fmt.Println(a + b)
}
```

### Scala

```scala
object Main {
  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(a + b)
  }
}
```

### Ruby

```ruby
a, b = gets.split.map(&:to_i)
puts a + b
```

### PHP

```php
<?php
fscanf(STDIN, "%d %d", $a, $b);
echo $a + $b;
?>
```

### Pascal

```pascal
var
  a, b: integer;
begin
  readln(a, b);
  writeln(a + b);
end.
```

### Haskell

```haskell
main = do
  [a, b] <- map read . words <$> getLine
  print $ a + b
```

### Lua

```lua
a, b = io.read("*n", "*n")
print(a + b)
```

### Perl

```perl
use strict;
use warnings;

my ($a, $b) = split ' ', <STDIN>;
print $a + $b;
```

### D

```d
import std.stdio;

void main() {
    int a, b;
    readf("%s %s", &a, &b);
    writeln(a + b);
}
```

### R

```r
a <- scan(n = 1)
b <- scan(n = 1)
cat(a + b)
```

### OCaml

```ocaml
let a, b = Scanf.scanf "%d %d" (fun a b -> a, b) in
print_int (a + b)
```

### Erlang

```erlang
-module(main).
-export([main/0]).

main() ->
    {A, _} = string:to_integer(string:chomp(io:get_line(""))),
    {B, _} = string:to_integer(string:chomp(io:get_line(""))),
    io:format("~p~n", [A + B]).
```

### Clojure

```clojure
(let [[a b] (map read-string (clojure.string/split (read-line) #" "))]
  (println (+ a b)))
```

### Nim

```nim
import strutils

var a, b: int
(a, b) = stdin.readLine.split.map(parseInt)
echo a + b
```

### F#

```fsharp
open System

[<EntryPoint>]
let main argv =
    let [|a; b|] = Console.ReadLine().Split(' ') |> Array.map int
    printfn "%d" (a + b)
    0
```

### Elm

```elm
import Html exposing (text)
import String exposing (toInt)

main =
    text (toString (Maybe.withDefault
