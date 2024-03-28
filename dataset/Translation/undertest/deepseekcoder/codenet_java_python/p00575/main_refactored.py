class main:
    def main():
        a, b, c = map(int, input().split())
        i = 0
        cnt = 0
        while cnt < c:
            i += 1
            cnt += a
            if i % 7 == 0:
                cnt += b
        print(i)
    
    if __name__ == "__main__":
        main()