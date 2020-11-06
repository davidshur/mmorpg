package com.findshur.game;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("1.1.1.1", 22222);
        client.connect();
        client.run();
        client.sendObject(new NetPlayer(0, "David"));
    }
}
