/**
 * Created by WilsonWong on 3/28/2018.
 */
public class Context {
    // Step 4: Create a context class with an attribute of type Strategy interface

    private IStrategyGrowth growthAlgorithm;

    public Context(IStrategyGrowth growthAlgorithm)
    {
        this.growthAlgorithm = growthAlgorithm;
    }

    public Context()
    {

    }

    // Step 5: Create the context class methods to set the strategy and call the interface methods

    public void setContext(IStrategyGrowth growthAlgorithm)
    {
        this.growthAlgorithm = growthAlgorithm;
    }

    public double run(double value)
    {
        return(growthAlgorithm.run(value));
    }


}
