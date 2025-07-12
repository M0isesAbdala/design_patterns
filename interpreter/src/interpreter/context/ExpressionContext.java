package interpreter.context;

import interpreter.Expression;

import java.util.HashMap;
import java.util.Map;

public class ExpressionContext {
    private Map<String, Boolean> map = new HashMap<>();

    public boolean lookup(String name){
        return map.getOrDefault(name, false);
    }

    public void assign(String name, boolean value){
        map.put(name, value);
    }
}
