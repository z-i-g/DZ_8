package ru.iteco.designpatterns.behavioral.visitor;

public class EraseVisitor extends Visitor{

    public EraseVisitor() {
        super("Erasing ");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(getOperationName() + rectangle.getName());
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(getOperationName() + triangle.getName());
    }

    @Override
    public void visit(Trapeze trapeze) {
        System.out.println(getOperationName() + trapeze.getName());
    }
}
