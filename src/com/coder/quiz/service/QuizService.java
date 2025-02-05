package com.coder.quiz.service;

import java.util.Scanner;

import com.coder.quiz.models.Question;

public class QuizService {
	private String[] userSelectedQuestions = new String[5];
	private Question[] questions;
	
	 public QuizService() {
		QuestionService questionService = new QuestionService();
		questions = questionService.getAllQuestion();
	}
	
	
	
	
								
	  
	public void playQuiz() {
		
		for(int i=0; i<questions.length;i++)
		 {
			 System.out.println("Question :"+questions[i].getId());
			 System.out.println(questions[i].getQuestion());

			 System.out.println(questions[i].getOption1());
			 System.out.println(questions[i].getOption2());
			 System.out.println(questions[i].getOption3());
			 System.out.println(questions[i].getOption4());
			 
			 Scanner scan = new Scanner(System.in);
			 
			 userSelectedQuestions[i] = scan.next();
		 }
	}
	
	public void printFinalScore() {
		int correctAnswer = 0;
		for(int i=0;i<userSelectedQuestions.length;i++) {
			if(questions[i].getAnswer().equals(userSelectedQuestions[i])) {
				correctAnswer++;
			}
		}
		int incorrectAnswrt = questions.length - correctAnswer;
		
		double percentage =((double) correctAnswer/ questions.length) * 100;
		
		System.out.println("Correct Answer: "+ correctAnswer);
		System.out.println("Incorret Answer: "+ incorrectAnswrt);
		System.out.println("Percentage: "+ percentage);

	}

}
