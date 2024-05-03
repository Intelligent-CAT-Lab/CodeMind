def f(tap_hierarchy):
    hierarchy = {}	## <state>hierarchy = CLRJ</state>
    for gift in tap_hierarchy:	## <state>gift = CLRJ | tap_hierarchy = CLRJ</state>
        hierarchy = hierarchy.fromkeys(gift, None)	## <state>hierarchy = CLRJ | gift = CLRJ</state>
    return hierarchy	## <state>hierarchy = CLRJ</state>
