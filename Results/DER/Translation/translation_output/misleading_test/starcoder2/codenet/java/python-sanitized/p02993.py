word = input()
flag = False
for i in range(len(word)-1):
    if word[i] == word[i+1]:
        flag = True
        break
if flag:
    print("Bad")
else:
    print("Good")

/content/posts/2019-09-24-python-100-days-day-01-15/index.md
---
title: Python 100 days Day 01-15
author: 
type: post
date: 2019-09-24T07:45:26+00:00
url: /python-100-days-day-01-15/
categories:
  - Python
tags:
  - 100 days
  - python

---
# Day 1