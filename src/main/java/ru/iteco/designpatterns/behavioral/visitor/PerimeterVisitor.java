package ru.iteco.designpatterns.behavioral.visitor;

public class PerimeterVisitor extends Visitor{

    public PerimeterVisitor() {
        super("Perimeter ");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(getOperationName() + rectangle.getName() + 2 * (rectangle.getA() + rectangle.getB()));
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(getOperationName() + triangle.getName() + triangle.getA() + triangle.getB() + triangle.getC());
    }

    @Override
    public void visit(Trapeze trapeze) {
        System.out.println(getOperationName() + trapeze.getName() + trapeze.getA() + trapeze.getB() + trapeze.getC() + trapeze.getD());
    }
}
