def to32(s):
    # Pad or slice the binary string to ensure it is 32 bits
    if len(s) < 32:
        s = '0' * (32 - len(s)) + s
    elif len(s) > 32:
        s = s[-32:]
    return s


def main():
    x = int(input())
    
    # Convert to binary string and perform the shifts
    twobit = bin(x)[2:]
    left = bin(x << 1)[2:]
    right = bin(x >> 1)[2:]
    
    # Adjust strings to be 32-bits long
    twobit = to32(twobit)
    left = to32(left)
    right = to32(right)
    
    # Output the various binary strings as requested
    print(twobit)
    print(''.join('1' if bit == '0' else '0' for bit in twobit))
    print(left)
    print(right)

# Execute the main function
if __name__ == "__main__":
    main()