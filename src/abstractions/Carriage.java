package abstractions;

import com.company.ProductType;

import java.util.HashMap;

public abstract class Carriage {
    private boolean isSet;
    private ProductType type;
    public abstract String toString();
    public abstract HashMap<String, Object> info();
}
