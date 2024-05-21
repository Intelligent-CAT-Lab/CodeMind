import heapq

def solve():
    a = list(map(int, input().split()))
    heap = []
    for i in range(3):
        for j in range(a[i]):
            heapq.heappush(heap, (chr(ord('a') + i), i))
    while len(heap) > 1:
        s1, i1 = heapq.heappop(heap)
        s2, i2 = heapq.heappop(heap)
        heapq.heappush(heap, (s1 + s2, (i1 + i2) % 3))
    print(heapq.heappop(heap)[0])

def main():
    t = 1
    # t = int(input())
    for _ in range(t):
        solve()

if __name__ == "__main__":
    main()