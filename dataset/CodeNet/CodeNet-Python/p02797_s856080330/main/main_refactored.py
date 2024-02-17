class main:
	#!/usr/bin/env python3
	# -*- coding: utf-8 -*-
	
	import array
	from bisect import *
	from collections import *
	import fractions
	import heapq
	from itertools import *
	import math
	import random
	import re
	import string
	import sys
	
	N, K, S = list(map(int, input().split()))
	
	if S == 10**9:
	    ans = [S] * K + [1] * (N - K)
	else:
	    ans = [S] * K + [10**9] * (N - K)
	print((*ans))
