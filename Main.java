import calculator.*;
import java.io.*;
import java.util.Scanner;
import list.*;
import stack.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione implementación de Stack:");
        System.out.println("1. ArrayList");
        System.out.println("2. Vector");
        System.out.println("3. Lista");
        int option = sc.nextInt();

        Stack stack;

        if (option == 1) {
            stack = new StackArrayList<>();
        } else if (option == 2) {
            stack = new StackVector<>();
        } else {
            System.out.println("Seleccione tipo de lista:");
            System.out.println("1. Simplemente enlazada");
            System.out.println("2. Doblemente enlazada");

            int listOption = sc.nextInt();
            List list = (listOption == 1)
                    ? new SinglyLinkedList<>()
                    : new DoublyLinkedList<>();

            stack = new StackList<>(list);
        }

        BufferedReader br = new BufferedReader(new FileReader("datos.txt"));
        String infix = br.readLine();

        InfixToPostfixConverter converter = new InfixToPostfixConverter();
        String postfix = converter.convert(infix, stack);

        System.out.println("Postfix: " + postfix);

        Stack<Double> evalStack = new StackArrayList<>();
        PostfixEvaluator evaluator = new PostfixEvaluator();
        double result = evaluator.evaluate(postfix, evalStack);

        System.out.println("Resultado: " + result);
    }
}