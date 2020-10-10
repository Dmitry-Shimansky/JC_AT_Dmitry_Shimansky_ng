package main.java.tasks.lesson6;

public class B {

    public static void main(String[] args) {
        A a = new A();
        a.foo(5);

        A a2 = new A(){
            public int foo(int x) {
                int y = x * 5;
                System.out.println(y);
                return y;
            }
        };
        a2.foo(5);
    }
}
