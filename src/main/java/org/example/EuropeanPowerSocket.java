package org.example;

// EuropeanPowerSocket is the concrete implementation of the EuropeanSocket interface
public class EuropeanPowerSocket implements EuropeanSocket {
    @Override
    public void insert() {
        System.out.println("Inserting into a European power socket");
    }
}
