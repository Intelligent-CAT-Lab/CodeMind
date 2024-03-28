class main:
    import sys
    
    def main():
        input = sys.stdin.readline
        x, y, a, b = map(int, input().split())
        res = []
        for i in range(a, x+1):
            for j in range(b, y+1):
                if i <= j:
                    continue
                res.append(str(i) + " " + str(j))
        print(len(res))
        for i in res:
            print(i)
    
    if __name__ == "__main__":
        main()