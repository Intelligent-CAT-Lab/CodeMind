def f(tap_hierarchy):
    hierarchy = {}
    for gift in tap_hierarchy:
        hierarchy = hierarchy.fromkeys(gift, None)
    return hierarchy