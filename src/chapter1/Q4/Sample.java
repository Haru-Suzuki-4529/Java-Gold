package chapter1.Q4;

public class Sample {
    private static int num = 2;

    public void hoge() {
        Inner test = new Inner();
        test.execute();
    }

    private static class Inner {
        private int data;

        void execute() {
            System.out.println(num * data);
        }
    }
}
