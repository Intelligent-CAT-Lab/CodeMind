class main:
    import math
    
    def binary_search(arr, x):
        low = 0
        high = len(arr) - 1
        while low <= high:
            mid = (low + high) // 2
            if arr[mid] == x:
                return mid
            elif arr[mid] < x:
                low = mid + 1
            else:
                high = mid - 1
        return -1
    
    def find_next(base, K):
        arr = []
        for i in range(1, int(base)+1):
            arr.append(i)
        for i in range(int(base)+1, int(K*base)+1):
            arr.append(i)
        for i in range(int(K*base)+1, int(math.sqrt(K*base))+1):
            arr.append(i)
        for i in range(int(math.sqrt(K*base))+1, int(K*base)+1):
            arr.append(i)
        arr.append(int(K*base))
        arr.sort()
        for i in range(len(arr)-1, -1, -1):
            if arr[i] <= base:
                return arr[i]
        return -1
    
    def main():
        base, K = map(int, input().split())
        next = find_next(base, K)
        ans = 1
        while next > 0:
            base = next
            ans += 1
            next = find_next(base, K)
        print(ans)
    
    if __name__ == '__main__':
        main()