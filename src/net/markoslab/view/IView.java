package net.markoslab.view;

import net.markoslab.model.IModel;

/**
 * Created by marko on 1/29/15.
 * View needs to know about existence of model interface
 */
public interface IView {
    public void setModel(IModel model);
}
