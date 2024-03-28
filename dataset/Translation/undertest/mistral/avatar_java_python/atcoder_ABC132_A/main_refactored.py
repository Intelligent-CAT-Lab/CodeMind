class main:
    import sys
    
    def fast_scanner():
        reader = sys.stdin
        tokenizer = None
    
        def next():
            nonlocal tokenizer
            if tokenizer == None or not tokenizer.hasMoreTokens():
                try:
                    tokenizer = StringTokenizer(reader.readline())
                except Exception as e:
                    raise RuntimeError(e)
            return tokenizer.nextToken()
    
        def next_line():
            nonlocal tokenizer
            if tokenizer == None or not tokenizer.hasMoreTokens():
                try:
                    return reader.readline()
                except Exception as e:
                    raise RuntimeError(e)
            return tokenizer.nextToken("\n")
    
        def next_long():
            return long(next())
    
        def next_int():
            return int(next())
    
        def next_double():
            return float(next())
    
        def next_int_array(n):
            a = [int() for _ in range(n)]
            for i in range(n):
                a[i] = next_int()
            return a
    
        def next_long_array(n):
            a = [long() for _ in range(n)]
            for i in range(n):
                a[i] = next_long()
            return a
    
        return {
            "next": next,
            "next_line": next_line,
            "next_long": next_long,
            "next_int": next_int,
            "next_double": next_double,
            "next_int_array": next_int_array,
            "next_long_array": next_long_array,
        }
    
    
    if __name__ == "__main__":
        sc = fast_scanner()
        s = sc.next()
        chars = set(s.split())
        if len(chars) == 2:
            print("Yes")
        else:
            print("No")