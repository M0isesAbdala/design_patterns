package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeGenerate {
    private Map<String, Prototype> prototipos = new HashMap<>();

    public void registrar(String key, Prototype prototype) {
        prototipos.put(key, prototype);
    }

    public  <T extends Prototype> T getPrototype(String key, Class<T> clazz) {
        Prototype p = prototipos.get(key);
        if (p == null) {
            return null;
        }

        Prototype clone = p.clone();
        if (clazz.isInstance(clone)) {
            return clazz.cast(clone);
        } else {
            throw new ClassCastException("O protótipo não é do tipo esperado: " + clazz.getName());
        }
    }
}
