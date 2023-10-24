package Controller;


import Model.OperationLog;
import Model.Operation;
import Data.Calculator;
import java.util.List;

public class Controller {
    Creator dataCreator;
    Calculator calculator;
    OperationLog logger;

    public Controller(Creator dataCreator, Calculator calculator, OperationLog logger) {
        this.dataCreator = dataCreator;
        this.calculator = calculator;
        this.logger = logger;
    }
    public double sum(double number1, double number2) {
        return calculator.sum(number1, number2);
    }
    public double subtraction(double number1, double number2) {
        return calculator.subtract(number1, number2);
    }
    public double multiply(double number1, double number2) {
        return calculator.multiply(number1, number2);
    }
    public double divide(double number1, double number2) {
        return calculator.divide(number1, number2);
    }
    public double inputNumber(){
        return Double.parseDouble(dataCreator.getData());
    }
    public String inputOperation(){
        return dataCreator.getData();
    }
    public void addLog (Operation operation) {
        logger.addLog(operation);
    }
    public void printLog () {
        logger.printLog();
        logger.sendOnConsole(calculator);
    }
    public List<Operation> getCurrentLog () {
        return logger.getLogging();
    }
}

