public class Observer1 implements Observer {
    private void Display(String text) {
        System.out.println("Temperature: " + text + "c");
    }

    @Override
    public void Update(int temperature) {
        Display(String.valueOf(temperature));
    }
}
