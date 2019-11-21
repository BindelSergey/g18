package by.belhard.shapes;

import by.belhard.shapes.exceptions.ShapeException;
import by.belhard.shapes.interfaces.IShape;
import by.belhard.shapes.model.Rectangle;
import by.belhard.shapes.model.Square;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void main(String[] args) {
        IShape square = new Square();
        IShape rectangle = new Rectangle();

        List<IShape> shapeList = new ArrayList<IShape>();
        shapeList.add(square);
        shapeList.add(rectangle);

        /*for (IShape shape : shapeList) {
            shape.draw();
        }*/

        /*for (IShape shape: shapeList) {
            try {
               *//* shape.drawWithException(true);*//*
         *//*shape.drawWithException(false);*//*
                shape.drawWithException(false, true);
            } catch (ShapeException e) {
                *//*e.printStackTrace();*//*
                System.out.println("Successfully processed ShapeException exception.");
            } catch (Exception e) {
                System.out.println("Successfully processed RuntimeException exception.");
            }
            System.out.println("=====================================");
        }*/

        List<String> stringList = new ArrayList<String>();
        while (true) {
            stringList.add("Hello World!");
        }
    }
}
