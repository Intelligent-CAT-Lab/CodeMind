import sys

def main():
    insn = GetInput.getArrayInt()
    a = insn[0]
    b = insn[1]
    c = insn[2]
    d = insn[3]

    t = c // b
    tt = c % b
    y = a // d
    u = a % d

    while a >= 0 or c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return

def ff(combinationSum):
    return combinationSum % (10 ** 9 + 7)

def combinationSum(n, coins, l):
    if n < 0:
        return -1
    if n == 0:
        return l

    coinCount = sys.maxsize
    for coin in coins:
        currCoin = combinationSum(n - coin, coins, l + 1)
        if currCoin == -1:
            continue
        if currCoin < coinCount:
            coinCount = currCoin

    if coinCount == sys.maxsize:
        return -1
    return coinCount

class GetInput:
    bufferedReader = BufferedReader(InputStreamReader(sys.stdin))

    def getCharArray():
        charArray = []
        try:
            string = GetInput.getInputString()
            for i in range(string.length()):
                charArray.append(string.charAt(i))
            return charArray
        except Exception as e:
            e.printStackTrace()
            return charArray

    def getArrayInt():
        string = bufferedReader.readLine().split("\\s+")
        array = []
        for i in range(string.length):
            array.append(int(string[i]))
        return array

    def getInt():
        try:
            string = bufferedReader.readLine()
            return int(string)
        except IOException as e:
            e.printStackTrace()
            return 0

    def getInputString():
        try:
            string = bufferedReader.readLine()
            return string
        except IOException as e:
            e.printStackTrace()
            return ""

    def getLongInput():
        try:
            string = bufferedReader.readLine()
            return long(string)
        except IOException as e:
            e.printStackTrace()
            return 0

    def getLongArrayInput():
        string = bufferedReader.readLine().split("\\s+")
        array = []
        for i in range(string.length):
            array.append(long(string[i]))
        return array

if __name__ == "__main__":
    main()