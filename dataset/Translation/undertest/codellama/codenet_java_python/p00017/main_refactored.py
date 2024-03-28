class main:
    import re
    
    def decode(ciphertext):
        # Split the ciphertext into words
        words = ciphertext.split()
        
        # Initialize the decoded text
        decoded_text = ""
        
        # Loop through each word in the ciphertext
        for word in words:
            # Check if the word is a keyword
            if word in ["the", "this", "that"]:
                # If it is a keyword, add it to the decoded text
                decoded_text += word + " "
            else:
                # If it is not a keyword, decode the word
                decoded_word = decode_word(word)
                # Add the decoded word to the decoded text
                decoded_text += decoded_word + " "
        
        # Return the decoded text
        return decoded_text.strip()
    
    def decode_word(word):
        # Initialize the decoded word
        decoded_word = ""
        
        # Loop through each character in the word
        for char in word:
            # Check if the character is a letter
            if char.isalpha():
                # If it is a letter, decode the character
                decoded_char = decode_char(char)
                # Add the decoded character to the decoded word
                decoded_word += decoded_char
            else:
                # If it is not a letter, add the character to the decoded word
                decoded_word += char
        
        # Return the decoded word
        return decoded_word
    
    def decode_char(char):
        # Get the index of the character in the alphabet
        index = ord(char) - ord('a')
        
        # Check if the index is less than 0
        if index < 0:
            # If it is, add 26 to the index to wrap it around to the end of the alphabet
            index += 26
        
        # Return the decoded character
        return chr(index + ord('a'))
    
    # Test the decode function with the sample input
    print(decode("xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt."))