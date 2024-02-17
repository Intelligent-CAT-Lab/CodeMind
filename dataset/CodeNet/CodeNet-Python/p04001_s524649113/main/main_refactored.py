class main:
	class Formula():
	    def __init__(self, S):
	        self.input = S
	        self.sum = 0
	        self.input_len = len(S)
	
	        self.input_split_pos = self.input_len - 1
	        self.mask = 2**self.input_split_pos - 1
	
	    def calc_sum(self, S: str, split_pos: int) -> int:
	        stack = []
	        split_pos = [i for i, x in enumerate(
	            [int(x) for x in bin(split_pos)[2:].zfill(self.input_split_pos)]) if x == 1]
	
	        start = 0
	        if split_pos == []:
	            stack.append(int(self.input))
	        else:
	            for i in split_pos:
	                stack.append(int(self.input[start:i + 1]))
	                start = i + 1
	            stack.append(int(self.input[start:self.input_len]))
	        self.sum += sum(stack)
	        return self.sum
	
	
	def main():
	    S = eval(input())
	    formula = Formula(S)
	
	    bits = 0b0
	
	    while bits <= formula.mask:
	        formula.calc_sum(S, bits & formula.mask)
	        bits += 1
	    print((formula.sum))
	
	
	main()
