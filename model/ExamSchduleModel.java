package onlineexam.model;

import java.util.ArrayList;

public class ExamSchduleModel {

	private int id;
	private String name;
	private String date;
	private String starTime;
	private String endTime;
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getStarTime() {
		return starTime;
	}


	public void setStarTime(String starTime) {
		this.starTime = starTime;
	}


	public String getEndTime() {
		return endTime;
	}


	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


	public ArrayList getQuestionBank() {
		return questionBank;
	}


	private ArrayList questionBank;
	
	
	public void setQuestionBank(ArrayList questionBank) {
		this.questionBank = questionBank;
	}
}
