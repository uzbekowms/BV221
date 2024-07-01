package edu.itstep.exceptionsgenerics.exceptions.model;

import edu.itstep.exceptionsgenerics.exceptions.exception.BuilderException;
import edu.itstep.exceptionsgenerics.exceptions.exception.NoSuchTacksException;

import java.util.Random;

public class Builder {

    private int tacksCount;

    public Builder(int tacksCount) {
        this.tacksCount = tacksCount;
    }

    public void driverTheNail() throws NoSuchTacksException {
        if (tacksCount <= 0) {
            throw new NoSuchTacksException("No such tacks");
        }
        tacksCount--;
    }

    public void build() throws BuilderException {
        driverTheNail();
        if (new Random().nextInt(0, 10) % 2 == 0) {
            throw new BuilderException("Nail in leg");
        }
    }
}
