import interpreter.Expression;
import interpreter.context.ExpressionContext;
import interpreter.context.components.*;

public class Main {

    public static void main(String[] args) {
        ExpressionContext ctx = new ExpressionContext();
        ctx.assign("X", true);
        ctx.assign("Y", true);

        Expression expression =
                new AndExpression(
                        new VariableExpression("X"),
                        new AndExpression(
                                new StaticExpression(true),
                                new VariableExpression("Y")
                        )
                );

        System.out.println("primeiro test: " + expression.evaluation(ctx));

        expression = expression.replace("X", new OrExpression(new StaticExpression(false), new StaticExpression(true)));

        System.out.println("segundo test: " + expression.evaluation(ctx));
    }
}
