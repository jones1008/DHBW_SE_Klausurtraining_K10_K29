package k29;

import java.util.Random;

public class Disposable extends Bottle {

    public Disposable() {
        this.id = createRandomPrimeNumber();
    }

    private int createRandomPrimeNumber() {
        int num = 10000;
        Random r = new Random();
        num = r.nextInt((99999 - 10000) + 1) + 10000;;
        while (!isPrime(num)) {
            num = r.nextInt((99999 - 10000) + 1) + 10000;;
        }
        return num;
    }

    public void accept(IMachineVisitor visitor) {
        visitor.visit(this);
    }
}
