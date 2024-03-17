def main():
    try:
        while True:
            inp = input().split(" ")
            a, b, c, d = map(int, inp)
            start = max(a,c)
            end = min(b,d)
            print( (end-start) if (end-start)>0 else 0 )
    except EOFError:
        pass

if __name__ == "__main__":
    main()