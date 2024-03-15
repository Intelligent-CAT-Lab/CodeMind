import sys

def read_line():
    return sys.stdin.readline().strip()

def read_num():
    return int(read_line())

def read_long():
    return long(read_line())

def read_flds():
    return read_line().split()

def read_nums():
    return [int(fld) for fld in read_flds()]

def read_longs():
    return [long(fld) for fld in read_flds()]

def p(c):
    sys.stdout.write(c)

def pln(c):
    sys.stdout.write(c + '\n')

def p(d):
    sys.stdout.write(str(d))

def pln(d):
    sys.stdout.write(str(d) + '\n')

def p(l):
    sys.stdout.write(str(l))

def pln(l):
    sys.stdout.write(str(l) + '\n')

def p(s):
    sys.stdout.write(s)

def pln(s):
    sys.stdout.write(s + '\n')

def p(ia):
    for i in ia:
        pln(i)

def pln(la):
    for i