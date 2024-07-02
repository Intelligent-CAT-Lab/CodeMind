import heapq as hq
def heap_queue_largest(nums,n):
  largest_nums = hq.nlargest(n, nums)
  return largest_nums
heap_queue_largest( [25, 35, 22, 85, 14, 65, 75, 22, 58],3)