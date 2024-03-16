def p03227():
    a = input()
    b = list(a)
    c = len(a)

    if c == 3:
        b[0], b[2] = b[2], b[0]

    for i in range(c):
        print(b[i], end='')

# Execute the function if this is the main module
if __name__ == "__main__":
    p03227()