
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + ": ");
        for (int i : prime_factorization(n)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static List<Integer> prime_factorization(int n) {
        List<Integer> res = new ArrayList<>();
        int lim = (int) Math.sqrt(n);

        for (int p = 2; p <= lim; p++) {
            while (n % p == 0) {
                res.add(p);
                n /= p;
            }
        }

        if (n > 1) {
            res.add(n);
        }

        return res;
    }
}
```
/docs/01-introduction/01-introduction.md
# Introduction

## What is competitive programming?

Competitive programming is a mind sport usually held over the Internet, involving participants trying to program according to provided specifications. Competitive programming is commonly known as programming contests or programming competitions.

## Why competitive programming?

Competitive programming is a great way to improve your problem-solving skills. It is also a great way to improve your programming skills.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition is a competition involving participants trying to program according to provided specifications.

## What is a programming contest?

A programming contest is a competition involving participants trying to program according to provided specifications.

## What is a programming competition?

A programming competition
