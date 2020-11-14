package ru.iteco.designpatterns.behavioral.visitor;

public class AreaVisitor extends Visitor{

    public AreaVisitor() {
        super("Area ");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(getOperationName() + rectangle.getName() + rectangle.getA() * rectangle.getB());
    }

    @Override
    public void visit(Triangle triangle) {
        System.out.println(getOperationName() + triangle.getName() + 0.5 * triangle.getA() * triangle.getH());
    }

    @Override
    public void visit(Trapeze trapeze) {
        System.out.println(getOperationName() + trapeze.getName() + 0.5 * (trapeze.getA() + trapeze.getB()) * trapeze.getH());
    }
}
