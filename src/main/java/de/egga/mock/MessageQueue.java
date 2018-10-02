package de.egga.mock;

public interface MessageQueue {

    public void send(String value) ;

    public String receive();
}
