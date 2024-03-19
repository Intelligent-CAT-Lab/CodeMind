import sys

def solve(inp, out):
    e, y = map(int, inp.readline().split())

    if e == 0:  # seireki
        if 1868 <= y and y <= 1911:  # meiji
            out.write("M" + str(y - 1867))
        elif 1912 <= y and y <= 1925:  # taishou
            out.write("T" + str(y - 1911))
        elif 1926 <= y and y <= 1988:  # shouwa
            out.write("S" + str(y - 1925))
        else:  # heisei
            out.write("H" + str(