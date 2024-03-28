def longest_substring(s):
    current_length = 0
    length = 0
    for char in s:
        if char in 'ACGT':
            current_length += 1
        else:
            if current_length > length:
                length = current_length
            current_length = 0
    return max(length, current_length)

def n_combination_3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1
    return num

def main():
    s = input()
    print(longest_substring(s))

if __name__ == "__main__":
    main()