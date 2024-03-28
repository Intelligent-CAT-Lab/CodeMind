class main:
    import sys
    
    def p04001():
        S = sys.stdin.readline()
        if len(S) == 1:
            print(S)
            sys.exit(0)
        N = [int(char) for char in S]
    
        patternCount = 1
        tmpBit = ""
        for i in range(len(N)):
            N[i] = int(S[i])
            if i > 0:
                patternCount *= 2
                tmpBit += "1"
    
        sum = 0
        for i in range(patternCount):
            bin = bin(i)[2:]
            while len(bin) < len(tmpBit):
                bin = "0" + bin
            add = str(N[0])
            for j in range(len(bin)):
                if bin[j] == '1':
                    sum += int(add)
                    add = ""
                add += str(N[j + 1])
            if len(add) > 0:
                sum += int(add)
    
        print(sum)
    
    if __name__ == "__main__":
        p04001()