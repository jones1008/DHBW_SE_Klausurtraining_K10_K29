package k29;

import java.util.Date;

public class Bon {
    private int disposable = 0;
    private int reusable = 0;
    private Date date;
    private double amount = 0;

    private Bon(Builder builder){
        this.disposable = builder.disposable;
        this.reusable = builder.reusable;
        this.date = builder.date;
        this.amount = builder.amount;
    }

    public static class Builder {
        private int disposable;
        private int reusable;
        private Date date;
        private double amount;

        public Builder disposable(int disposable) {
            this.disposable = disposable;
            return this;
        }

        public Builder reusable(int reusable) {
            this.reusable = reusable;
            return this;
        }

        public Bon build() {
            // automatically set date + amount. They don't need to be set manually
            this.date = new Date();
            this.amount = 0.25 * disposable + 0.5 * reusable;
            return new Bon(this);
        }
    }

    @Override
    public String toString() {
        return  "DEPOSIT BON:" + "\n" +
                date.toString() + "\n" +
                "Disposable Bottles: " + disposable + "\n" +
                "Reusable Bottles:   " + reusable + "\n" +
                "-----------------------" + "\n" +
                "Amount:             " + amount + "€ \n";
    }
}
