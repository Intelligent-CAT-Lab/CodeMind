import collections
def freq_count(list1):
  freq_count= collections.Counter(list1)
  return freq_count
freq_count([10,10,10,10,20,20,20,20,40,40,50,50,30])