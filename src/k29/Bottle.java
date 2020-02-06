package k29;

import java.util.Random;

public abstract class Bottle implements IBottle{
    protected int id;

    protected static boolean isPrime(int num){
        if (num <= 3 || num % 2 == 0) {
            return num == 2 || num == 3;
        }
        int div = 3;
        while ((div <= Math.sqrt(num)) && (num % div != 0)) {
            div += 2;
        }
        return num % div != 0;
    }
}
