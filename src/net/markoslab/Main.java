package net.markoslab;

import net.markoslab.logic.Logic;
import net.markoslab.logic.LuaLogic;
import net.markoslab.model.Model;
import net.markoslab.model.DataModel;
import net.markoslab.view.View;
import net.markoslab.view.OgreView;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Model model = new DataModel();
        View view   = new OgreView();
        //view.setModel(model);
        Logic logic = new LuaLogic();
        logic.setModel(model);

        while (true) {
            logic.update();
            Thread.sleep(500);
        }

    }
}
