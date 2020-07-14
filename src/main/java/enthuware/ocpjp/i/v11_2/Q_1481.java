package enthuware.ocpjp.i.v11_2;

public interface Q_1481 {

    public default String getId() { return "0000"; }
}

interface PremiumAccount extends Q_1481 {

    // An interface can redeclare a default method and also make it abstract.
    String getId();

    // An interface can redeclare a default method and provide a different implementation.
    //public default String getId() { return "1111"; }
}
