import math

def run(input, output):
    input = input.split()
    a = float(input[0])
    b = float(input[1])
    cc = float(input[2])
    cc = math.radians(cc)

    s = a * b * math.sin(cc) / 2.0
    l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
    h = b * math.sin(cc)

    output.write(str(s) + '\n')
    output.write(str(l) + '\n')
    output.write(str(h) + '\n')

if __name__ == '__main__':
    from fileinput import input, output
    run(input(), output())