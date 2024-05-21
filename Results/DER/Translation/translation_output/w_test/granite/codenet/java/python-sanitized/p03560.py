import heapq

def dijkstra(start, end, graph):
    visited = set()
    queue = [(0, start, [])]
    while queue:
        (cost, current, path) = heapq.heappop(queue)
        if current not in visited:
            visited.add(current)
            path = path + [current]
            if current == end:
                return cost, path
            for next in graph[current]:
                if next not in visited:
                    heapq.heappush(queue, (cost + 1, next, path))
    return float('inf')

def main():
    k = int(input())
    graph = {i: [] for i in range(k)}
    for i in range(1, 10):
        for j in range(i, k, i):
            graph[j].append((j * 10 + i) % k)
    print(dijkstra(1, 0, graph)[0])

if __name__ == "__main__":
    main()