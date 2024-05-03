from collections import Counter
from typing import List

def main():
    e: List[int] = []
    for _ in range(12):
        e.append(int(input()))

    if len(set(e)) > 3:
        print("no")
        return

    e.sort()
    for num in set(e):
        each = e.count(num)
        if each not in [4, 8, 12]:
            print("no")
            return

    print("yes")

if __name__ == "__main__":
    main()