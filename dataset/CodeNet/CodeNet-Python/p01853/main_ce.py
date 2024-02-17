#!/usr/bin/env python3
# -*- coding: utf-8 -*-
n,m = map(int,"3 100".split())
points = ["0"] * n
for i in range(n//2 + 1, n):
    points[i] = str(m)
print(" ".join(points))