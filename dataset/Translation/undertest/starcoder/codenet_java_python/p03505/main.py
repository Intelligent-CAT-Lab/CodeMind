import sys

def help(K,A,B):
    if A<=B:
        if A>=K:
            return 1
        else:
            return -1
    if A>=K:
        return 1
    dif = (A-B)
    t = (K-A)/dif+((K-A)%dif==0?0:1)
    return 2*t+1

if __name__ == '__main__':
    K,A,B = map(int,sys.stdin.readline().strip().split())
    print(help(K,A,B))