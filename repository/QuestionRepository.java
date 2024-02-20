package onlineexam.repository;
import java.util.*;

import onlineexam.model.Question;

public class QuestionRepository {
	static ArrayList al=new ArrayList();   // it is my temporary database
	
	public int getId() {
		return al.size();
	}
	
	/*------------------ Add Qur=estion to database (collection)----------------------------*/
	public boolean isAddQuetion(Question q) {
		boolean b=al.add(q);
		return b;
	}
	public ArrayList getAllQuestions()
	{
		return al;
	}
}
