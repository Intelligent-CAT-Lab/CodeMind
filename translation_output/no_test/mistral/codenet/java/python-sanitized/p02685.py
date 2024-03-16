import sys

def input():
    stream = sys.stdin
    buf = bytearray(1024)
    curChar = 0
    numChars = -1
    filter = SpaceCharFilter()
    br = BufferedReader(InputStreamReader(stream))

    def read():
        nonlocal numChars
        if numChars == -1:
            raise InputMismatchException()

        if curChar >= numChars:
            curChar = 0
            try:
                numChars = stream.read(buf)
            except IOError:
                raise InputMism