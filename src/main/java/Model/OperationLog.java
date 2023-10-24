package Model;

import Data.Calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class OperationLog {
    Logger logger = Logger.getLogger(OperationLog.class.getName());
    protected List<Operation> logging;


    public void sendOnConsole(Calculator logging) {
            logger.info(logging.toString());
    }

    public OperationLog() {
        this.logging = new ArrayList<>();
    }

    public List<Operation> getLogging() {
        return logging;
    }

    @Override
    public String toString() {
        return "Лог операций:\n" + logging + "\n";
    }

    public void addLog(Operation operation) {
        logging.add(operation);
    }

    public void printLog () {
        System.out.println(logging.toString());
    }
}
