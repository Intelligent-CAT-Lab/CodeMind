import sys

def fast_scanner():
    br = sys.stdin
    st = StringTokenizer("")
    def next():
        while not st.hasMoreTokens():
            try:
                st = StringTokenizer(br.readline())
            except:
                raise Exception("Input error")
        return st.nextToken()
    def nextInt():
        return int(next())
    def readArray(n):
        a = [int(nextInt()) for _ in range(n)]
        return a
    def nextLong():
        return long(next())
    return {
        "next": next,
        "nextInt": nextInt,
        "readArray": readArray,
        "nextLong": nextLong,
        "nextline": None
    }

if __name__ == "__main__":
    sc = fast_scanner()
    s = sc.next()
    t = sc.next()
    mah = s + t
    a = int(mah)
    b = int(math.sqrt(a))
    if b*b == a:
        print("Yes")
    else:
        print("No")