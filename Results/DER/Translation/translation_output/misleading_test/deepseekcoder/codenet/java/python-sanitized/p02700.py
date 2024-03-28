import sys

def main():
    insn = GetInput.getArrayInt()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c//b
    tt = c%b
    y = a//d
    u = a%d
    while(a >=0 or c>=0):
        c = c - b
        if c <=0:
            print("Yes")
            return
        a = a - d
        if a<=0:
            print("No")
            return

def ff(combinationSum):
    return int(combinationSum%(pow(10,9)+7))

def combinationSum(n, coins, l):
    if n<0:
        return -1
    if n==0:
        return l

    coinCount = sys.maxsize
    for coin in coins:
        currCoin = combinationSum(n - coin, coins, l+1)
        if currCoin == -1:
            continue
        if currCoin < coinCount:
            coinCount = currCoin
    if coinCount == sys.maxsize:
        return -1
    return coinCount

class GetInput:
    @staticmethod
    def getArrayInt():
        array = list(map(int, sys.stdin.readline().split()))
        return array

if __name__ == "__main__":
    main()