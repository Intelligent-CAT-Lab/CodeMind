# -*- coding: utf-8 -*-
inputlist = list(map(int, input().split()))

a = inputlist[0]
b = inputlist[1]
c = inputlist[2]

oishii = b + c
gedoku = a + b
doku = c

if doku - gedoku > 1 :
    tabereru_doku = gedoku + 1
else :
    tabereru_doku = doku

tabereta_doku = tabereru_doku

print((tabereta_doku + b))
