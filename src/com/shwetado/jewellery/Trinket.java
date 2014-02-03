package com.shwetado.jewellery;

public class Trinket implements Artifact{
    private String name;

    public Trinket(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
    }
}
