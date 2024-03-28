class main:
    import sys
    
    def fast_reader():
        br = sys.stdin
        st = None
    
        def next_line():
            str = ""
            try:
                str = br.readline()
            except Exception as e:
                e.printStackTrace()
            return str
    
        def next_int():
            return int(next())
    
        def next_long():
            return long(next())
    
        def next_double():
            return float(next())
    
        def next():
            global st
            while st is None or not st.has_more_elements():
                try:
                    st = str.split()
                except Exception as e:
                    e.printStackTrace()
            return st[0]
    
    
    if __name__ == "__main__":
        s = fast_reader()
        obj = p02786()
        sum = 0
        h = int(s.next_long())
        if h == 1:
            print(1)
        else:
            count = 1
            while h > 1:
                h = h // 2
                sum += (1 << count)
                count += 1
            print(sum + 1)