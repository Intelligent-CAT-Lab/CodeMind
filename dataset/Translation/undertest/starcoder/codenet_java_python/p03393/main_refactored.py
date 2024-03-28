class main:
    import sys
    
    class p03393:
        def solve(self):
            s = sys.stdin.readline().strip()
            for ch in s:
                if ch in 'atcoder':
                    s = s.replace(ch, '')
            if len(s) == 0:
                print(-1)
            else:
                print(s + 'b')
    
    if __name__ == '__main__':
        p03393().solve()