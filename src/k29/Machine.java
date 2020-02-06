package k29;

import java.util.Date;

public class Machine implements IMachineVisitor {
    private int disposables = 0;
    private int reusables = 0;

    public void visit(Disposable disposable) {
        disposables++;
        System.out.println("[INFO] Disposable Bottle '" + disposable.id + "' shredded...");
    }

    public void visit(Reusable reusable) {
        reusables++;
        System.out.println("[INFO] Reusable Bottle   '" + reusable.id + "' in Box...");
    }

    public void printBon() {
        Bon bon = new Bon.Builder().disposable(disposables).reusable(reusables).build();
        System.out.println(bon);
    }
}
