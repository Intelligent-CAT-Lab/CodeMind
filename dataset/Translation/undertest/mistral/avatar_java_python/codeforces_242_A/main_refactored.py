class main:
    import sys
    
    def main():
        x, y, a, b = map(int, input().split())
        res = []
        for i in range(a, x+1):
            for j in range(b, y+1):
                if i <= j:
                    continue
                res.append(str(i) + " " + str(j))
        print(len(res))
        for s in res:
            print(s)
    
    if __name__ == "__main__":
        main()