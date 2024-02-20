package onlineexam.repository;

import java.util.ArrayList;

import onlineexam.model.ExamSchduleModel;

public class ExamRepository {
	static QuestionRepository questRepo=new QuestionRepository();
	ExamSchduleModel model=null;
	public boolean scheduleExam(ExamSchduleModel model)
	{
		this.model=model;
		ArrayList al=questRepo.getAllQuestions();
		if(al.size()>0) {
			System.out.println("exam schdule successfully...!!");
			model.setQuestionBank(al);
			return true;
		}
		else {
			return false;
		}
		
	}
	public ExamSchduleModel getExamSchedule() {
		
		return model!=null?model:null;
	}
}
