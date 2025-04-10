def test(self):

        self.file_path = "test_example.docx"
        self.handler = DocFileHandler(self.file_path)
        doc = Document()
        doc.add_paragraph("Initial content")
        doc.save(self.file_path)

        text_content = self.handler.read_text()
        expected_content = "Initial content"

        new_content = "New content 1"
        self.handler.write_text(new_content)
        text_content = self.handler.read_text()

        heading = "Test Heading 1"
        self.handler.add_heading(heading)
        doc = Document(self.file_path)
        headings = [p.text for p in doc.paragraphs if p.style.name.startswith('Heading')]

        data = [['Name', 'Age']]
        self.handler.add_table(data)
        doc = Document(self.file_path)
        table = doc.tables[0]

        if os.path.exists(self.file_path):
            os.remove(self.file_path)
        return text_content,expected_content,text_content,new_content,heading,headings,len(table.rows),len(table.columns)