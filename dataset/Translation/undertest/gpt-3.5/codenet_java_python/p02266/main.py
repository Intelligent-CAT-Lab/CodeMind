profile = input()

stack_down = []
stack_area = []
stack_edge = []
total_area = 0
pos = 0
lv = 0

for c in profile:
    if c == "\\":
        lv -= 1
        stack_down.append(pos)
    elif c == "/":
        lv += 1
        if stack_down:
            start = stack_down.pop()
            temp_area = pos - start
            total_area += temp_area
            if not stack_area:
                stack_area.append(temp_area)
                stack_edge.append(lv)
            else:
                last_area = 0
                while stack_edge and stack_edge[-1] < lv:
                    last_area += stack_area.pop()
                    stack_edge.pop()
                stack_area.append(last_area + temp_area)
                stack_edge.append(lv)
        else:
            if stack_area:
                stack_edge.pop()
                stack_edge.append(lv)
    pos += 1

print(total_area)
print(len(stack_area), end=" ")
print(" ".join(map(str, stack_area)))