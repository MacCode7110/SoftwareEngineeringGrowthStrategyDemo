/**
 * Step 3: Implement the interface for each algorithm
 *
 * Created by WilsonWong on 3/28/2018.
 */
import java.lang.*;
public class LogGrowthI implements IStrategyGrowth {
    @java.lang.Override
    public double run(double value) {
        return Math.log(value);
    }
}
