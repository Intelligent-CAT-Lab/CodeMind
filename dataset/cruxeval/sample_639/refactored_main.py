perc = "xabxfiwoexahxaxbxs"
full = "xbabcabccb"
reply = ""
i = 0
while perc[i] == full[i] and i < len(full) and i < len(perc):
    if perc[i] == full[i]:
        reply += "yes "
    else:
        reply += "no "
    i += 1
print(reply)