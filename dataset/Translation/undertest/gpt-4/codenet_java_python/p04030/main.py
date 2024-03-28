def main():
    s = input().strip()
    t = ""
    for char in s:
        if char != 'B':
            t += char
        elif t:
            t = t[:-1]
    print(t)

if __name__ == "__main__":
    main()

# Test case
# input_string = "01B0"
# Expected output: "00"