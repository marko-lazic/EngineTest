package net.markoslab.view;

import net.markoslab.model.Model;

/**
 * Created by marko on 1/29/15.
 * View needs to know about existence of model interface
 */
public interface View {
    public void setModel(Model model);
}


