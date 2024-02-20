package onlineexam.service;

import java.util.ArrayList;

import onlineexam.model.Question;
import onlineexam.repository.QuestionRepository;

public class QuestionService {
	QuestionRepository qRepo=new QuestionRepository();
	
	/*---------------------- add Questions holding ---------------------------------------*/
	public boolean isAddQuetion(Question q) {
		int qid=qRepo.getId();
		qid+=1;          // qid=qid+1;s
		q.setId(qid);
		boolean b=qRepo.isAddQuetion(q);
//		System.out.println(qid);
		return b;
	}
	
	/*------------------------ show Questions ------------------------------*/
	public ArrayList getAllQuestions()
	{
		ArrayList al=qRepo.getAllQuestions();
		return al.size() > 0 ? al : null;
	}
}
