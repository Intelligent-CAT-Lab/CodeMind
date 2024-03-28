import sys

class p02251:
    def solve(self):
        n = int(input())
        ans = 0

        #25cent
        ans += n//25
        n %= 25

        #10cent
        ans += n//10
        n %= 10

        #5cent
        ans += n//5
        n %= 5

        #1cent
        ans += n

        print(ans)


# <p02251 Method>
if __name__ == "__main__":
    p02251().solve()

# <Default Method>
def max(*ar):
    return max(ar)

def min(*ar):
    return min(ar)

def calcManhatDistance(x1, y1, x2, y2):
    d = abs(x1-x2)+abs(y1-y2)
    return d

def calcEuclidDistance(x1, y1, x2, y2):
    d = ((x2-x1)**2+(y2-y1)**2)**0.5
    return d

def isPrime(n):
    if n==2: return True
    if n<2 or n%2==0: return False
    d = int(n**0.5)
    for i in range(3, d+1, 2):
        if n%i==0: return False
    return True

def printChar2DArray(ar):
    for i in range(len(ar)):
        for j in range(len(ar[0])):
            sys.stdout.write(ar[i][j])
        print()