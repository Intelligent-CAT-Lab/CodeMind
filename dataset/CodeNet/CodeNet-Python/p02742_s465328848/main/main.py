import sys
 
input = sys.stdin.readline
H, W = list(map(int,input().split()))
 
if H==1 or W==1:
    print((1))
    exit(0)

ans =int((H*W+1) // 2)
print(ans)