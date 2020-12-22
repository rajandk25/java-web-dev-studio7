package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private int capacity;
    private String content;
    private String discType;
    private double transferRate;

    public BaseDisc(String name, int capacity, String contents, String discType, double transferRate) {
        this.name = name;
        this.capacity = capacity;
        this.content = contents;
        this.discType = discType;
        this.transferRate = transferRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    public double getTransferRate() {
        return transferRate;
    }

    public void setTransferRate(double transferRate) {
        this.transferRate = transferRate;
    }
}
