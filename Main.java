public class Main {
    public void main(String[] args) {
        Station station = new Station();

        station.AddObserver(new Observer1());
        station.AddObserver(new Observer2());

        Thread stationThread = new Thread(station);
        stationThread.start();
    }
}
