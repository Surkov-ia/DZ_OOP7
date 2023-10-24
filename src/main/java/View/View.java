package View;
import Controller.Controller;
import Model.Operation;

import static java.lang.System.exit;

public class View {
    Controller controller;
    public View(Controller controller) {
        this.controller = controller;
    }
    public void appViewer() {
        System.out.println("Привет, введите необходимые параметры для расчета: ");
        double firstNumber = Double.NaN;
        while (true) {
            if (Double.isNaN(firstNumber)) {
                System.out.print("Введите первое число: ");
                firstNumber = controller.inputNumber();
            }
            System.out.print("Введите второе число: ");
            double secondNumber = controller.inputNumber();

            System.out.print("Введите операцию +, -, *, / ");
            String operation = controller.inputOperation();

            double result;
            switch (operation) {
                case "+" -> {
                    result = controller.sum(firstNumber, secondNumber);
                }
                case "-" -> {
                    result = controller.subtraction(firstNumber, secondNumber);
                }
                case "*" -> {
                    result = controller.multiply(firstNumber, secondNumber);
                }
                case "/" -> {
                    result = controller.divide(firstNumber, secondNumber);
                }
                default -> {
                    System.out.println("Такой операции нет в калькуляторе, попробуйте еще раз!");
                    continue;
                }
            }
            System.out.println("Результат операции: " + result + "\n");
            Operation command = new Operation(firstNumber, operation, secondNumber);
            command.setResult(result);
            controller.addLog(command);

            System.out.println("\nПродолжаем работать с полученным результатом? " +
                    "\nВведите" +
                    "\n1, если да" +
                    "\n2, если нет" +
                    "\n3, если хотите посмотреть информацию" +
                    "\n4, если хотите выйти из приложения");
            boolean flag = false;
            while (!flag) {
                String continuation = controller.inputOperation().toLowerCase();

                switch (continuation) {
                    case "1" -> {
                        firstNumber = controller.getCurrentLog().get(controller.getCurrentLog().size() - 1).getResult();
                        flag = true;
                    }
                    case "2" -> {
                        firstNumber = Double.NaN;
                        flag = true;
                    }
                    case "3" -> {

                        controller.printLog();
                    }
                    case "4" -> {
                        exit(0);
                    }
                    default -> {
                        System.out.println("Введите корректное значение!");
                    }
                }
            }
        }
    }
}