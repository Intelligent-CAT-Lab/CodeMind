from collections import Counter

def main():
    e = list(map(int, input().split()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    count = Counter(e)

    for k, v in count.items():
        if v != 4 and v != 8 and v != 12:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()