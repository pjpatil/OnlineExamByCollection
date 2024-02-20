package onlineexam.client;

import java.util.*;

import onlineexam.model.ExamSchduleModel;
import onlineexam.model.Question;
import onlineexam.service.ExamService;
import onlineexam.service.QuestionService;

public class onlineExamClientApplication {

	public static void main(String[] args) {

		QuestionService qService = new QuestionService();
		ExamService examService=new ExamService();
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("+----------------------------------------------+");
			System.out.println("1:Add New Question");
			System.out.println("2:View all Question");
			System.out.println("3:Add New Exam with Schedule");
			System.out.println("4:View Question by Exam");
			System.out.println("+----------------------------------------------+");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter quetion and option whitch answer");
				String qname = sc.nextLine();
				String op1 = sc.nextLine();
				String op2 = sc.nextLine();
				String op3 = sc.nextLine();
				String op4 = sc.nextLine();
				String answer = sc.nextLine();

				Question q = new Question(qname, op1, op2, op3, op4, answer);  // set data to Question model 
				// qService.isAddQuetion(q);
				boolean b = qService.isAddQuetion(q);
				if (b) {
					System.out.println("Quetion added success...!");
				} else {
					System.out.println("Some problem...........");
				}

				break;
			case 2:
				ArrayList al = qService.getAllQuestions();
				if (al != null) {
					for (Object obj : al) {
						Question ques = (Question) obj;
						System.out.println(
								ques.getId() + "\t" + ques.getName() + "\t" + ques.getOp1() + "\t" + ques.getOp2()
										+ "\t" + ques.getOp3() + "\t" + ques.getOp4() + "\t" + ques.getAnswer());
					}
				} 
				else {
					System.out.println("No data present in collection (^..^)");
				}
				break;

			case 3:
					System.out.println("Enter exam id, name ,date,start time,end time");
					int examId=sc.nextInt();
					String examName=sc.nextLine();
					String examDate=sc.nextLine();
					String startTime=sc.nextLine();
					String endTime=sc.nextLine();
					
					ExamSchduleModel examModel=new ExamSchduleModel();
					examModel.setId(examId);
					sc.nextLine();
					examModel.setName(examName);
					examModel.setDate(examDate);
					examModel.setStarTime(startTime);
					examModel.setEndTime(endTime);
					
					b=examService.scheduleExam(examModel);
					
					if(b) {
						System.out.println("Exam Schedule Successfully.....");
					}
					else {
						System.out.println("there ids no question bank so no exam schedule");
					}
				break;

			case 4:
				examModel= examService.getExamSchdule();
				if(examModel!=null)
				{
					System.out.println(examModel.getId()+"\t"+examModel.getName()+"t"+examModel.getDate()+"\t"+examModel.getStarTime()+"\t"+examModel.getEndTime());
					al=examModel.getQuestionBank();
					System.out.println("==========================================================");
					for(Object obj:al)
					{
						q=(Question)obj;
						System.out.println(q.getId()+"\t"+q.getName()+"\t"+q.getOp1()+"\t"+q.getOp2()+"\t"+q.getOp3()+"\t"+q.getOp4()+"\t"+q.getAnswer());
					}
				}
				break;
				
			default:
				System.out.println("Wrong choise");
			}
		} while (true);

	}
}
