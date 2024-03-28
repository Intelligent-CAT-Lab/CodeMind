import sys

X = int(sys.stdin.readline())
Y = int(sys.stdin.readline())

i=0
while(X<=Y):
    i+=1
    X*=2

print(i)