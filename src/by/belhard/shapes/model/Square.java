package by.belhard.shapes.model;

import by.belhard.shapes.exceptions.ShapeException;
import by.belhard.shapes.interfaces.IShape;

public class Square implements IShape {

    @Override
    public void draw() {
        System.out.println("kjhbnsdfvlkhbsdfvljhbsdfvhkjb.");
    }

    @Override
    public void drawWithException(boolean shouldThrow) throws ShapeException {
        if(shouldThrow) {
            throw new ShapeException("Shit happens drawing Square.");
        }
        draw();
    }

    @Override
    public void drawWithException(boolean shouldThrow, boolean otherException) throws Exception {
        if(shouldThrow) {
            throw new ShapeException("Shit happens drawing Square.");
        } else  if (otherException) {
            throw new RuntimeException("Runtime exception happened.");
        }
        draw();
    }
}
