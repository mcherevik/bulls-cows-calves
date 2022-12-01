package kettle100rubles;

public class Kettle {
    protected double price = 0;
    int maxKettleNumber = 100;

    int defineMaxNumber(double price) {
        return (int) (maxKettleNumber / price);
    }
}


