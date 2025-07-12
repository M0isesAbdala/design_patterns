package interpreter;

import interpreter.context.ExpressionContext;

public interface Expression {
    public boolean evaluation(ExpressionContext context);
    public Expression replace(String name, Expression expression);
    public Expression copy();
}
