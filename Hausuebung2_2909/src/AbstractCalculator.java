public abstract class AbstractCalculator {

    protected CalculateOperation add;
    protected CalculateOperation sub;
    protected CalculateOperation mul;
    protected CalculateOperation div;

    public AbstractCalculator(CalculateOperation add, CalculateOperation sub, CalculateOperation mul, CalculateOperation div){

    }

    public abstract Number add(Number a, Number b);
    public abstract Number sub(Number a, Number b);
    public abstract Number mul(Number a, Number b);
    public abstract Number div(Number a, Number b);
}
