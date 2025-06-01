package chapter1.Q2;

public class SampleFactory {
    private class SampleImpl implements Sample {
        @Override
        public void execute() {
            System.out.println("Sample!!!");
        }
    }

    public static Sample create() {
        Sample a = new SampleFactory().new SampleImpl();
        return a;
    }
}
