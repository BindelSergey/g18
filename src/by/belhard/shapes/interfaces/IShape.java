package by.belhard.shapes.interfaces;

import by.belhard.shapes.exceptions.ShapeException;

public interface IShape {

    void draw();
    void drawWithException(boolean shouldThrow) throws ShapeException;
    void drawWithException(boolean shouldThrow, boolean otherException) throws Exception;
}
