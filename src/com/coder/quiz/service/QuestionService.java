package com.coder.quiz.service;



import com.coder.quiz.models.Question;

public class QuestionService {
		
	private Question [] questions; //= new Question[10];
	private int current;
		
	
	 public QuestionService(int size) {
		 questions	= new Question[size];
		 	questions [0] = new Question(1, "Size of short data type", "2", "4", "1", "8", "2");
		 	current++;
		 	questions [current] = new Question(2, "Size of int data type", "2", "4", "1", "8", "2");
		 	current++;
		 	questions [current] = new Question(3, "Size of float data type", "2", "4", "1", "8", "2");
		 	current++;
		 	questions [current] = new Question(4, "Size of double data type", "2", "4", "1", "8", "2");
		 	current++;
		 	questions [current] = new Question(5, "Size of char data type", "2", "4", "1", "8", "2");
		 	current++;
//		 playQuiz();
	 }

	public String addQuestion(Question question) { 
			questions[current] = question;
			current++;
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



