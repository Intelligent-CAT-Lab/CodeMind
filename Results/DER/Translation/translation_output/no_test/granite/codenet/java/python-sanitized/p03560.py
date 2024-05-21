import heapq

def dijkstra(start, end, graph):
    dist = [float('inf')] * end
    visited = [False] * end
    dist[start] = 0
    heap = [(0, start)]

    while heap:
        (cur_dist, cur_node) = heapq.heappop(heap)
        if visited[cur_node]:
            continue
        visited[cur_node] = True

        for neighbor, weight in graph[cur_node]:
            if not visited[neighbor]:
                new_dist = cur_dist + weight
                if new_dist < dist[neighbor]:
                    dist[neighbor] = new_dist
                    heapq.heappush(heap, (new_dist, neighbor))

    return dist[end - 1]

def main():
    k = int(input())
    graph = [[] for _ in range(k)]
    for i in range(1, min(10, k)):
        graph[i].append((i * 10 % k, i))

    print(dijkstra(1, k, graph))

if __name__ == "__main__":
    main()