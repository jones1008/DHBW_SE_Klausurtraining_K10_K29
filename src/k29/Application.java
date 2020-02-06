package k29;

public class Application {
    public static void main(String... args) {
        IBottle[] bottles = new IBottle[]{
                new Disposable(),
                new Disposable(),
                new Reusable(),
                new Disposable(),
                new Reusable(),
                new Reusable()
        };

        IMachineVisitor visitor = new Machine();

        for (IBottle bottle : bottles) {
            bottle.accept(visitor);
        }

        System.out.println();
        visitor.printBon();
    }
}
