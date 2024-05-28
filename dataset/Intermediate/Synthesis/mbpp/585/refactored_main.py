items = [{'name': 'Item-1', 'price': 101.1},{'name': 'Item-2', 'price': 555.22}]
n = 1
expensive_items = heapq.nlargest(n, items, key=lambda s: s['price'])
print(expensive_items)