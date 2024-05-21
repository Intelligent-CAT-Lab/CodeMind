def main():
    w, h = map(int, input().split())

    if w == 1 or h == 1:
        print(1)
        return

    c = (w*h)%2 == 0 and (w*h)//2 or (w*h)//2 + 1
    print(c)

if __name__ == "__main__":
    main()