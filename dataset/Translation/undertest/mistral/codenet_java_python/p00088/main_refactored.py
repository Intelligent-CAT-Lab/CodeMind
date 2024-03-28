class main:
    import sys
    
    def encode(key):
        switch key:
            case ' ': return '101'
            case '\'': return '000000'
            case ',': return '000011'
            case '-': return '10010001'
            case '.': return '010001'
            case '?': return '000001'
            case 'A': return '100101'
            case 'B': return '10011010'
            case 'C': return '0101'
            case 'D': return '0001'
            case 'E': return '110'
            case 'F': return '01001'
            case 'G': return '10011011'
            case 'H': return '010000'
            case 'I': return '0111'
            case 'J': return '10011000'
            case 'K': return '0110'
            case 'L': return '00100'
            case 'M': return '10011001'
            case 'N': return '10011110'
            case 'O': return '00101'
            case 'P': return '111'
            case 'Q': return '10011111'
            case 'R': return '1000'
            case 'S': return '00110'
            case 'T': return '0