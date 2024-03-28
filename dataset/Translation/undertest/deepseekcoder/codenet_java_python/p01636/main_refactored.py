class main:
    import sys
    
    def run():
        a = sys.stdin.readline().strip()
        ans = 0
        for i in range(len(a)):
            head = a[:i]
            tail = a[i:]
            if tail == "0":
                continue
            if head == "" or head == "-":
                h = 0
            else:
                h = int(head)
            if tail == "" or tail[0] == '0':
                t = 0
            else:
                t = int(tail)
            if t < 0:
                continue
            if h > t:
                continue
            if (h + t) % 2 != 0:
                continue
            if (t - h) % 2 != 0:
                continue
            ans += 1
        print(ans)
    
    if __name__ == "__main__":
        run()