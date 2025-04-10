def test(self):
        self.file_path = "test_example.docx"
        self.handler = DocFileHandler(self.file_path)
        doc = Document()
        doc.add_paragraph("Initial content")
        doc.save(self.file_path)
        new_content = "New content 1"
        self.handler.write_text(new_content)
        text_content = self.handler.read_text()
        return text_content,new_content