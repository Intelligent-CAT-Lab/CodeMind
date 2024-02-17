#!/usr/bin/env python3
import sys
import math
MOD = 1000000007  # type: int
from collections import Counter
def prime_decomposition(n):
  i = 2
  table = []
  while i * i <= n:
    while n % i == 0:
      n //= i
      table.append(i)
    i += 1
  if n > 1:
    table.append(n)
  return table

def solve(N: int):
    soinsuu = prime_decomposition(math.factorial(N))
    counter = Counter(soinsuu)
    answer =1
    for value in counter.values():
        answer = answer*(value+1)
    print(answer%MOD)
    return


def main():
    def iterate_tokens():
        for line in sys.stdin:
            for word in line.split():
                yield word
    tokens = iterate_tokens()
    N = int(next(tokens))  # type: int
    solve(N)

if __name__ == '__main__':
    main()
