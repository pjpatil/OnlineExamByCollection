package onlineexam.service;

import onlineexam.model.ExamSchduleModel;
import onlineexam.repository.ExamRepository;

public class ExamService {
	ExamRepository examRepo=new ExamRepository();
	public boolean scheduleExam(ExamSchduleModel model)
	{
		return examRepo.scheduleExam(model);
	}
	public ExamSchduleModel getExamSchdule() {
		
		return examRepo.getExamSchedule();
	}
}
