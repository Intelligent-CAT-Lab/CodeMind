import sys

dominoes = [
    """
    aa.
    ..a
    ..a
    """,
    """
    aabc
    ddbc
    bcaa
    bcdd
    """,
    """
    aabba
    bcc.a
    b..cb
    a..cb
    abbaa
    """,
    """
    aabc..
    ddbc..
    ..aabc
    ..ddbc
    bc..aa
    bc..dd
    """,
    """
    aabbcc.
    dd.dd.a
    ..d..da
    ..d..db
    dd.dd.b
    ..d..dc
    ..d..dc
    """
]


dominoes = [domino.replace(' ', '').strip('\n') for domino in dominoes]

n = int(input())

if n == 2:
    print(-1)
    exit(0)

if n == 3:
    print(dominoes[0])
    exit(0)

dominoes = [dom.split('\n') for dom in dominoes[1:]]


def write(ix, col):
    for j in range(ix + 4):
        for i in range(col):
            sys.stdout.write('.')
        sys.stdout.write(dominoes[ix][j])
        for i in range(n - col - (ix + 4)):
            sys.stdout.write('.')
        sys.stdout.write('\n')


col = 0
write(n % 4, col)
col += 4 + n % 4
rem = n - col

while rem > 0:
    write(0, col)
    col += 4
    rem -= 4
