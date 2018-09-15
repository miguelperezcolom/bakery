package miguel;

import io.mateu.mdd.core.annotations.Action;
import io.mateu.mdd.core.app.AbstractAction;
import io.mateu.mdd.core.app.MDDOpenCRUDAction;
import io.mateu.mdd.core.app.MDDOpenEditorAction;
import io.mateu.mdd.core.app.SimpleMDDApplication;
import io.mateu.mdd.core.model.authentication.User;
import io.mateu.mdd.core.util.Helper;
import miguel.model.Dashboard;
import miguel.model.Order;
import miguel.model.Product;

import java.io.IOException;

public class MyApp extends SimpleMDDApplication {


    @Action(order = 1)
    public AbstractAction storeFront() {
        return new MDDOpenCRUDAction(Order.class);
    }


    @Action(order = 2)
    public AbstractAction products() {
        return new MDDOpenCRUDAction(Product.class);
    }


    @Action(order = 3)
    public AbstractAction users() {
        return new MDDOpenCRUDAction(User.class);
    }

    @Action(order = 4)
    public AbstractAction dashboard() {
        return new MDDOpenEditorAction("", Dashboard.class);
    }


    @Override
    public boolean isAuthenticationNeeded() {
        return true;
    }
}