def test(self):
        self.database_name = "test.db"
        self.processor = DatabaseProcessor(self.database_name)
        table_name = "test_table"
        data = [
            {'name': 'John', 'age': 25},
            {'name': 'Alice', 'age': 30}
        ]
        self.processor.create_table(table_name, 'name', 'age')
        self.processor.insert_into_database(table_name, data)

        result = self.processor.search_database(table_name, 'bbb')
        return result