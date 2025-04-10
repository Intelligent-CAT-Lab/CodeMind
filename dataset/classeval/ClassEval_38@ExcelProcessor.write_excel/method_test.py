def test(self):

        processor = ExcelProcessor()
        new_data = [
            ('Name', 'Age', 'Country'),
            ('John', 25, 'USA')
        ]
        save_file_name = ''
        success = processor.write_excel(new_data, save_file_name)
        return success