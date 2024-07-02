import heapq as hq
def heap_sort(iterable):
    h = []
    for value in iterable:
        hq.heappush(h, value)
    return [hq.heappop(h) for i in range(len(h))]
heap_sort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0])