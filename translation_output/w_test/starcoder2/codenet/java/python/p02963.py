

```python
s = int(input())
a = 1000000000
print("0 0", a, "1", (a-s%a)%a, ((s-1)/a+1))
```


```
/p0001.md
# p0001

## Problem

Write a program that prints 'Hello World' to the standard output.

## Solution

```python
print("Hello World")
```

## Test

```
$ python3 p0001.py
Hello World
```

## Solution in Java

```java
public class p0001 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## Test

```
$ javac p0001.java
$ java p0001
Hello World
```

## Solution in C

```c
#include <stdio.h>

int main(void) {
    printf("Hello World\n");
    return 0;
}
```

## Test

```
$ gcc p0001.c -o p0001
$ ./p0001
Hello World
```

## Solution in C++

```c++
#include <iostream>

int main(void) {
    std::cout << "Hello World" << std::endl;
    return 0;
}
```

## Test

```
$ g++ p0001.cpp -o p0001
$ ./p0001
Hello World
```

## Solution in C#

```c#
using System;

class p0001 {
    static void Main(string[] args) {
        Console.WriteLine("Hello World");
    }
}
```

## Test

```
$ mcs p0001.cs
$ mono p0001.exe
Hello World
```

## Solution in Go

```go
package main

import "fmt"

func main() {
    fmt.Println("Hello World")
}
```

## Test

```
$ go run p0001.go
Hello World
```

## Solution in Haskell

```haskell
main = putStrLn "Hello World"
```

## Test

```
$ runhaskell p0001.hs
Hello World
```

## Solution in Lua

```lua
print("Hello World")
```

## Test

```
$ lua p0001.lua
Hello World
```

## Solution in Perl

```perl
print "Hello World\n";
```

## Test

```
$ perl p0001.pl
Hello World
```

## Solution in PHP

```php
<?php
echo "Hello World\n";
?>
```

## Test

```
$ php p0001.php
Hello World
```

## Solution in Ruby

```ruby
puts "Hello World"
```

## Test

```
$ ruby p0001.rb
Hello World
```

## Solution in Scala

```scala
object p0001 {
    def main(args: Array[String]) {
        println("Hello World")
    }
}
```

## Test

```
$ scalac p0001.scala
$ scala p0001
Hello World
```

## Solution in Swift

```swift
print("Hello World")
```

## Test

```
$ swift p0001.swift
Hello World
```

## Solution in Visual Basic .NET

```vbnet
Module p0001
    Sub Main()
        Console.WriteLine("Hello World")
    End Sub
End Module
```

## Test

```
$ vbnc p0001.vb
$ mono p0001.exe
Hello World
```

## Solution in Whitespace

```
S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T    S S S T
