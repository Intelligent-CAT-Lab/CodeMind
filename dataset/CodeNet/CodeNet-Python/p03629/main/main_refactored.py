class main:
	# import sys
	from sys import stdout
	# from copy import copy, deepcopy
	# from functools import lru_cache
	# from string import ascii_lowercase
	# from math import inf
	# inf = float('inf')
	
	
	def main():
	    ans = solve_case()
	    stdout.write("{}\n".format(ans))
	
	def solve_case():
	    S = read_str()
	
	    len_s = len(S)
	    int_s = [ord(c) - ord('a') for c in S]
	
	    # next_char_pos[from_idx][letter_idx] := the position of the next letter `letter_idx` from `from_idx`
	    next_char_pos = make_list((len_s + 1, 26), len_s)
	    for from_idx in reversed(list(range(len_s))):
	        for letter_idx in range(26):
	            if int_s[from_idx] == letter_idx:
	                pos = from_idx
	            else:
	                pos = next_char_pos[from_idx+1][letter_idx]
	            next_char_pos[from_idx][letter_idx] = pos
	
	    # non_subseq_len[from_idx] := the length of the shortest "non subsequence" in S[from_idx:]
	    non_subseq_len = make_list([len_s + 2], len_s + 1)
	    non_subseq_len[len_s] = 1
	    non_subseq_len[len_s + 1] = 0
	    ans_next_pos = make_list([len_s + 1], len_s)
	    ans_letter = make_list([len_s + 1], -1)
	    for from_idx in reversed(list(range(len_s))):
	        for letter_idx in range(26):
	            new_len = non_subseq_len[next_char_pos[from_idx][letter_idx] + 1] + 1
	            if non_subseq_len[from_idx] > new_len:
	                non_subseq_len[from_idx] = new_len
	                ans_letter[from_idx] = letter_idx
	                ans_next_pos[from_idx] = next_char_pos[from_idx][letter_idx] + 1
	
	    ans = ''
	    idx = 0
	    while idx < len(S):
	        ans += chr(ord('a') + ans_letter[idx])
	        idx = ans_next_pos[idx]
	    return ans
	
	#################################
	
	def read_str(): return eval(input())
	def read_int(): return int(eval(input()))
	def read_str_list(): return input().split(' ')
	def read_int_list(): return list(map(int, input().split(' ')))
	def read_lines(n, read_func): return [read_func() for _ in range(n)]
	def list_to_str(l, sep=' '): return sep.join(map(str, l))
	l2s = list_to_str
	# shape: tuple of ints | list of ints
	def make_list(shape, value=None):
	    if len(shape) == 1:
	        return [value] * shape[0]
	    return [make_list(shape[1:], value) for _ in range(shape[0])]
	
	if __name__ == '__main__':
	    # sys.setrecursionlimit(1000000)
	    main()
