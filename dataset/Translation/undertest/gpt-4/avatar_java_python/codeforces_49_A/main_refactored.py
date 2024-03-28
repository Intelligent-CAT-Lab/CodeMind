class main:
    def is_sleuth(question):
        # Remove potential whitespace and the question mark at the end
        original_question = question.rstrip('?').strip()
        # Get the last character from the remaining string
        last_char = original_question[-1].upper()
        # Define the vowels
        vowels = {'A', 'E', 'I', 'O', 'U', 'Y'}
        # Check if the last character is a vowel
        return 'YES' if last_char in vowels else 'NO'
    
    # Test input
    test_input = "BueDOlxgzeNlxrzRrMbKiQdmGujEKmGxclvaPpTuHmTqBp?"
    # Expected output: 'NO'
    print(is_sleuth(test_input))