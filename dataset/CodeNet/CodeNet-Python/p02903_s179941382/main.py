import sys
def input(): return sys.stdin.readline().rstrip()
def main():
    h,w,a,b=map(int,input().split())
    S=[]
    for i in range(b):
        S.append("1"*a+"0"*(w-a))
    for i in range(h-b):
        S.append("0"*a+"1"*(w-a))   
    for i in range(h):
        print(S[i])

if __name__=='__main__':
    main()