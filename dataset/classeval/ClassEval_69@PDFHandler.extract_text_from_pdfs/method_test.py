def test(self):
        TestPDFHandler.setUpClass()
        TestPDFHandler.setUpClass()
        handler = PDFHandler(TestPDFHandler.test_files)
        result = handler.merge_pdfs("merged.pdf")
        return result,os.path.exists('merged.pdf')