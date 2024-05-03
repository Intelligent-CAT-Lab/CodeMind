def f(tap_hierarchy):
    hierarchy = {}	## hierarchy = CLRJ
    for gift in tap_hierarchy:	## gift = CLRJ | tap_hierarchy = CLRJ
        hierarchy = hierarchy.fromkeys(gift, None)	## hierarchy = CLRJ | gift = CLRJ
    return hierarchy	## hierarchy = CLRJ
