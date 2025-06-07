package telran.homework.controller;
import telran.homework.model.Types;

/*


Write application for printing minimal/maximal values of the given primitive types
Types as String objects should be taken from the arguments of the main function.
If there is no any type in the arguments the application should print maximal/minimal values of 7 types (byte, int, short, long, char, float, double)
If the arguments contain wrong type the application should print message: <argument> Wrong type

Example:
TypePrinterAppl byte int short long char float double



 */

public class TypePrinterAppl {
    public static void main(String[] args) {

        Types types = new Types();
        if (args.length == 0) {
            types.printMaxValuesOfTypes("");
            System.out.println("========================================");
            types.printMinValuesOfTypes("");
        } else {
            for (String arg : args) {
                types.printMaxValuesOfTypes(arg);
            }
            System.out.println("========================================");
            for (String arg : args) {
                types.printMinValuesOfTypes(arg);
            }
        }


    }
}
