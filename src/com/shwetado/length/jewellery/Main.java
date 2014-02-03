package com.shwetado.length.jewellery;

public class Main{
    public static void main(String[] args) {
        JewelleryBox jewelleryBox = new JewelleryBox("Blue Box");
        Diamond diamond = new Diamond("Diamond");
        jewelleryBox.addArtifact(diamond);
        JewelleryBox smallBox = new JewelleryBox("Small Box");
        Diamond diamond1 = new Diamond("Small Diamond");
        jewelleryBox.addArtifact(smallBox);
        jewelleryBox.addArtifact(diamond1);
        Trinket trinket = new Trinket("Trinket");
        jewelleryBox.addArtifact(trinket);
        jewelleryBox.print();
    }
}