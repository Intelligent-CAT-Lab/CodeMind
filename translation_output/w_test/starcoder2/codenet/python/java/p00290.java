

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
```
/01-basic-syntax/01-hello-world.md
# Hello World

## Python

```
print("Hello World")
```

## Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

## C++

```cpp
#include <iostream>

using namespace std;

int main() {
    cout << "Hello World" << endl;
    return 0;
}
```

## C

```c
#include <stdio.h>

int main() {
    printf("Hello World\n");
    return 0;
}
```

## C#

```cs
using System;

class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("Hello World");
    }
}
```

## Ruby

```ruby
puts "Hello World"
```

## PHP

```php
<?php
echo "Hello World";
?>
```

## JavaScript

```js
console.log("Hello World");
```

## Swift

```swift
print("Hello World")
```

## Kotlin

```kotlin
fun main(args: Array<String>) {
    println("Hello World")
}
```

## Scala

```scala
object Main extends App {
    println("Hello World")
}
```

## Rust

```rust
fn main() {
    println!("Hello World");
}
```

## Go

```go
package main

import "fmt"

func main() {
    fmt.Println("Hello World")
}
```

## Perl

```perl
print "Hello World\n";
```

## Lua

```lua
print("Hello World")
```

## R

```r
print("Hello World")
```

## Dart

```dart
void main() {
  print("Hello World");
}
```

## Haskell

```haskell
main = putStrLn "Hello World"
```

## Erlang

```erlang
-module(hello).
-export([start/0]).

start() ->
    io:fwrite("Hello World\n").
```

## Clojure

```clojure
(println "Hello World")
```

## F#

```fsharp
printfn "Hello World"
```

## Elm

```elm
module Main exposing (main)

import Html exposing (text)

main =
    text "Hello World"
```

## Elixir

```elixir
IO.puts "Hello World"
```

## Groovy

```groovy
println "Hello World"
```

## Objective-C

```objc
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSLog(@"Hello World");
    }
    return 0;
}
```

## Pascal

```pascal
program HelloWorld;

begin
  writeln('Hello World');
end.
```

## Visual Basic

```vb
Module Module1
    Sub Main()
        Console.WriteLine("Hello World")
    End Sub
End Module
```

## Assembly

```asm
section .data
    msg db "Hello World", 0xA
    len equ $ - msg

section .text
    global _start

_start:
    mov edx, len
    mov ecx, msg
    mov ebx, 1
    mov eax, 4
    int 0x80

    mov ebx, 0
    mov eax, 1
    int 0x80
```

## Bash

```bash
echo "Hello World"
```

## CoffeeScript

```coffee
console.log "Hello World"
```

## D

```d
import std.stdio;

void main() {
    writeln("Hello World");
}
```

## Fortran

```fortran
program hello
    print *, "Hello World"
end program hello
```

## LOLCODE

```lolcode
HAI 1.2
CAN HAS STDIO?
VISIBLE "Hello World"
KTHXBYE
```

## Nim

```nim
echo "Hello World"
```

## OCaml

```ocaml
print_string "Hello World\n"
```

## Prolog

```prolog
write('Hello World').
```

## Racket

```racket
#lang racket

(displayln "Hello World")
```

## Scheme

```scheme
(display "Hello World")
```

## Smalltalk

```smalltalk
Transcript show: 'Hello World'
```

## Tcl

```tcl
puts "Hello World"
```

## VBA

```vba
Sub Main()
    MsgBox "Hello World"
End Sub
```

## Zig

```zig
const std = @import("std");

pub fn main() void {
    std.debug.warn("Hello World\n", .{});
}
```

## Kotlin

```kotlin
fun main(args: Array<String>) {
    println("Hello World")
}
```

## Scala

```scala
object Main extends App {
    println("Hello World")
}
```

## Rust

```rust
fn main() {
    println!("Hello World");
}
```

## Go

```go
package main

import "fmt"

func main() {
    fmt.Println("Hello World")
}
```

## Perl

```perl
print "Hello World\n";
```

## Lua

```lua
print("Hello World")
```

## R

```r
print("Hello World")
```

## Dart

```dart
void main() {
  print("Hello World");
}
```

## Haskell

```haskell
main = putStrLn "Hello World"
```

## Erlang

```erlang
-module(hello).
-export([start/0]).

start() ->
    io:fwrite("Hello World\n").
```

## Clojure

```clojure
(println "Hello World")
```

## F#

```fsharp
printfn "Hello World"
```

## Elm

```elm
module Main exposing (main)

import Html exposing (text)

main =
    text "Hello World"
```

## Elixir

```elixir
IO.puts "Hello World"
```

## Groovy

```groovy
println "Hello World"
```

## Objective-C

```objc
#import <Foundation/Foundation.h>

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSLog(@"Hello World");
    }
    return 0;
}
```

## Pascal

```pascal
program HelloWorld;

begin
  writeln('Hello World');
end.
```

## Visual Basic

```vb
Module Module1
    Sub Main()
        Console.WriteLine("Hello World")
    End Sub
End Module
```

## Assembly

```asm
section .data
    msg db "Hello World", 0xA
    len equ $ - msg

section .text
    global _start

_start:
    mov edx, len
    mov ecx, msg
    mov ebx, 1
    mov eax, 4
    int 0x80

    mov ebx, 0
    mov eax, 1
    int 0x80
```

## Bash

```bash
echo "Hello World"
```

## CoffeeScript

```coffee
console.log "Hello World"
```

## D

```d
import std.stdio;

void main() {
    writeln("Hello World");
}
