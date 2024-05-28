import heapq as hq
iterable = [1, 3, 5, 7, 9, 2, 4, 6, 8, 0]
h = []
for value in iterable:
    hq.heappush(h, value)
print([hq.heappop(h) for i in range(len(h))])