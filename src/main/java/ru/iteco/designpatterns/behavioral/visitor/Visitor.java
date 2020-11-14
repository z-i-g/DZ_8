package ru.iteco.designpatterns.behavioral.visitor;

public abstract class Visitor {

    private String operationName;

    protected Visitor(String operationName) {
        this.operationName = operationName;
    }

    public abstract void visit(Rectangle rectangle);

    public abstract void visit(Triangle triangle);

    public abstract void visit(Trapeze trapeze);

    public String getOperationName() {
        return operationName;
    }
}
