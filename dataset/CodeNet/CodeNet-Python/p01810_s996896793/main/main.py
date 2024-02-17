# coding: utf-8
# Here your code !

def main(N,k):
    p = 0
    p2 = 0
    memo = 0
    for i in range(N-1):
        p, p2 = p2, k*(p2+1)//(k-1) - 2
        while p2-1-p2//k != p:
            p2+=1
    return p2

if __name__ == '__main__':
    N,k=input().split()
    print((main(int(N),int(k))))