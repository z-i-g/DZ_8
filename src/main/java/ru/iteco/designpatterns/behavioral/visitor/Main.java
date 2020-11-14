package ru.iteco.designpatterns.behavioral.visitor;

public class Main {

    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(4, 5),
                new Triangle(2, 3, 4, 2),
                new Trapeze(2, 4, 5, 2, 4)
        };

        for (Figure figure: figures) {
            figure.accept(new PerimeterVisitor());
            figure.accept(new AreaVisitor());
            figure.accept(new DrawVisitor(4, 5));
            figure.accept(new EraseVisitor());
        }
    }

}
