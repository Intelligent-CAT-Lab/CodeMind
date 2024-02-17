#!/usr/bin/env python3
a, b, x = map(int, input().split())
print((x + max(x - b, 0) // (a - b) * b) % 1000000007)

