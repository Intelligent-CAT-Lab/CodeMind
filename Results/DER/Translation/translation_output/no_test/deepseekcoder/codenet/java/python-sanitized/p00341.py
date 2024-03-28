from collections import Counter

def main():
    e = [int(input()) for _ in range(12)]
    if len(set(e)) > 3:
        print("no")
        return
    counter = Counter(e)
    for count in counter.values():
        if count != 4 and count != 8 and count != 12:
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()