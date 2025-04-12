package prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeGenerate {
    private Map<String, Prototype> prototipos = new HashMap<>();

    public void registrar(String key, Prototype prototype) {
        prototipos.put(key, prototype);
    }

    public Prototype getPrototype(String key) {
        Prototype p = prototipos.get(key);
        return (p != null) ? p.clone() : null;
    }
}
