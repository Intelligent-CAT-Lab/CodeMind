class main:
    import re
    
    def solve_quadratic(coefficients):
        a, b, c = coefficients
        if a == 0:
            return []
        delta = b**2 - 4*a*c
        if delta < 0:
            return []
        elif delta == 0:
            return [-b/(2*a)]
        else:
            return [(-b - delta**0.5) / (2*a), (-b + delta**0.5) / (2*a)]
    
    def parse_expression(expression):
        coefficients = [0, 0, 0]
        for term in re.findall(r'[+-]?\d*x\^?\d*', expression):
            coeff, power = term.split('x')
            if not coeff:
                coeff = 1
            if '^' in power:
                power = int(power[1:])
            else:
                power = 1
            coefficients[power] += int(coeff)
        return coefficients
    
    def format_expression(roots):
        if not roots:
            return "No real roots"
        roots.sort()
        return "".join(["(x" + ("+" if root >= 0 else "") + str(root) + ")" for root in roots])
    
    def main():
        expression = input()
        coefficients = parse_expression(expression)
        roots = solve_quadratic(coefficients)
        print(format_expression(roots))
    
    if __name__ == "__main__":
        main()