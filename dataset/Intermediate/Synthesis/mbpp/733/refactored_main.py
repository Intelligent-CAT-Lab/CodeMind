A = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
x = 5
(left, right) = (0, len(A) - 1)
result = -1
while left <= right:
    mid = (left + right) // 2
    if x == A[mid]:
        result = mid
        right = mid - 1
    elif x < A[mid]:
        right = mid - 1
    else:
        left = mid + 1
print(result)