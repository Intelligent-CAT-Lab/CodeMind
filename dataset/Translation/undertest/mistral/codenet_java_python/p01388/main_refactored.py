class main:
    def run():
        s = input()
        c = [0, 0, 0, 0]
        for i in range(len(s)):
            if s[i] == 'K':
                c[0] += 1
            elif s[i] == 'U':
                c[1] += 1
            elif s[i] == 'P':
                c[2] += 1
            elif s[i] == 'C':
                c[3] += 1
        print(min(c))
    
    if __name__ == "__main__":
        run()