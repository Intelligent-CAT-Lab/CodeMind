from collections import Counter

def main():
    e = [int(input()) for _ in range(12)]

    distinct_elements = set(e)

    if len(distinct_elements) > 3:
        print("no")
        return

    counts = Counter(e)
    
    for count in counts.values():
        if count not in {4, 8, 12}:
            print("no")
            return
    
    print("yes")

if __name__ == "__main__":
    main()