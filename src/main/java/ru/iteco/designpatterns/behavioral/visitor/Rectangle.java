package ru.iteco.designpatterns.behavioral.visitor;

public class Rectangle extends Figure{

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        super("Rectangle ");
        this.a = a;
        this.b = b;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
