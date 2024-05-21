def main():
    a = input()
    ans = 0
    for i in range(len(a)):
        head = a[:i]
        tail = a[i:]
        h, t = 0, 0
        if head:
            h = int(head)
        if tail:
            t = int(tail)
        if t < 0:
            continue
        if h > t:
            continue
        if (h + t) % 2!= 0:
            continue
        if (t - h) % 2!= 0:
            continue
        ans += 1
    print(ans)

if __name__ == "__main__":
    main()