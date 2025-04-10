
class JobMarketplace: 
    def __init__(self):
        self.job_listings = []
        self.resumes = []

    def submit_resume(self, name, skills, experience):
        resume = {"name": name, "skills": skills, "experience": experience}
        self.resumes.append(resume)