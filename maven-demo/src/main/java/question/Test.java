package question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("queval.xml");
		Question question = (Question) context.getBean("question1");
		
		
		
		question.getQuestionId();
		question.getQuestion();
		question.getAnswerList();
		question.getAnswer1Set();
		question.getAnswer2Map();
		
		

	}

}
