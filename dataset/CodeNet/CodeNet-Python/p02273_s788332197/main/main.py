#!/usr/bin/env python3
import sys,collections
n = int(sys.stdin.readline())

def koch(p1,p2,n):
  if n == 0:
    return [p1,p2]
  ret = []
  #s = [(p2[0]-p1[0])/3.0+p1[0],]
  s = [(p2[0]+2*p1[0])/3.0,(p2[1]+2*p1[1])/3.0]
  #t = [2*(p2[0]-p1[0])/3.0+p1[0],]
  t = [(2*p2[0]+p1[0])/3.0,(2*p2[1]+p1[1])/3.0]
  u = [(t[0]+s[0]+1.73205*(s[1]-t[1]))/2.0,(1.73205*(t[0]-s[0])+t[1]+s[1])/2.0]
  if n == 1:
    return [p1,s,u,t,p2]
  for l in [[p1,s],[s,u],[u,t],[t,p2]]:
    ret += koch(l[0],l[1],n-1)[:-1]
  ret += [p2]
  return ret
# X-a = (1(x-a)-r3(y-b))/2
# X = (x+a+r3(b-y))/2
# X = (t[0]+s[0]+r3(s[1]-t[1]))/2
# Y-b = (r3(x-a)+(y-b))/2
# Y = (r3(x-a)+y+b)/2
# Y = (r3(t[0]-s[0])+t[1]+s[1])/2
print(("\n".join([str(p1)+" "+str(p2) for p1,p2 in koch([0.0,0.0],[100.0,0.0],n)])))

