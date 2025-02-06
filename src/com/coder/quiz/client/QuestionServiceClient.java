package com.coder.quiz.client;


import com.coder.quiz.models.Question;
import com.coder.quiz.service.QuestionService;

public class QuestionServiceClient {
	public static void main(String[] args) {
		QuestionService questionService = new QuestionService(10);
			Question question1 = new Question(6, "Java Born Year", "1885", "1920","1995", "2005", "1995");
			questionService.addQuestion(question1);
			
			Question question2 = new Question(7, "Java Born Year", "1885", "1920","1995", "2005", "1995");
			questionService.addQuestion(question2);
			
			Question question3 = new Question(8, "Java Born Year", "1885", "1920","1995", "2005", "1995");
			questionService.addQuestion(question3);
			
			Question question4 = new Question(6, "Java Born Year", "1885", "1920","1995", "2005", "1995");
			questionService.addQuestion(question4);
			
			Question question5 = new Question(7, "Java Born Year", "1885", "1920","1995", "2005", "1995");
			questionService.addQuestion(question5);	
	}  

}
