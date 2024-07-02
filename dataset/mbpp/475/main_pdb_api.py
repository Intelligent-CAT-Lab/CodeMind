from collections import Counter
def sort_counter(dict1):
 x = Counter(dict1)
 sort_counter=x.most_common()
 return sort_counter
sort_counter({'Math':81, 'Physics':83, 'Chemistry':87})