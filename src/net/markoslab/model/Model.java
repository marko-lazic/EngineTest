package net.markoslab.model;

import java.util.Observer;

/**
 * Created by marko on 1/29/15.
 * With Model Interface we want to register observers
 * and to create and destroy game objects.
 */
public interface Model {
    public void registerObserver(Observer observer);
    public void createEntity();
    public void destroyEntity();

}
