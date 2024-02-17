# coding: utf-8
# Your code here!
import sys
sys.setrecursionlimit(10**6)
readline = sys.stdin.readline
n = int("6")
#n, op = [i for i in readline().split()]
a21 = [["a","a"],["b","b"]]
a22 = [["c","d"],["c","d"]]
a3 = [["a","a","."],[".",".","b"],[".",".","b"]]
a4 = [["q","q","r","s"],["t","t","r","s"],["u","x","v","v"],["u","x","w","w"]]
a5 = [["c","c","d","d","l"],["e","f","f",".","l"],["e",".",".","h","g"],["i",".",".","h","g"],["i","j","j","k","k"]]
a7 = [["c","c","d","d",".",".","e"],[".","f","f",".",".","g","e"],[".",".","h","h",".","g","i"],["j",".",".",".","k",".","i"],["j","l",".",".","k",".","."],["m","l",".",".","n","n","."],["m",".",".","o","o","p","p"]]
if n == 2: print(-1)
else:
    if n == 3:
        ans = a3
    elif n%2 == 0:
        ans = [["."]*n for i in range(n)]
        for i in range(n//2):
            for j in range(2):
                for k in range(2):
                    ans[2*i+j][2*i+k] = a21[j][k]
        for i in range(n//2):
            for j in range(2):
                for k in range(2):
                    ans[2+2*i+j-n][2*i+k] = a22[j][k]
    elif n%4==1:
        ans = [["."]*n for i in range(n)]
        for i in range(5):
            for j in range(5):
                ans[i][j] = a5[i][j]
        for i in range((n-5)//2):
            for j in range(2):
                for k in range(2):
                    ans[5+2*i+j][5+2*i+k] = a21[j][k]
        for i in range((n-5)//2):
            for j in range(2):
                for k in range(2):
                    c = 5+2+2*i+j
                    d = 5+2*i+k
                    if c >= n:
                        c = 5+j
                    ans[c][d] = a22[j][k]
    elif n%4==3:
        ans = [["."]*n for i in range(n)]
        for i in range(7):
            for j in range(7):
                ans[i][j] = a7[i][j]
        for i in range((n-7)//2):
            for j in range(2):
                for k in range(2):
                    ans[7+2*i+j][7+2*i+k] = a21[j][k]
        for i in range((n-7)//2):
            for j in range(2):
                for k in range(2):
                    c = 7+2+2*i+j
                    d = 7+2*i+k
                    if c >= n:
                        c = 7+j
                    ans[c][d] = a22[j][k]
    for i in ans:
        print(*i,sep="")
