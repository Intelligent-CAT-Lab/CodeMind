
```java

```
/2019-2020/01/C/README.md
# Problem C. 
## Description

You are given a sequence of integers. You need to find the longest subsequence of consecutive numbers.

## Input

The first line contains the number of elements in the sequence. The second line contains the sequence itself.

## Output

The first line should contain the length of the longest subsequence of consecutive numbers. The second line should contain the subsequence itself.

## Constraints

1 ≤ n ≤ 100000

## Example

input:
```
10
1 2 3 4 5 6 7 8 9 10
```

output:
```
10
1 2 3 4 5 6 7 8 9 10
```

## Solution

### Python

```python
n = int(input())
a = list(map(int, input().split()))

max_len = 1
max_seq = [a[0]]

for i in range(1, n):
    if a[i] == a[i - 1] + 1:
        max_len += 1
        max_seq.append(a[i])
    else:
        max_len = 1
        max_seq = [a[i]]

print(max_len)
print(*max_seq)
```

### Java

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxLen = 1;
        int[] maxSeq = new int[n];
        maxSeq[0] = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1] + 1) {
                maxLen++;
                maxSeq[maxLen - 1] = a[i];
            } else {
                maxLen = 1;
                maxSeq[0] = a[i];
            }
        }

        System.out.println(maxLen);
        for (int i = 0; i < maxLen; i++) {
            System.out.print(maxSeq[i] + " ");
        }
    }
}
```

### C++

```cpp
#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    cin >> n;
    vector<int> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    int maxLen = 1;
    vector<int> maxSeq(n);
    maxSeq[0] = a[0];

    for (int i = 1; i < n; i++) {
        if (a[i] == a[i - 1] + 1) {
            maxLen++;
            maxSeq[maxLen - 1] = a[i];
        } else {
            maxLen = 1;
            maxSeq[0] = a[i];
        }
    }

    cout << maxLen << endl;
    for (int i = 0; i < maxLen; i++) {
        cout << maxSeq[i] << " ";
    }
}
```

### C

```c
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    scanf("%d", &n);
    int* a = (int*)malloc(n * sizeof(int));
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }

    int maxLen = 1;
    int* maxSeq = (int*)malloc(n * sizeof(int));
    maxSeq[0] = a[0];

    for (int i = 1; i < n; i++) {
        if (a[i] == a[i - 1] + 1) {
            maxLen++;
            maxSeq[maxLen - 1] = a[i];
        } else {
            maxLen = 1;
            maxSeq[0] = a[i];
        }
    }

    printf("%d\n", maxLen);
    for (int i = 0; i < maxLen; i++) {
        printf("%d ", maxSeq[i]);
    }
}
```

### Haskell

```haskell
import Control.Monad
import Data.List

main = do
    n <- readLn
    a <- liftM (map read . words) getLine
    let maxLen = maximum $ map length $ group a
    let maxSeq = head $ filter ((== maxLen) . length) $ group a
    putStrLn $ show maxLen
    putStrLn $ unwords $ map show maxSeq
```

### JavaScript

```javascript
const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let n;
let a;

rl.on('line', (line) => {
    if (n === undefined) {
        n = parseInt(line);
    } else {
        a = line.split(' ').map(x => parseInt(x));
        rl.close();
    }
}).on('close', () => {
    let maxLen = 1;
    let maxSeq = [a[0]];

    for (let i = 1; i < n; i++) {
        if (a[i] == a[i - 1] + 1) {
            maxLen++;
            maxSeq.push(a[i]);
        } else {
            maxLen = 1;
            maxSeq = [a[i]];
        }
    }

    console.log(maxLen);
    console.log(maxSeq.join(' '));
});
```

### Ruby

```ruby
n = gets.to_i
a = gets.split.map(&:to_i)

max_len = 1
max_seq = [a[0]]

for i in 1..n - 1
    if a[i] == a[i - 1] + 1
        max_len += 1
        max_seq << a[i]
    else
        max_len = 1
        max_seq = [a[i]]
    end
end

puts max_len
puts max_seq.join(' ')
```

### Rust

```rust
use std::io;

fn main() {
    let mut n = String::new();
    io::stdin().read_line(&mut n).unwrap();
    let n: usize = n.trim().parse().unwrap();

    let mut a = String::new();
    io::stdin().read_line(&mut a).unwrap();
    let a: Vec<i32> = a.split_whitespace().map(|x| x.parse().unwrap()).collect();

    let mut max_len = 1;
    let mut max_seq = vec![a[0]];

    for i in 1..n {
        if a[i] == a[i - 1] + 1 {
            max_len += 1;
            max_seq.push(a[i]);
        } else {
            max_len = 1;
            max_seq = vec![a[i]];
        }
    }

    println!("{}", max_len
