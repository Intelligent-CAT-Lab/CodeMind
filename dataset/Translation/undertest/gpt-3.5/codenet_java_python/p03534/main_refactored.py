class main:
    class P03534:
        def main(self, input_string):
            str = input_string
            abc = [0, 0, 0]
            for i in range(len(str)):
                for j in range(3):
                    if str[i] == "abc"[j]:
                        abc[j] += 1
    
            abc.sort()
    
            print("YES" if ((abc[1] - abc[0] < 2) and (abc[2] - abc[0] < 2)) else "NO")
    
    # Test input
    input_string = "abac"
    
    # Calling the main function
    P03534().main(input_string)