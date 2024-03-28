class main:
    import sys
    
    def main():
        s = int(input())
        set = set()
        i = 1
        while True:
            i += 1
            if s % 2 == 0:
                s = s // 2
            else:
                s = 3 * s + 1
            if s in set:
                print(i)
                return
            set.add(s)
    
    if __name__ == "__main__":
        main()