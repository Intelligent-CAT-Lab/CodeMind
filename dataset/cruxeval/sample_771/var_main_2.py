def f(items):
    items = list(items)	## items = []
    odd_positioned = []	## odd_positioned = []
    while len(items) > 0:	## items = []
        position = items.index(min(items))	## position = [] | items = []
        items.pop(position)	## items = [] | position = []
        item = items.pop(position)	## item = [] | items = [] | position = []
        odd_positioned.append(item)	## odd_positioned = [] | item = []
    return odd_positioned	## odd_positioned = []
