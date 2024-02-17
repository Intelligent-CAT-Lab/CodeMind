txt = "11 1 1"
coincidences = {}
for c in txt:
    if c in coincidences:
        coincidences[c] += 1
    else:
        coincidences[c] = 1
print(sum(coincidences.values()))