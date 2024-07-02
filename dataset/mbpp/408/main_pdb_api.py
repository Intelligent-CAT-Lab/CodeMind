import heapq
def k_smallest_pairs(nums1, nums2, k):
   queue = []
   def push(i, j):
       if i < len(nums1) and j < len(nums2):
           heapq.heappush(queue, [nums1[i] + nums2[j], i, j])
   push(0, 0)
   pairs = []
   while queue and len(pairs) < k:
       _, i, j = heapq.heappop(queue)
       pairs.append([nums1[i], nums2[j]])
       push(i, j + 1)
       if j == 0:
           push(i + 1, 0)
   return pairs
k_smallest_pairs([1,3,7],[2,4,6],2)