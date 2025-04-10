def test(self):
        self.processor = NLPDataProcessor2()
        string_list = ["12345", "Special@Characters"]
        expected_output = [[], ['specialcharacters']]
        return self.processor.process_data(string_list),expected_output