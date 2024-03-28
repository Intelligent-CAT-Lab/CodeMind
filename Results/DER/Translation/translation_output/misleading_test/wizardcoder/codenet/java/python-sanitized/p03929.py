import java.util.*; import java.io.*; import java.math.*;

class p03929:
    def solve():
        one = nextIntArray()
        N = one.get(0)
        d = one.get(1)
        if N <= 2:
            myout(0)
            return
        N -= 3
        loop = N // 11
        amari = N % 11
        map = [[1,1,1,2,2,3,4,4,5,5,5], [0,1,2,2,3,3,3,4,4,4,5], [1,1,1,2,2,2,3,3,4,5,5],
                [0,0,1,1,2,3,3,4,4,4,5], [1,2,2,3,3,3,4,4,4,5,5], [0,0,1,1,1,2,2,3,4,4,5],
                [0,1,1,2,3,3,4,4,4,5,5], [1,1,2,2,2,3,3,3,4,4,5], [0,1,1,1,2,2,3,4,4,5,5],
                [1,1,2,3,3,4,4,4,5,5,5], [0,1,1,1,2,2,2,3,3,4,5]]
        myout(loop * 5 + map[d][amari])

    #Method addition frame start
    #Method addition frame end

    #Don't have to see. start------------------------------------------
    def myconv(list, no):
        joinString = CONVSTR.get(no)
        if isinstance(list, str):
            return joinString.join(list)
        elif isinstance(list, list):
            return joinString.join(list)
        else:
            raise ClassCastException("Don't join")

    def myconv(str, no):
        splitString = CONVSTR.get(no)
        return str.split(splitString)

    def nextIntArray():
        input = nextStrArray()
        ret = []
        for i in range(len(input)):
            ret.append(int(input[i]))
        return ret

    def nextLongArray():
        input = nextStrArray()
        ret = []
        for i in range(len(input)):
            ret.append(long(input[i]))
        return ret

    def nextStrArray():
        return myconv(next(), 8)

    def nextCharArray():
        return myconv(next(), 0)

    def next():
        if hasNext():
            return ii.next()
        else:
            raise IndexOutOfBoundsException("