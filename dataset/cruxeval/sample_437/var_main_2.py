def f(tap_hierarchy):
    hierarchy = {}	## hierarchy = []
    for gift in tap_hierarchy:	## gift = [] | tap_hierarchy = []
        hierarchy = hierarchy.fromkeys(gift, None)	## hierarchy = [] | gift = []
    return hierarchy	## hierarchy = []
