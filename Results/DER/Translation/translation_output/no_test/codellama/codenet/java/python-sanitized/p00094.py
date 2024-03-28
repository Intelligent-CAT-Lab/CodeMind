import sys

while True:
    try:
        line = sys.stdin.readline()
        if not line:
            break
        values = line.split()
        area = float(values[0]) * float(values[1])
        print(area / 3.305785)
    except ValueError:
        break