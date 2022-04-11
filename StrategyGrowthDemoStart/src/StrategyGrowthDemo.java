/**
 * Step 1: Create main()
 *
 * Created by WilsonWong on 3/28/2018.
 */
public class StrategyGrowthDemo {
    public static void main(String[] args) {

        // Step 6: use the context class to run the algorithm
        Context growthAlgorithmSelection = new Context();
        growthAlgorithmSelection.setContext(new SquareGrowthI());
        System.out.println(growthAlgorithmSelection.run(3) + "\n");
    }
}
