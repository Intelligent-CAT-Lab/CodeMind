tap_hierarchy = ['john', 'doe', 'the', 'john', 'doe']
hierarchy = {}
for gift in tap_hierarchy:
    hierarchy = hierarchy.fromkeys(gift, None)
print(hierarchy)