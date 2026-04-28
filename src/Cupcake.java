public class Cupcake {
    private static int cupcakeCount;

    // I dont even need this class anymore lmao

    /**
     * Adds the specified number of cupcakes to the shared cupcake count.
     *
     * @param count the number of cupcakes to add
     */
    public static void addCupcakes(int count) {
        cupcakeCount += count;
    }

    /**
     * Returns the current total number of cupcakes.
     *
     * @return the current cupcake count
     */
    public static int returnCupcakeCount() {
        return cupcakeCount;
    }
}
