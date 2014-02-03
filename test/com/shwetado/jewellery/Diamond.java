package com.shwetado.jewellery;

public class Diamond implements Artifact {

    private String name;

    public Diamond(String name) {
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
