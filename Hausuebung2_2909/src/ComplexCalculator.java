public class ComplexCalculator extends AbstractCalculator{
    public ComplexCalculator(CalculateOperation add, CalculateOperation sub, CalculateOperation mul, CalculateOperation div) {
        super(add, sub, mul, div);
    }

    @Override
    public Number add(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA()+b.getA());
        n.setB(a.getB()+b.getB());
        return n;
    }

    @Override
    public Number sub(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA()-b.getA());
        n.setB(a.getB()+b.getB());
        return n;
    }

    @Override
    public Number mul(Number a, Number b) {
        Number n = new Number();
        n.setA(a.getA()*b.getA()+a.getA()*b.getB());
        n.setB(a.getB()*b.getA()+a.getB()*b.getB());
        return n;
    }

    @Override
    public Number div(Number a, Number b) {
        Number n = new Number();
        n.setA(//?);
        n.setB(//?);
        return n;
    }
}
