#!/usr/bin/env python3
a, b, x = map(int, "3 1 5".split())
print((x + max(x - b, 0) // (a - b) * b) % 1000000007)
