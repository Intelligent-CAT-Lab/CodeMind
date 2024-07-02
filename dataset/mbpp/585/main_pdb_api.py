import heapq
def expensive_items(items,n):
  expensive_items = heapq.nlargest(n, items, key=lambda s: s['price'])
  return expensive_items
expensive_items([{'name': 'Item-1', 'price': 101.1},{'name': 'Item-2', 'price': 555.22}],1)