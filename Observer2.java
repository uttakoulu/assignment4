public class Observer2 implements Observer {
    private void Display(String text) {
        int c = Integer.parseInt(text);
        int f = (c * 9/5) + 32;

        System.out.println("Temperature: " + f + "f");
    }

    @Override
    public void Update(int temperature) {
        Display(String.valueOf(temperature));
    }
}
