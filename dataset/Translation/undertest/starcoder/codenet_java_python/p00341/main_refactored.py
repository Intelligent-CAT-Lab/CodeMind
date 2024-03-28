class main:
    import sys
    
    def main():
        e = []
        for i in range(12):
            e.append(int(sys.stdin.readline()))
        if len(set(e)) > 3:
            print("no")
            return
        e.sort()
        if e.count(e[0])!= 4 or e.count(e[1])!= 8 or e.count(e[2])!= 12:
            print("no")
            return
        print("yes")
    
    if __name__ == "__main__":
        main()