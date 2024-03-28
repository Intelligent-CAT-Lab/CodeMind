class main:
    def solve(e, y):
        if e == 0:  # seireki
            if 1868 <= y <= 1911:  # meiji
                print("M" + str(y - 1867))
            elif 1912 <= y <= 1925:  # taishou
                print("T" + str(y - 1911))
            elif 1926 <= y <= 1988:  # shouwa
                print("S" + str(y - 1925))
            else:  # heisei
                print("H" + str(y - 1988))
        elif e == 1:  # meiji
            print(1867 + y)
        elif e == 2:  # taishou
            print(1911 + y)
        elif e == 3:  # shouwa
            print(1925 + y)
        elif e == 4:  # heisei
            print(1988 + y)
    
    # Test input (could be replaced with e, y = map(int, input().split()) to read from standard input)
    e, y = 0, 2015
    solve(e, y)