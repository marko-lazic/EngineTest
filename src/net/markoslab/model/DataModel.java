package net.markoslab.model;

import net.markoslab.entities.Entity;

import java.util.*;

public class DataModel extends Observable implements Model {

    private List<Entity> entities = new ArrayList<Entity>();

    @Override
    public void registerObserver(Observer observer) {
        this.addObserver(observer);
    }

    @Override
    public void createEntity() {
        entities.add(new Entity() {
            @Override
            public Entity doSomething() {
                System.out.println("entity created.");
                return super.doSomething();
            }
        }.doSomething());
        setChanged();
        notifyObservers(ObserverType.ENTITY_CREATED);
    }

    @Override
    public void destroyEntity() {
        entities.remove(0);
        setChanged();
        notifyObservers(ObserverType.ENTITY_DESTROYED);
    }
}
