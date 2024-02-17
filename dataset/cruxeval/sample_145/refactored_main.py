price = 8.50
product = 'grapes'
inventory = ['olives', 'key', 'orange']
if product not in inventory:
    print(price)
else:
    price *=.85
    inventory.remove(product)
    print(price)