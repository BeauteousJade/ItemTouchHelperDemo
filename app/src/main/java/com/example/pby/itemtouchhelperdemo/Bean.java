package com.example.pby.itemtouchhelperdemo;

public class Bean {
    private String string;
    private int color;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return string;
    }
}
