package k29;

import java.util.Random;

public class Reusable extends Bottle {

    public Reusable() {
        this.id = createRandomId();
    }

    private int createRandomId() {
        Random r = new Random();
        int num = 0;
        do {
            num = r.nextInt((99999 - 10000) + 1) + 10000;
        } while (isPrime(num));
        return num;
    }

    public void accept(IMachineVisitor visitor) {
        visitor.visit(this);
    }
}
