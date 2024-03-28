class main:
    import sys
    
    def isLatinLetter(c):
        return c >= 'a' and c <= 'z'
    
    def iscodeforces_147_A(c):
        if c == '.': return True
        if c == ',': return True
        if c == '!': return True
        if c == '?': return True
        return False
    
    def main():
        s = sys.stdin.readline().strip()
        sb = []
        sb.append(s[0])
        for i in range(1, len(s)):
            c = s[i]
            if isLatinLetter(c):
                if not isLatinLetter(s[i - 1]):
                    sb.append(' ')
                sb.append(c)
            elif iscodeforces_147_A(c):
                sb.append(c)
        print(''.join(sb))
    
    if __name__ == '__main__':
        main()