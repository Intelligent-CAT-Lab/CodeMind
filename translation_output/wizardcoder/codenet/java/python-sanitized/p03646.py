import java.util.*; import java.io.*; import java.math.*;

class p03646:
    def solve():
        K = nextLong()
        N = 50
        list = [K // N + i for i in range(N)]
        for i in range(K % N):
            list[i % N] += N + 1
            for j in range(N):
                list[j] -= 1
        myout(N)
        output = [str(list[i]) for i in range(N)]
        myout(myconv(output, 8))

    #Method addition frame start
    #Method addition frame end

    #Don't have to see. start------------------------------------------
    class InputIterator:
        inputLine = []
        index = 0
        max = 0
        read = ""
        def __init__(self):
            br = BufferedReader(InputStreamReader(System.in))
            try:
                while((read = br.readLine())!= None):
                    inputLine.append(read)
            except IOException:
                pass
            max = len(inputLine)
        def hasNext(self):
            return self.index < self.max
        def next(self):
            if(self.hasNext()):
                return self.inputLine[self.index]
            else:
                raise IndexError("