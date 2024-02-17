# -*- coding: utf-8 -*-

def atack(tairyoku):
    if tairyoku == 1:
        return 1
    else:
        return 1 + atack(int(tairyoku/2)) * 2

H = int(eval(input()))

ans = atack(H)

print(ans)