
L = { " ": "101",
      "'": "000000",
      ",": "000011",
      "-": "10010001",
      ".": "010001",
      "?": "000001",
      "A": "100101",
      "B": "10011010",
      "C": "0101",
      "D": "0001",
      "E": "110",
      "F": "01001",
      "G": "10011011",
      "H": "010000",
      "I": "0111",
      "J": "10011000",
      "K": "0110",
      "L": "00100",
      "M": "10011001",
      "N": "10011110",
      "O": "00101",
      "P": "111",
      "Q": "10011111",
      "R": "1000",
      "S": "00110",
      "T": "00111",
      "U": "10011100",
      "V": "10011101",
      "W": "000010",
      "X": "10010010",
      "Y": "10010011",
      "Z": "10010000" }

T = "ABCDEFGHIJKLMNOPQRSTUVWXYZ .,-'?"

de = dict()
for i in range(32):
    s = "{:05b}".format(i)
    ch = T[i]
    de[ch] = s

de2 = dict()
for k, v in list(L.items()):
    de2[v] = k

while True:
    try:
        t = eval(input())
    except:
        break
    codebit = ""
    for i in t:
        codebit += de[i]

    s = ""
    while True:
        if len(codebit) == 0:
            break
        if len(codebit) < 6 and int(codebit,2) == 0:
            break
        for k in range(3,9):
            if codebit[:k] in de2:
                s += de2[codebit[:k]]
                codebit = codebit[k:]
                break
    print(s)


