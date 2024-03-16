def run():
    s = input()
    c = [0, 0, 0, 0]
    for char in s:
        if char == 'K':
            c[0] += 1
        elif char == 'U':
            c[1] += 1
        elif char == 'P':
            c[2] += 1
        elif char == 'C':
            c[3] += 1
    print(min(c))

if __name__ == "__main__":
    run()