package com.shwetado.jewellery;

import java.util.ArrayList;
import java.util.List;

public class JewelleryBox implements Artifact{
    private List<Artifact> artifacts = new ArrayList<>();
    private String name;

    public JewelleryBox(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void addArtifact(Artifact artifact){
        artifacts.add(artifact);
    }

    @Override
    public void print() {
        System.out.println("*******************************");
        System.out.println("Name: "+ this.getName());
        System.out.println("*******************************");
        for (Artifact artifact : artifacts) {
            artifact.print();
        }
    }
}