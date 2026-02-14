public class Contador {

    public static void count(int firstParameter, int secondParameter)
            throws ParametrosInvalidosException {

        if (firstParameter > secondParameter) {
            throw new ParametrosInvalidosException(
                "The second parameter must be greater than the first"
            );
        }

        int interactionCount = secondParameter - firstParameter;

        for (int i = 1; i <= interactionCount; i++) {
            System.out.println("Printing number " + i);
        }
    }
}
