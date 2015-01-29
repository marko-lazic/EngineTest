package net.markoslab.logic;

import net.markoslab.model.Model;

/**
 * Created by marko on 1/29/15.
 * This is pseudo example of Lua parser logic
 */
public class LuaLogic implements Logic {
    private Model model;

    public LuaLogic() {

    }

    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    /**
     * Called every frame.
     * It updates Model (our data)
     * Adding logic to it.
     */
    @Override
    public void update() {
        if (model != null) {
            model.createEntity(); // This is stupid.
        } else {
            System.out.print("LuaLogic::You must set model. Exiting..");
            System.exit(0);
        }
    }
}
