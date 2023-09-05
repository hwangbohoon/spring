package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sample.MyBean;


public class SpringExam01 {
    public static void main(String[] args) {
        System.out.println("ApplicationContext 생성 전!!");
        ApplicationContext context = new ClassPathXmlApplicationContext("exam.xml");
        System.out.println("ApplicationContext 생성 후!!");

        MyBean bean1 = (MyBean) context.getBean("myBean2", MyBean.class);
//        bean1.setName("cup"); // constructor-args나 property를 사용하지 않았다면 setter로 값을 넣어줘야 한다
        // 즉, xml에서 값을 정해주거나 main에서 값을 넣어줘야 한다

        System.out.println(bean1.getName());
        System.out.println(bean1.getCount());

        MyBean bean2 = (MyBean) context.getBean("myBean2");
        System.out.println(bean2.getName());


    }
}
