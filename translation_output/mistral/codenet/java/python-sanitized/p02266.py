import sys

def p02266():
    profile = sys.stdin.readline()
    stackDown = []
    stackArea = []
    stackEdge = []
    totalArea = 0
    pos = 0
    lv = 0

    for c in profile:
        if c == '\\':
            lv -= 1
            stackDown.append(pos)
        elif c == '/':
            lv += 1
            if not stackDown:
                continue
            start = stackDown.pop()
            tempArea = pos - start
            totalArea += tempArea
            if not stackArea:
                stackArea.append(tempArea)
                stackEdge.append(lv)
            else:
                lastArea = 0
                while stackEdge and stackEdge[-1] < lv:
                    lastArea += stackArea.pop()
                    stackEdge.pop()
                stackArea.append(lastArea + tempArea)
                stackEdge.append(lv)
        else:
            pos += 1

    print(totalArea)
    print(len(stackArea))
    if len(stackArea) != 0:
        print(" ", end="")
    itr = iter(stackArea)
    for i in range(len(stackArea)):
        print(itr.__next__(), end=" ")
    print()

if __name__ == '__main__':
    p02266()