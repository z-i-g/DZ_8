package ru.iteco.designpatterns.behavioral.visitor;

public class DrawVisitor extends Visitor{

    private int x, y;

    public DrawVisitor(int x, int y) {
        super("Drawing ");
        this.x = x;
        this.y = y;
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(getOperationName() + rectangle.getName() + " " + x + y);
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(getOperationName() + triangle.getName() + " " + x + y);
    }

    @Override
    public void visit(Trapeze trapeze) {
        System.out.println(getOperationName() + trapeze.getName() + " " + x + y);
    }
}
