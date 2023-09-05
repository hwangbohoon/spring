package sample;

public class MyBean {
    private String name;
    private int count;

    // constructor-args를 사용하는 경우에 사용, property를 쓸 때에는 없어야 한다
//    public MyBean(String name, int count) {
//        System.out.println("MyBean default 생성자 실행!!");
//        this.name = name;
//        this.count = count;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
