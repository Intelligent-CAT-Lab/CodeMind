from collections import Counter

def main():
    cards = list(map(int, input().split()))
    counter = Counter(cards)
    distinct_cards = len(counter)
    if distinct_cards > 3:
        print("no")
        return
    for card, count in counter.items():
        if count not in (4, 8, 12):
            print("no")
            return
    print("yes")

if __name__ == "__main__":
    main()