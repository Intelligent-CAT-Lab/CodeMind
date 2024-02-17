# -*- coding: utf-8 -*-
def atack(tairyoku):
    if tairyoku == 1:
        return 1
    else:
        return 1 + atack(int(tairyoku/2)) * 2
H = int("2")
ans = atack(H)
print(ans)