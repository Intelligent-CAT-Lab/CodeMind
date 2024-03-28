class main:
    def compute(S):
        for i in range(26):
            converted = ""
            for c in S:
                if 'a' <= c <= 'z':
                    converted += chr((ord(c) - ord('a') + i) % 26 + ord('a'))
                else:
                    converted += c
            if "the" in converted or "this" in converted or "that" in converted:
                print(converted)
                break
    
    # Test input
    compute("xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.")