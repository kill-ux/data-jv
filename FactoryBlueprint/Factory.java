

// Factory class
public class Factory {
    public Product createProduct(String type) {
        if (type == "A") {
            return new ConcreteProductA();
        } else if (type == "B") {
            return new ConcreteProductB();
        } else {
            return null;
        }
    }
}