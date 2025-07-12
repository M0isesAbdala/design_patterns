package interpreter.context.components;

import interpreter.Expression;
import interpreter.context.ExpressionContext;

public class StaticExpression implements Expression {
    private final boolean value;

    public StaticExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluation(ExpressionContext context) {
        return this.value;
    }

    @Override
    public Expression replace(String name, Expression expression) {
        return new StaticExpression(this.value);
    }

    @Override
    public Expression copy() {
        return new StaticExpression(this.value);
    }
}
