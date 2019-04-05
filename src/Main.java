public class Main {

    /**
     * Main method for game, instantiate and execute game from here.
     * This is a comment that describes the main method of the program.
     *
     * @param args argument description goes here
     */
    public static void main(String[] args) {
        boolean condition;                      // instantiate a boolean
        int[] list_of_numbers = {19,14,13,42};  // instantiate a list of ints

        /*
         * For loop
         */
        System.out.println("=== For-loop");
        for (int i = 0; i < list_of_numbers.length; i++){
            System.out.println(list_of_numbers[i]);
        }

        /*
        foreach loop
         */
        System.out.println("\n=== foreach loop");
        for (int i: list_of_numbers) {
            System.out.println(i);
        }

        /*
        while loop
         */
        System.out.println("\n=== while loop");
        int i = 0;
        condition = true;
        while (condition){
            System.out.println(list_of_numbers[i++]);

            condition = i < list_of_numbers.length;
        }

        /*
        do-while loop
         */
        System.out.println("\n=== do-while loop");
        do {
            System.out.println(list_of_numbers[i++]);

            condition = i < list_of_numbers.length;
        } while (condition);
    }
}
