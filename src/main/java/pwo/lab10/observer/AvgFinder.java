package pwo.lab10.observer;
import static pwo.lab10.observer.Publisher.Subscriber;

public class AvgFinder implements Subscriber {
    Float Avg = 1;
    Float sum = null;
    Integer count = 0;

    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x;
        count++;
        Avg = sum/count;
    }

    public float getAvg() {
        return Avg;
    }
}
