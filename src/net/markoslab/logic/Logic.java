package net.markoslab.logic;

import net.markoslab.model.Model;

/**
 * Created by marko on 1/29/15.
 * Controller will send event to Logic
 * That will make changes to Model
 */
public interface Logic {
    public void setModel(Model model);
    public void update();
}
