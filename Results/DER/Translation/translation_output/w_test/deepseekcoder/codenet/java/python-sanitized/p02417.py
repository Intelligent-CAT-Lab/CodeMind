from collections import defaultdict

def count_letters(text):
    counts = defaultdict(int)
    for char in text:
        if char.isalpha():
            counts[char.lower()] += 1
    return counts

def main():
    text = input()
    counts = count_letters(text)
    for char in sorted(counts.keys()):
        print(f"{char} : {counts[char]}")

if __name__ == "__main__":
    main()