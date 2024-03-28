class main:
    import sys
    import math
    import array
    
    class Reader:
        def __init__(self, inp):
            self.inp = inp
            self.st = None
    
        def next_string(self):
            while self.st is None or not self.st.has_more_tokens():
                self.st = array.array('c', self.inp.readline())
            return self.st.next_token()
    
        def next_int(self):
            return int(self.next_string())
    
        def next_long(self):
            return long(self.next_string())
    
        def next_double(self):
            return float(self.next_string())
    
    class P:
        def __init__(self, id, d):
            self.id = id
            self.d = d
    
        def compare_to(self, p):
            return self.d - p.d
    
    def main():
        sc = Reader(sys.stdin)
        out = sys.stdout
        n = sc.next_int()
        c = sc.next_string().to_char_array()
        l = len(c)
    
        if c[0] == '0' or c[l - 1] == '1':
            out.write(-1)
            out.flush()
            return
        else:
            for i in range(l // 2):
                if c[i] != c[l - i - 2]:
                    out.write(-1)
                    out.flush()
                    return
    
        out.write(1 + " " + 2)
    
        for i in range(3, l):
            out.write(s + " " + i)
            if c[i - 2] == '1':
                s = i
    
        out.flush()
    
    if __name__ == "__main__":
        main()