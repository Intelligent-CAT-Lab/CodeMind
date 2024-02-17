if __name__ == "__main__":
    inputStrings = str(eval(input()))
    outputStrings = []
    isNextA = True
    for i in inputStrings:
        if isNextA == True and i == "A":
            outputStrings.append(i)
            isNextA = False
        elif isNextA == False and i == "Z":
            outputStrings.append(i)
            isNextA = True

    if outputStrings != []:
        if outputStrings[-1] == "A":
            outputStrings.pop(-1)

    output = str()
    for i in outputStrings:
        output += i
    
    if len(output) > 1:
        print(output)
    else:
        print("-1")
        

