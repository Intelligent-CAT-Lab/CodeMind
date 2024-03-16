from collections import deque

def main():
    k = int(input())
    queue = deque([i for i in range(1, 10)])
    val = -1
    
    while k > 0:
        val = queue.popleft()
        if val % 10 != 0:
            queue.append(10 * val + val % 10 - 1)
        queue.append(10 * val + val % 10)
        if val % 10 != 9:
            queue.append(10 * val + val % 10 + 1)
        k -= 1
        
    print(val)

if __name__ == "__main__":
    main()