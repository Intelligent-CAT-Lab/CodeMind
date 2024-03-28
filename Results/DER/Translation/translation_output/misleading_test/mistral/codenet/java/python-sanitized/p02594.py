from sys import stdin

def fast_scan():
    br = stdin
    st = StringTokenizer("")

    def next():
        while not st.hasMoreTokens():
            try:
                st = StringTokenizer(br.readline())
            except:
                raise Exception("Error reading input")
        return st.nextToken()

    def next_int():
        return int(next())

    def read_array(n):
        a = [next_int() for _ in range(n)]
        return a

    def next_long():
        return long(next())

    return {
        "next": next,
        "nextInt": next_int,
        "readArray": read_array,
        "nextLong": next_long,
    }

if __name__ == "__main__":
    fast = fast_scan()
    x = fast["nextInt"]
    if x >= 30:
        print("Yes")
    else:
        print("No")