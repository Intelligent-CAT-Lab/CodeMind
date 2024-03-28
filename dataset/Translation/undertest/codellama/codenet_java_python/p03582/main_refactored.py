class main:
    import sys
    import io
    import time
    
    def solve():
        a = [int(x) for x in input().split()]
        list = []
        for j in range(3):
            for i in range(a[j]):
                list.append(chr(ord('a') + j))
        while len(list) > 1:
            list.sort()
            last = len(list) - 1
            s = list[0] + list[last]
            list[0] = s
            list.pop(last)
        print(list[0])
    
    if __name__ == '__main__':
        start = time.time()
        debug = sys.getProperty('debug')
        if debug is not None:
            try:
                is = io.open(debug, 'r')
            except Exception as e:
                raise RuntimeError(e)
        reader = io.BufferedReader(io.InputStreamReader(is), 32768)
        solve()
        out.flush()
        print((time.time() - start) + 'ms')