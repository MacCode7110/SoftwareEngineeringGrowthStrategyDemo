/**
 * Step 3: Implement the interface for each algorithm
 *
 * Created by WilsonWong on 3/28/2018.
 */

public class SquareGrowthI implements IStrategyGrowth {
    @java.lang.Override
    public double run(double value) {
        return value * value;
    }
}
