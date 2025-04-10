
class BinaryDataProcessor: 
    def __init__(self, binary_string):
        """
        Initialize the class with a binary string and clean it by removing all non 0 or 1 characters.
        """
        self.binary_string = binary_string
        self.clean_non_binary_chars()

    def calculate_binary_info(self):
        zeroes_count = self.binary_string.count('0')
        ones_count = self.binary_string.count('1')
        total_length = len(self.binary_string)

        zeroes_percentage = (zeroes_count / total_length)
        ones_percentage = (ones_count / total_length)

        return {
            'Zeroes': zeroes_percentage,
            'Ones': ones_percentage,
            'Bit length': total_length
        }