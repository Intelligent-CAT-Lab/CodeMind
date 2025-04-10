def test(self):

        jobMarketplace = JobMarketplace()
        jobMarketplace.resumes = [{"name": "Tom", "skills": ['skill1', 'skill2'], "experience": "experience"}, {"name": "John", "skills": ['skill3', 'skill4'], "experience": "experience"}]
        jobMarketplace.job_listings = [{"job_title": "Software Engineer", "company": "ABC Company", "requirements": ['skill6', 'skill7']}]
        return jobMarketplace.get_job_applicants(jobMarketplace.job_listings[0])