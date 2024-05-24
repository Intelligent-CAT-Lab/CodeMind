def binomial_Coeff(n,k): 
    C = [0] * (k + 1); 
    C[0] = 1; # nC0 is 1 
    for i in range(1,n + 1):  
        for j in range(min(i, k),0,-1): 
            C[j] = C[j] + C[j - 1]; 
    return C[k]; 
def sum_Of_product(n): 
    return binomial_Coeff(2 * n,n - 1); 