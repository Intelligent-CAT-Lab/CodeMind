def f(lines):
    for i in range(len(lines)):
        lines[i] = lines[i].center(len(lines[-1]))
    return lines