class main:
    import sys
    
    def main():
        profile = sys.stdin.readline().strip()
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
                if stackDown:
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
                    if stackArea:
                        stackEdge.pop()
                        stackEdge.append(lv)
            pos += 1
    
        print(totalArea)
        print(len(stackArea), end=' ')
        if stackArea:
            print(" ", end='')
        for area in stackArea:
            print(area, end=' ')
        print()
    
    if __name__ == '__main__':
        main()