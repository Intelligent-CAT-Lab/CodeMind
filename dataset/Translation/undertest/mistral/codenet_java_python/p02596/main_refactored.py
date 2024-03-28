class main:
    import sys
    
    def set_io(file_name):
        global f, out
        f = open(file_name + ".in", "r")
        out = open(file_name + ".out", "w")
    
    def ni():
        return int(input())
    
    def nl():
        return input().split()
    
    def nia(N):
        st = nl()
        A = [int(x) for x in st]
        return A
    
    def main():
        set_io("p02596")
        N = ni()
        l = len(str(N))
        m = 0
        for i in range(l):
            m = (10 * m + 7) % N
        i = l
        vis = [False] * N
        while True:
            if vis[m]:
                print(-1)
                break
            vis[m] = True
            if m == 0:
                print(i)
                break
            m = (10 * m + 7) % N
            i += 1
    
    if __name__ == "__main__":
        main()