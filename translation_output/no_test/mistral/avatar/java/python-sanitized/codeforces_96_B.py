import sys

def binary_search(arr, target):
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        mid = (left + right) // 2
        
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
            
    return -1

def codeforces_96_B():
    n = int(input())
    arr = [int(x) for x in input().split()]
    target = int(input())
    
    ans = binary_search(arr, target)
    
    if ans == -1:
        print("Target not found")
    else:
        print(ans)

if __name__ == "__main__":
    codeforces_96_B()