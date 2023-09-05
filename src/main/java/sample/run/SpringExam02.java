package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.Dice;

public class SpringExam02 {
    public static void main(String[] args) {
        System.out.println("ApplicationContext 생성전!!");
        ApplicationContext context = new ClassPathXmlApplicationContext("game.xml");
        System.out.println("ApplicationContext 생성후!!");

        Dice dice = (Dice)context.getBean("dice");
        System.out.println(dice.getNumber());
    }
}
