class main:
    import sys
    
    def main():
        s = sys.stdin.readline().strip()
        t = ""
        for i in range(len(s)):
            if s[i]!= 'B':
                t += s[i]
            elif t == "":
                continue
            else:
                t = t[:-1]
        print(t)
    
    if __name__ == '__main__':
        main()