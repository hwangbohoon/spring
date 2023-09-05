package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.MyBean;


public class SpringExam01 {
    public static void main(String[] args) {
        System.out.println("ApplicationContext 생성 전!!");
        ApplicationContext context = new ClassPathXmlApplicationContext("exam.xml");
        System.out.println("ApplicationContext 생성 후!!");

        MyBean bean1 = (MyBean) context.getBean("myBean1", MyBean.class);
        bean1.setName("cup");

        System.out.println(bean1.getName());

        MyBean bean2 = (MyBean) context.getBean("myBean1");
        System.out.println(bean2.getName());


    }
}
