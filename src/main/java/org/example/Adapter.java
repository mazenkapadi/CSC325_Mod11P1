package org.example;

// Adapter class implements the AmericanPlug interface and uses the EuropeanPowerSocket
public class Adapter implements AmericanPlug {
    private final EuropeanSocket europeanSocket;

    public Adapter(EuropeanSocket europeanSocket) {
        this.europeanSocket = europeanSocket;
    }

    @Override
    public void plugIn() {
        System.out.println("Using an adapter to plug in a European power socket with an American power plug");
        europeanSocket.insert();
    }
}
