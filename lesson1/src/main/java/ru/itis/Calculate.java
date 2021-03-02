package ru.itis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import ru.itis.config.MyConfiguration;
import ru.itis.operations.DivOperation;
import ru.itis.operations.MinusOperation;
import ru.itis.operations.MultyOperation;
import ru.itis.operations.SumOperation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext(Calculate.class.getResource("/springConfig.xml").toString());
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        double a, b;
        while (true) {
            Scanner sc = new Scanner(System.in);
            try {
                System.out.println("enter first num");
                a = sc.nextDouble();
                System.out.println("enter second num");
                b = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("please, input only numbers");
                continue;
            }
            System.out.println("choose operation : *, +, -, /");
            switch (sc.next()) {
                case "+": {
                    System.out.println((context.getBean(SumOperation.class)).calculate(a, b));
                    break;
                }
                case "/": {
                    try {
                        System.out.println((context.getBean(DivOperation.class)).calculate(a, b));
                    } catch (ArithmeticException e) {
                        System.out.println("can't divide by zero");
                    }
                    break;
                }
                case "*": {
                    System.out.println((context.getBean(MultyOperation.class)).calculate(a, b));
                    break;
                }
                case "-": {
                    System.out.println((context.getBean(MinusOperation.class)).calculate(a, b));
                    break;
                }
                default: {
                    System.out.println("bad command, try again");
                }
            }
        }
    }
}
