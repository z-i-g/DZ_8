package ru.iteco.designpatterns.behavioral.visitor;

public class Triangle extends Figure{

    private int a, b, c, h;


    public Triangle(int a, int b, int c, int h) {
        super("Triangle ");
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
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

    public int getC() {
        return c;
    }

    public int getH() {
        return h;
    }
}
