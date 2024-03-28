class main:
    def main(sc):
        str = sc.next()
        abc = [0, 0, 0]
        for i in range(len(str)):
            for j in range(3):
                if str[i] == "abc"[j]:
                    abc[j] += 1
        abc.sort()
    
        print("YES" if (abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2) else "NO")
    
    if __name__ == "__main__":
        sc = input()
        main(sc)