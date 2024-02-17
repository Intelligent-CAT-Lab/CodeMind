moji = "5R2D"
flag = 0
answer = []
for i in range(0,len(moji)):
    if flag == 1:
        flag = 0
        continue
    if moji[i] == "2":
        answer.append("k")
    elif moji[i] == "3":
        answer.append("s")
    elif moji[i] == "4":
        answer.append("t")
    elif moji[i] == "5":
        answer.append("n")
    elif moji[i] == "6":
        answer.append("h")
    elif moji[i] == "7":
        answer.append("m")
    elif moji[i] == "8":
        answer.append("y")
    elif moji[i] == "9":
        answer.append("r")
    elif moji[i] == "0":
        i+=1
        flag = 1
        if moji[i] == "T":
            answer.append("wa")
        elif moji[i] == "D":
            answer.append("wo")
        elif moji[i] == "U":
            answer.append("nn")
    elif moji[i] == "T":
        answer.append("a")
    elif moji[i] == "L":
        answer.append("i")
    elif moji[i] == "U":
        answer.append("u")
    elif moji[i] == "R":
        answer.append("e")
    elif moji[i] == "D":
        answer.append("o")
for i in answer:
    print(i, end="")
print()
