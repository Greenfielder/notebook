package notebook.util;

import notebook.controller.UserController;
import notebook.model.repository.GBRepository;
import notebook.model.repository.impl.UserRepository;
import notebook.view.UserView;
import static notebook.util.DBConnector.createDB;
import static notebook.util.DBConnector.DB_PATH;

public class InitApp {
    private InitApp(){
        createDB();
        GBRepository repository = new UserRepository();
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }

    public static void start() {
        new InitApp();
    }
}


