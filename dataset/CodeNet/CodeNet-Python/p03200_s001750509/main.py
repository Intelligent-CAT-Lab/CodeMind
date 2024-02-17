# -*- coding: utf-8 -*-
#AGC029A https://atcoder.jp/contests/agc029/tasks/agc029_a
import sys
#import collections

#n= int(input())
#s= input()
#tmp = input().split()
#n,m = list(map(lambda a: int(a), tmp))
s= input()

n=len(s)

cnt=0
total=0
for i in range(0,n):
	if(s[i]=="B"):
		cnt+=1
	else:
		total+=cnt
print(total)
