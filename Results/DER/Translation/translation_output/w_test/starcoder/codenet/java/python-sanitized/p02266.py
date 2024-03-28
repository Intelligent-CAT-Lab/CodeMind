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
			if len(stackDown)!= 0:
				start = stackDown.pop()
				tempArea = pos - start
				totalArea += tempArea
				if len(stackArea) == 0:
					stackArea.append(tempArea)
					stackEdge.append(lv)
				else:
					lastArea = 0
					while len(stackEdge)!= 0 and stackEdge[-1] < lv:
						lastArea += stackArea.pop()
						stackEdge.pop()
					stackArea.append(lastArea + tempArea)
					stackEdge.append(lv)
			else:
				if len(stackArea)!= 0:
					stackEdge.pop()
					stackEdge.append(lv)
		pos += 1
	print(totalArea)
	print(len(stackArea))
	if len(stackArea)!= 0:
		print(" ")
	for i in stackArea:
		print(i, end=' ')
	print("")

if __name__ == "__main__":
	main()