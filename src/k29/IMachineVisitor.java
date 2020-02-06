package k29;

public interface IMachineVisitor {
    public void visit(Disposable disposable);
    public void visit(Reusable reusable);
    public void printBon();
}
