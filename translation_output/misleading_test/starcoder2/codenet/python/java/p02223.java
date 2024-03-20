

```java

```
/problems/0001/README.md
# Problem 1

## Description

Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Input

None

## Output

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FizzBuzz
31
32
Fizz
34
Buzz
Fizz
37
38
Fizz
Buzz
41
Fizz
43
44
FizzBuzz
46
47
Fizz
49
Buzz
Fizz
52
53
Fizz
Buzz
56
Fizz
58
59
FizzBuzz
61
62
Fizz
64
Buzz
Fizz
67
68
Fizz
Buzz
71
Fizz
73
74
FizzBuzz
76
77
Fizz
79
Buzz
Fizz
82
83
Fizz
Buzz
86
Fizz
88
89
FizzBuzz
91
92
Fizz
94
Buzz
Fizz
97
98
Fizz
Buzz
```

## Solution

### Python

```python
for i in range(1, 101):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 3 == 0:
        print("Fizz")
    elif i % 5 == 0:
        print("Buzz")
    else:
        print(i)
```

### Java

```java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

### C

```c
#include <stdio.h>

int main() {
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            printf("FizzBuzz\n");
        } else if (i % 3 == 0) {
            printf("Fizz\n");
        } else if (i % 5 == 0) {
            printf("Buzz\n");
        } else {
            printf("%d\n", i);
        }
    }
    return 0;
}
```

### C++

```cpp
#include <iostream>

using namespace std;

int main() {
    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            cout << "FizzBuzz" << endl;
        } else if (i % 3 == 0) {
            cout << "Fizz" << endl;
        } else if (i % 5 == 0) {
            cout << "Buzz" << endl;
        } else {
            cout << i << endl;
        }
    }
    return 0;
}
```

### C#

```cs
using System;

class FizzBuzz {
    static void Main(string[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                Console.WriteLine("FizzBuzz");
            } else if (i % 3 == 0) {
                Console.WriteLine("Fizz");
            } else if (i % 5 == 0) {
                Console.WriteLine("Buzz");
            } else {
                Console.WriteLine(i);
            }
        }
    }
}
```

### Go

```go
package main

import "fmt"

func main() {
    for i := 1; i <= 100; i++ {
        if i % 3 == 0 && i % 5 == 0 {
            fmt.Println("FizzBuzz")
        } else if i % 3 == 0 {
            fmt.Println("Fizz")
        } else if i % 5 == 0 {
            fmt.Println("Buzz")
        } else {
            fmt.Println(i)
        }
    }
}
```

### Haskell

```haskell
main = mapM_ putStrLn $ map fizzbuzz [1..100]

fizzbuzz n
    | n `mod` 3 == 0 && n `mod` 5 == 0 = "FizzBuzz"
    | n `mod` 3 == 0 = "Fizz"
    | n `mod` 5 == 0 = "Buzz"
    | otherwise = show n
```

### JavaScript

```js
for (let i = 1; i <= 100; i++) {
    if (i % 3 === 0 && i % 5 === 0) {
        console.log("FizzBuzz");
    } else if (i % 3 === 0) {
        console.log("Fizz");
    } else if (i % 5 === 0) {
        console.log("Buzz");
    } else {
        console.log(i);
    }
}
```

### Kotlin

```kotlin
fun main(args: Array<String>) {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else {
            println(i)
        }
    }
}
```

### Lua

```lua
for i = 1, 100 do
    if i % 3 == 0 and i % 5 == 0 then
        print("FizzBuzz")
    elseif i % 3 == 0 then
        print("Fizz")
    elseif i % 5 == 0 then
        print("Buzz")
    else
        print(i)
    end
end
```

### PHP

```php
<?php

for ($i = 1; $i <= 100; $i++) {
    if ($i % 3 == 0 && $i % 5 == 0) {
        echo "FizzBuzz\n";
    } else if ($i % 3 == 0) {
        echo "Fizz\n";
    } else if ($i % 5 == 0) {
        echo "Buzz\n";
    } else {
        echo $i . "\n";
    }
}
```

### Perl

```perl
use strict;
use warnings;

for (my $i = 1; $i <= 100; $i++) {
    if ($i % 3 == 0 && $i % 5 == 0) {
        print "FizzBuzz\n";
    } elsif ($i % 3 == 0) {
        print "Fizz\n";
    } elsif ($i % 5 == 0) {
        print "Buzz\n";
    } else {
        print "$i\n";
    }
}
```

### Ruby

```ruby
