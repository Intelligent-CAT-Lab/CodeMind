#!/usr/bin/env python3
# -*- coding: utf-8 -*-
# 問題：https://atcoder.jp/contests/abc126/tasks/abc131_a

s = input()
is_good = True
for i in range(len(s)-1):
    if s[i] == s[i+1]:
        is_good = False
        break

print('Good') if is_good else print('Bad')

