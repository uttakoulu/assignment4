public abstract interface Subject {
    public abstract void AddObserver(Observer observer);
    public abstract void RemoveObserver(Observer observer);
    public abstract void NotifyObserver();
}
