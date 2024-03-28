class main:
    import re
    
    def process_text(text):
        text = text.replace('.', ',')
        text = text.replace(',', ' ')
        words = text.split()
        result = []
    
        for word in words:
            if 3 <= len(word) <= 6:
                result.append(word)
    
        return ' '.join(result)
    
    # Test input
    text = "Rain, rain, go to Spain."
    
    # Call the function and print the result
    print(process_text(text))