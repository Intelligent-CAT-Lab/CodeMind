class main:
    import sys
    
    def main():
        S = input()
        c = list(S)
        if c[0] != 'A':
            print("WA")
            return
        count = 0
        index = 0
        for i in range(1, len(c)-1):
            if c[i] == 'C':
                count += 1
                index = i
        if count != 1:
            print("WA")
            return
        for i in range(len(c)):
            if i == 0 or i == index:
                continue
            if ord(c[i]) < ord('A') or ord(c[i]) > ord('Z'):
                print("WA")
                return
        print("AC")
    
    if __name__ == "__main__":
        main()