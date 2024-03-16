def main():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    sum = 0
    if d <= a:
        print(d)
        return
    sum = a
    d -= a
    if d <= b:
        print(sum)
        return
    d -= b
    sum -= d
    print(sum)

if __name__ == "__main__":
    main()