import java.util
import java.io
import java.math

def solve():
    K = int(input())
    N = 50
    list = [K // N + i for i in range(N)]
    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1
    print(N)
    output = [str(x) for x in list]
    print(myconv(output, 8))

def myconv(lst, no):
    if isinstance(lst, str):
        return myconv(lst.split(CONVSTR[no]), no)
    elif isinstance(lst, list):
        return myconv(lst, no)
    else:
        raise TypeError("Invalid input")

def myout(t):
    print(t)

def myerr(t):
    print("debug:", t)

def next():
    return ii.next()

def hasNext():
    return ii.hasNext()

def nextInt():
    return int(next())

def nextLong():
    return long(next())

def nextDouble():
    return float(next())

def nextStrArray():
    return nextCharArray()

def nextCharArray():
    return next()

def nextIntArray():
    return [int(x) for x in nextStrArray()]

def nextLongArray():
    return [long(x) for x in nextStrArray()]

CONVSTR = {8: " ", 9: "\n", 0: ""}
ii = InputIterator()
out = PrintWriter(sys.stdout)

def flush():
    out.flush()

def myout(t):
    out.write(t)

def myerr(t):
    print("debug:", t)

def next():
    return ii.next()

def hasNext():
    return ii.hasNext()

def nextInt():
    return nextIntArray()[0]

def nextLong():
    return nextLongArray()[0]

def nextDouble():
    return nextDoubleArray()[0]

def nextStrArray():
    return nextCharArray()

def nextCharArray():
    return next()

def nextIntArray():
    return nextStrArray()

def nextLongArray():
    return nextStrArray()

def myconv(lst, no):
    if isinstance(lst, str):
        return myconv(lst.split(CONVSTR[no]), no)
    elif isinstance(lst, list):
        return myconv(lst, no)
    else:
        raise TypeError("Invalid input")

def myconv(lst, no):
    if isinstance(lst, str):
        return myconv(lst.split(CONVSTR[no]), no)
    elif isinstance(lst, list):
        return myconv(lst, no)
    else:
        raise TypeError("Invalid input")

def main():
    CONVSTR[8] = " "
    CONVSTR[9] = "\n"
    CONVSTR[0] = ""
    solve()
    flush()

if __name__ == "__main__":
    main()