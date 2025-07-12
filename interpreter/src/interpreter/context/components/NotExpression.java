package interpreter.context.components;

import interpreter.Expression;
import interpreter.context.ExpressionContext;

public class NotExpression implements Expression {
    private final Expression installment;

    public NotExpression(Expression installment) {
        this.installment = installment;
    }

    @Override
    public boolean evaluation(ExpressionContext context) {
        return !this.installment.evaluation(context);
    }

    @Override
    public Expression replace(String name, Expression expression) {
        return new NotExpression(this.installment.replace(name, expression));
    }

    @Override
    public Expression copy() {
        return new NotExpression(this.installment);
    }
}
