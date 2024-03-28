import sys

def calculate_score(s1):
    won = 0
    lose = 0
    g = 0
    p = 0

    for i in s1:
        if i == 'g':
            if p == g:
                g += 1
            elif p < g:
                p += 1
                won += 1
        elif i == 'p':
            if p == g:
                g += 1
                lose += 1
            elif p < g:
                p += 1
            else:
                g += 1
                lose += 1

    return won - lose

if __name__ == "__main__":
    s1 = sys.stdin.readline().strip()
    print(calculate_score(s1))