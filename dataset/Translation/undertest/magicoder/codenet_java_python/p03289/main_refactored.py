class main:
    import sys
    
    def main():
        S = sys.stdin.readline().rstrip()
        if S[0] != 'A':
            print("WA")
            return
        count = 0
        index = 0
        for i in range(2, len(S) - 1):
            if S[i] == 'C':
                count += 1
                index = i
        if count != 1:
            print("WA")
            return
        for i in range(len(S)):
            if i == 0 or i == index:
                continue
            if S[i].isupper():
                print("WA")
                return
        print("AC")
    
    if __name__ == "__main__":
        main()