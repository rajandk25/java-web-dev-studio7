package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(String name, int capacity, String contents, String discType, double transferRate) {
        super(name, capacity, contents, discType, transferRate);
    }

    @Override
    public String spinDisc() {
        return "A CD spins at a rate of 200 - 500 rpm";
    }


}
