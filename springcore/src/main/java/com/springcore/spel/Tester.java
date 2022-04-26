package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spel_config.xml");
		Demo obj = context.getBean("demo", Demo.class);
		System.out.println(obj);
		// we can also parse the expression with the help of SpelExpressionParse
		SpelExpressionParser temp = new SpelExpressionParser();
		// While using the .parseExpression() method we don't need to use "#{}"
		Expression expression = temp.parseExpression("12+55");
		System.out.println(expression.getValue());

	}

}
