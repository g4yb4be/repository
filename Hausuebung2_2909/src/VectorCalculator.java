public class VectorCalculator extends AbstractCalculator{
    public VectorCalculator(CalculateOperation add, CalculateOperation sub, CalculateOperation mul, CalculateOperation div) {
        super(add, sub, mul, div);
    }

    @Override
    public Number add(Number a, Number b) {
        return add.calc(a,b);
    }

    @Override
    public Number sub(Number a, Number b) {
        return sub.calc(a,b);
    }

    @Override
    public Number mul(Number a, Number b) {
        return mul.calc(a,b);
    }

    @Override
    public Number div(Number a, Number b) {
        return div.calc(a,b);
    }
}
