package predicate;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    public static void main(String[] args) {

    }

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
}
