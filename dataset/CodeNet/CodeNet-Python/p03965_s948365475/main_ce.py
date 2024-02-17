s = "gpg"
g_num = 1
p_num = 0
win = 0
lose = 0
if s[0] == 'p':
    lose += 1
for i in range(1, len(s)):
    if s[i] == 'p':
        if p_num < g_num:
            p_num += 1
        else:
            g_num += 1
            lose += 1
    else:
        if p_num < g_num:
            p_num += 1
            win += 1
        else:
            g_num += 1
print(win - lose)