package question;

import java.util.*;


public class Question {

	private int questionId;
	private String question;
	private List answerList;
	private Set answer1Set;
	private Map answer2Map;
	
	public int getQuestionId() {
		System.out.println("Elements :"  + questionId);
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		System.out.println("Elements :"  + question);
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List getAnswerList() {
		System.out.println("List Elements :"  + answerList);
		return answerList;
	}
	public void setAnswerList(List answerList) {
		this.answerList = answerList;
	}
	public Set getAnswer1Set() {
		System.out.println("Set Elements :"  + answer1Set);
		return answer1Set;
	}
	public void setAnswer1Set(Set answer1Set) {
		this.answer1Set = answer1Set;
	}
	public Map getAnswer2Map() {
		System.out.println("Map Elements :"  + answer2Map);
		return answer2Map;
	}
	public void setAnswer2Map(Map answer2Map) {
		this.answer2Map = answer2Map;
	}
	
	
	

}
