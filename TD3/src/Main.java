import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // 1. Créer des produits
        Shoes shoes1 = new Shoes("Running Shoes", 50.0, 75.0, 42);
        Shoes shoes2 = new Shoes("Sneakers", 40.0, 60.0, 44);
        Accessories accessory1 = new Accessories("Watch", 20.0, 30.0);
        Accessories accessory2 = new Accessories("Sunglasses", 15.0, 25.0);

        // 2. Créer un tableau avec tous les produits créés
        Product[] products = {shoes1, shoes2, accessory1, accessory2};

        // 3. Afficher les éléments du tableau
        for (Product product : products) {
            System.out.println(product);
        }

        // 4. Ajouter des opérations de vente et d'achat
        shoes1.purchase(10);
        shoes2.purchase(5);
        accessory1.purchase(20);
        accessory2.purchase(15);

        shoes1.sell(3);
        shoes2.sell(2);
        accessory1.sell(5);
        accessory2.sell(7);

        // 5. Afficher le stock de produits
        System.out.println("\nStock de produits:");
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getNbItems() + " articles");
        }

        // 6. Afficher les revenus, les coûts et le capital
        System.out.println("\nRevenus: " + Product.Income);
        System.out.println("Coût: " + Product.Cost);
        System.out.println("Capital: " + Product.Capital);

        // 7. Appliquer des réductions et afficher les produits avec leurs prix réduits
        System.out.println("\nProduits avec prix réduits:");
        for (Product product : products) {
            product.applyDiscount();
            System.out.println(product.getName() + ": " + product.getDiscount_price());
        }

        // 8. Ajouter des opérations de vente supplémentaires
        shoes1.sell(2);
        shoes2.sell(1);
        accessory1.sell(3);
        accessory2.sell(4);

        // 9. Afficher le stock de produits après les ventes supplémentaires
        System.out.println("\nStock de produits après ventes supplémentaires:");
        for (Product product : products) {
            System.out.println(product.getName() + ": " + product.getNbItems() + " articles");
        }

        // 10. Afficher les revenus après les ventes supplémentaires
        System.out.println("\nRevenus après ventes supplémentaires: " + Product.Income);
        Arrays.sort(products, (o1, o2) -> o1.compareTo(o2.getDiscount_price()));
        for(Product product : products){
            System.out.println(product.getName() + ": " + product.getDiscount_price());
        }
    }
}