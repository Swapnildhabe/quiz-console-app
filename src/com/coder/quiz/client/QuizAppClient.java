package com.coder.quiz.client;

import com.coder.quiz.service.QuizService;

public class QuizAppClient {
	
	public static void main(String[] args) {
//		QuestionService questionService = new QuestionService();
		QuizService quizService = new QuizService();
		
		quizService.playQuiz();
		quizService.printFinalScore();
	}
}
