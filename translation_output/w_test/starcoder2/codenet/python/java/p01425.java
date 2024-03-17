

```java

```


```java

```
/problems/1000/1000.md
# 1000. A+B Problem

## Description

Calculate a+b.

## Input

Two integers a and b.

## Output

Output a+b.

## Sample Input

1 2

## Sample Output

3

## Solution

```python
a, b = map(int, input().split())
print(a + b)
```/problems/1001/1001.md
# 1001. A+B Problem II

## Description

Calculate a+b.

## Input

Two integers a and b.

## Output

Output a+b.

## Sample Input

1 2

## Sample Output

3

## Solution

```python
a, b = map(int, input().split())
print(a + b)
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
    }
}
```

c++ code:

```c++
#include <iostream>

using namespace std;

int main() {
    int a, b;
    cin >> a >> b;
    cout << a + b << endl;
    return 0;
}
```

c code:

```c
#include <stdio.h>

int main() {
    int a, b;
    scanf("%d %d", &a, &b);
    printf("%d\n", a + b);
    return 0;
}
```

go code:

```go
package main

import "fmt"

func main() {
    var a, b int
    fmt.Scanf("%d %d", &a, &b)
    fmt.Println(a + b)
}
```

rust code:

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

javascript code:

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

php code:

```php
<?php
fscanf(STDIN, "%d %d", $a, $b);
echo $a + $b;
```

ruby code:

```ruby
a, b = gets.split.map(&:to_i)
puts a + b
```

scala code:

```scala
object Main extends App {
    val Array(a, b) = io.StdIn.readLine().split(" ").map(_.toInt)
    println(a + b)
}
```

swift code:

```swift
import Foundation

let input = readLine()!.split(separator: " ").map { Int($0)! }
print(input[0] + input[1])
```

kotlin code:

```kotlin
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    println(a + b)
}
```

perl code:

```perl
use strict;
use warnings;

my ($a, $b) = split ' ', <STDIN>;
print $a + $b;
```

lua code:

```lua
a, b = io.read("*n", "*n")
print(a + b)
```

pascal code:

```pascal
var a, b: integer;
begin
    readln(a, b);
    writeln(a + b);
end.
```

objectivec code:

```objectivec
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        int a, b;
        scanf("%d %d", &a, &b);
        printf("%d\n", a + b);
    }
    return 0;
}
```

d code:

```d
import std.stdio;

void main() {
    int a, b;
    readf("%s %s", &a, &b);
    writeln(a + b);
}
```

haskell code:

```haskell
import Control.Applicative

main = do
    [a, b] <- map read . words <$> getLine
    print $ a + b
```

clojure code:

```clojure
(let [[a b] (map read-string (clojure.string/split (read-line) #" "))]
  (println (+ a b)))
```

elixir code:

```elixir
[a, b] = IO.read(:stdio, :line) |> String.split |> Enum.map(&String.to_integer/1)
IO.puts a + b
```

lisp code:

```lisp
(defun main ()
  (let ((a (read)) (b (read)))
    (print (+ a b))))

(main)
```

ocaml code:

```ocaml
let () =
    let a, b = Scanf.scanf "%d %d" (fun a b -> a, b) in
    Printf.printf "%d\n" (a + b)
```

r code:

```r
a <- scan(n = 1)
b <- scan(n = 1)
cat(a + b)
```

bash code:

```bash
read a b
echo $((a + b))
```

coffeescript code:

```coffeescript
[a,
