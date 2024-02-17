def f(line, char):
    count = line.count(char)
    for i in range(count+1, 0, -1):
        line = line.center(len(line)+i // len(char), char)
    return line