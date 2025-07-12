package interpreter.context.components;

import interpreter.Expression;

public abstract class AbstractOperatorExpression implements Expression {
    protected Expression installment1;
    protected Expression installment2;

    public AbstractOperatorExpression(Expression installment1, Expression installment2) {
        this.installment1 = installment1;
        this.installment2 = installment2;
    }

}
