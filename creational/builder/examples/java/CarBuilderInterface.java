
public interface CarBuilderInterface<T>{
    public T build();
    public T setSeat(int state);
    public T setGPS(boolean state);
    public T setAirBags(boolean state);
    public T setSuspention(boolean state);
    public T setComputer(boolean state);
}