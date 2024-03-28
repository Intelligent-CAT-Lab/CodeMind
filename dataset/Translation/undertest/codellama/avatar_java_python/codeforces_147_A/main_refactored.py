class main:
    import sys
    
    def is_latin_letter(c):
        return c >= 'a' and c <= 'z'
    
    def is_codeforces_147_A(c):
        if c == '.':
            return True
        if c == ',':
            return True
        if c == '!':
            return True
        if c == '?':
            return True
        return False
    
    def main():
        s = sys.stdin.readline().strip()
        sb = []
        n = len(s)
        sb.append(s[0])
        for i in range(1, n):
            c = s[i]
            if is_latin_letter(c):
                if not is_latin_letter(s[i - 1]):
                    sb.append(' ')
                sb.append(c)
            elif is_codeforces_147_A(c):
                sb.append(c)
        print(''.join(sb))
    
    if __name__ == '__main__':
        main()