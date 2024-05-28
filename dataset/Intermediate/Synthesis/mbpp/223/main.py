def is_majority(arr, n, x):
	i = binary_search(arr, 0, n-1, x)
	if i == -1:
		return False
	if ((i + n//2) <= (n -1)) and arr[i + n//2] == x:
		return True
	else:
		return False
def binary_search(arr, low, high, x):
	if high >= low:
		mid = (low + high)//2 
		if (mid == 0 or x > arr[mid-1]) and (arr[mid] == x):
			return mid
		elif x > arr[mid]:
			return binary_search(arr, (mid + 1), high, x)
		else:
			return binary_search(arr, low, (mid -1), x)
	return -1