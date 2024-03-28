class main:
    def main():
        str = input()
        abc = [0, 0, 0]
        for i in str:
            if i == 'a':
                abc[0] += 1
            elif i == 'b':
                abc[1] += 1
            elif i == 'c':
                abc[2] += 1
        abc.sort()
        print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")
    
    if __name__ == "__main__":
        main()