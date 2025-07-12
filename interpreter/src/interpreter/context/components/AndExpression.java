package interpreter.context.components;

import interpreter.Expression;
import interpreter.context.ExpressionContext;

public class AndExpression extends AbstractOperatorExpression {

    public AndExpression(Expression installment1, Expression installment2) {
        super(installment1, installment2);
    }

    @Override
    public boolean evaluation(ExpressionContext context) {
        return this.installment1.evaluation(context) && this.installment2.evaluation(context);
    }

    @Override
    public Expression replace(String name, Expression expression) {
        return new AndExpression(this.installment1.replace(name, expression), this.installment2.replace(name, expression));
    }

    @Override
    public Expression copy() {
        return new AndExpression(this.installment1.copy(), this.installment2.copy());
    }
}
