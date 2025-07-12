package interpreter.context.components;

import interpreter.Expression;
import interpreter.context.ExpressionContext;

public class VariableExpression implements Expression {
    private final String name;

    public VariableExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean evaluation(ExpressionContext context) {
        return context.lookup(this.name);
    }

    @Override
    public Expression replace(String name, Expression expression) {
        if(this.name.equals(name)){
            return this.copy();
        }
        return expression;
    }

    @Override
    public Expression copy() {
        return new VariableExpression(this.name);
    }
}
