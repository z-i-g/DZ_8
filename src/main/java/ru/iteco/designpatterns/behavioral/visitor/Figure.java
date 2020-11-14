package ru.iteco.designpatterns.behavioral.visitor;

public abstract class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }

}
