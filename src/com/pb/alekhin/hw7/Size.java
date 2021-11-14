package com.pb.alekhin.hw7;

public enum Size {

    XXS("XXS","детская одежда", 32),
    XS("XS","взрослая одежда", 34),
    S("S","взрослая одежда", 36),
    M("M","взрослая одежда", 38),
    L("L","взрослая одежда", 40);

    public String size;
    private String description;
    private int euroSize;

    Size(String size,String description, int euroSize) {
        this.size = size;
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

    @Override
    public String toString() {
        return size + " (" + getDescription() + ", euro: " + getEuroSize() + ") ";
    }
}