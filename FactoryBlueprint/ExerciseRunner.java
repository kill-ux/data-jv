public class ExerciseRunner {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Product productA = factory.createProduct("A");
        if (productA != null) {
            productA.showDetails();
        } else {
            System.out.println("Invalid product type");
        }

        Product productB = factory.createProduct("B");
        if (productB != null) {
            productB.showDetails();
        } else {
            System.out.println("Invalid product type");
        }

        Product invalidProduct = factory.createProduct("C");
        if (invalidProduct != null) {
            invalidProduct.showDetails();
        } else {
            System.out.println("Invalid product type");
        }
    }
}