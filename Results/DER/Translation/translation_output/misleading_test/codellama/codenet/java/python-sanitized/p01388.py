import math

def run():
    s = input().toCharArray()
    c = [0, 0, 0, 0]
    for i in range(len(s)):
        if s[i] == 'K':
            c[0] += 1
        elif s[i] == 'U':
            c[1] += 1
        elif s[i] == 'P':
            c[2] += 1
        elif s[i] == 'C':
            c[3] += 1
    print(math.min(c[0], math.min(c[1], math.min(c[2], c[3]))))

if __name__ == '__main__':
    run()