package org.example;

// AmericanPowerPlug is the concrete implementation of the AmericanPlug interface
public class AmericanPowerPlug implements AmericanPlug {
    @Override
    public void plugIn() {
        System.out.println("Plugging in an American power plug");
    }
}
