package org.example;

public class Main {
    public static void main(String[] args) {
        AmericanPlug americanPlug = new AmericanPowerPlug();
        EuropeanSocket europeanSocket = new EuropeanPowerSocket();

        System.out.println("Attempting to plug in an American power plug directly into a European power socket won't work:");
        europeanSocket.insert(); // This won't compile

        System.out.println();
        Adapter adapter = new Adapter(europeanSocket);
        adapter.plugIn(); // This will work by using the adapter

        // Now, the American power plug can be used with the European power socket through the adapter
        System.out.println();
        americanPlug.plugIn();
    }
}
