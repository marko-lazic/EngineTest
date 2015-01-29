package net.markoslab.view;

import net.markoslab.model.Model;
import net.markoslab.model.ObserverType;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by marko on 1/29/15.
 * Orge pseudo example
 * Could do implementation in LibGdx etc.
 */
public class OgreView implements View, Observer {
    private Model model;

    public OgreView() {

    }

    @Override
    public void setModel(Model model) {
        this.model = model;
        this.model.registerObserver(this);
    }

    /**
     * @param o is Model* class it self extended from java.util.Observable class
     * @param arg are objects passed from Model* class methods that invoke notifyObservers(arg), in this case 'ObserverType' Enumeration
     * This method is called in java.util.Observable class it self.
     */
    @Override
    public void update(Observable o, Object arg) {
        ObserverType observerType = (ObserverType) arg;
        switch (observerType) {
            case ENTITY_CREATED:
                System.out.println("OrgeView:: Entity created.");
                break;

            case ENTITY_DESTROYED:
                System.out.println("OrgeView:: Entity destroyed.");
                break;
        }
    }
}
