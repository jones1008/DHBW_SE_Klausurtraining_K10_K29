package k29;

public interface IMachineVisitor {
    void visit(Disposable disposable);
    void visit(Reusable reusable);
    void printBon();
}
