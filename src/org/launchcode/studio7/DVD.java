package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int capacity, String contents, String discType, double transferRate) {
        super(name, capacity, contents, discType, transferRate);
    }


    @Override
    public String spinDisc() {
    return "A DVD spins at a rate of 570 - 1600 rpm";
    }


}
