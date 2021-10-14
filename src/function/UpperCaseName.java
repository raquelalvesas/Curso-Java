package function;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    public static void main(String[] args) {

    }

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase() ;
    }
}
