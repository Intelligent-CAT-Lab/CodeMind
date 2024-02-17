text1 = 'jivespdcxc'
text2 = 'sx'
nums = []
for i in range(len(text2)):
    nums.append(text1.count(text2[i]))
print(sum(nums))