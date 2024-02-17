import sys
def solve():
    L = "KUPCkupcKUPC"
    data = []
    data.append(L.count("K"))
    data.append(L.count("U"))
    data.append(L.count("P"))
    data.append(L.count("C"))
    print min(data)
if __name__ == "__main__":
    solve()
   