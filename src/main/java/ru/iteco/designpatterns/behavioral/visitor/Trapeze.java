package ru.iteco.designpatterns.behavioral.visitor;

public class Trapeze  extends Figure{

    private int a, b, c, d, h;

    public Trapeze(int a, int b, int c, int d, int h) {
        super("Trapeze ");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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

    public int getD() {
        return d;
    }

    public int getH() {
        return h;
    }
}
