import sys

def solve():
    n = int(input())
    powMap = {}
    powMap[0] = 0
    powMap[1] = 1
    base = 2
    while True:
        powVal = (base ** 5)
        powMap[powVal] = base
        if powVal - n > 0:
            break
        base += 1
    for k, v in powMap.items():
        diff = abs(n - k)
        if k in powMap:
            print(v)
            if k - n < 0:
                print("-" + powMap[diff])
            else:
                print(" " + powMap[diff])
            return
    return

def fast_scan():
    reader = sys.stdin
    st = None
    def next():
        nonlocal st
        if st == None or not st.hasMoreElements():
            st = StringTokenizer(reader.readline())
        return st.nextToken()
    def nextLine():
        nonlocal st
        st = None
        return reader.readline()
    def nextInt():
        return int(next())
    def nextLong():
        return long(next())
    def nextIntArr(n):
        retArr = [None] * n
        for i in range(n):
            retArr[i] = nextInt()
        return retArr
    def nextLongArr(n):
        retArr = [None] * n
        for i in range(n):
            retArr[i] = nextLong()
        return retArr
    def close():
        reader.close()
    return fast_scan()

if __name__ == "__main__":
    mainObj = p02690()
    mainObj.solve()