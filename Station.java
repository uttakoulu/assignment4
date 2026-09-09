import java.util.ArrayList;
import java.util.Random;

public class Station implements Runnable {
    private int maxTemperature;
    private int minTemperature;

    public int temperature;

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Random rand = new Random();

    public Station() {
        maxTemperature = 40;
        minTemperature = -40;
    
        temperature = rand.nextInt(maxTemperature + 1);
    }

    @Override
    public void run() {
        while (true) {
            try {
                int delay = 1000 + rand.nextInt(4001);
                Thread.sleep(delay);

                int change = rand.nextInt(3) - 1;
                temperature = Math.clamp(temperature + change, minTemperature, maxTemperature);
                NotifyObserver();
            } catch(InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }

    public void AddObserver(Observer observer) {
        observers.add(observer);
    }

    public void RemoveObserver(Observer observer) {
        observers.remove(observer);
    }

    public void NotifyObserver() {
        for (Observer observer : observers) {
            observer.Update(temperature);
        }
    }
}