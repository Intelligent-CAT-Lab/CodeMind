# coding: utf-8
a,b=list(map(int,input().split()))
print(('Alice' if abs(a-b)>1 else 'Brown'))