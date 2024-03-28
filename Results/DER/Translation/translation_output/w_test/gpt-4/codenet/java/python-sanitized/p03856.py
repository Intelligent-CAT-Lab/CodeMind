# Function to check if a string can be constructed using specific substrings
def can_construct(s, good):
    poss = [False] * (len(s) + 1)
    poss[0] = True
    for i in range(len(s)):
        if not poss[i]:
            continue
        for out in good:
            if i + len(out) > len(s):
                continue
            if s[i:i+len(out)] == out:
                poss[i + len(out)] = True
    return poss[len(s)]

# Main execution code
def main():
    s = input().strip()  # Read a line of input
    good = ["dream", "dreamer", "erase", "eraser"]
    
    # Output 'YES' or 'NO' based on whether the string can be constructed or not
    print("YES" if can_construct(s, good) else "NO")

if __name__ == "__main__":
    main()