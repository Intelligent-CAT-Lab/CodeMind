class main:
    import sys
    
    def solve():
        set_ = set('abcdefghijklmnopqrstuvwxyz')
        line = sys.stdin.readline().strip()
        for ch in line:
            set_.remove(ch)
        if set_:
            print(line + min(set_))
            return
        if line == 'zyxwvutsrqponmlkjihgfedcba':
            print(-1)
            return
        next_('', line)
    
    def next_(cur, line):
        if line.startswith(cur):
            return False
        if len(line) == len(cur):
            if line < cur:
                print(cur)
                return True
            return False
        for ch in 'abcdefghijklmnopqrstuvwxyz':
            if ch not in cur:
                if next_(cur + ch, line):
                    return True
        return False
    
    if __name__ == '__main__':
        solve()