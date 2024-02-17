start = 3
end = 10
interval = 1

steps = list(range(start, end + 1, interval))
if 1 in steps:
    steps[-1] = end + 1
print(len(steps))