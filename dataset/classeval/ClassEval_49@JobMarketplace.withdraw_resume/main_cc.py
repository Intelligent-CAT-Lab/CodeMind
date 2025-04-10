
class JobMarketplace: 
    def __init__(self):
        self.job_listings = []
        self.resumes = []

    def withdraw_resume(self, resume):
        self.resumes.remove(resume)