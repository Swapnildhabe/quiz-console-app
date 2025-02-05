package com.coder.quiz.service;



import com.coder.quiz.models.Question;

public class QuestionService {
		
	private Question [] questions = new Question[5];
	
		
	
	 public QuestionService() {
		 	questions [0] = new Question(1, "Size of short data type", "2", "4", "1", "8", "2");
		 	questions [1] = new Question(2, "Size of int data type", "2", "4", "1", "8", "2");
		 	questions [2] = new Question(3, "Size of float data type", "2", "4", "1", "8", "2");
		 	questions [3] = new Question(4, "Size of double data type", "2", "4", "1", "8", "2");
		 	questions [4] = new Question(5, "Size of char data type", "2", "4", "1", "8", "2");
//		 playQuiz();
	 }

	public String addQuestion(Question question) {
		return "Question Added Successfully";
	}
	
	public String updateQuestion(Question question) {
		return "Question Update Successfully";
	}
	
	public String deleteQuestion(Question question) {
		return "Question Delete Successfully";
	}
	
	public Question[] getAllQuestion() {
		return questions;
	}


}



