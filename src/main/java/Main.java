import Controller.*;
import Model.OperationLog;
import Data.Calculator;
import View.View;
public class Main {
    public static void main(String[] args) {
        View view = new View(new Controller(new ConsoleDataCreator(), new Calculator(), new OperationLog()));
        view.appViewer();
    }
}
