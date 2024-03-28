def run():
    s = input()
    c = [0] * 4
    for char in s:
        if char == 'K':
            c[0] += 1
        if char == 'U':
            c[1] += 1
        if char == 'P':
            c[2] += 1
        if char == 'C':
            c[3] += 1
    print(min(c))

if __name__ == "__main__":
    run()