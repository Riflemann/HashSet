import java.util.*;

public class Recipe {

    private HashMap<Products,Integer> productsMap;
    private double sumProducts;
    private String name;

    public Recipe(String name) {
        this.productsMap = new HashMap<>();
        this.name = name;
    }

    public HashMap<Products,Integer> getProductsMap() {
        return productsMap;
    }

    public double getSumProducts() {
        return sumProducts;
    }

    public String getName() {
        return name;
    }

    public void addProductInRecipe(Products products, int amount) {
        amount = amount == 0 ? 1 : amount;
        this.productsMap.put(products, amount);
        for (Products product : this.productsMap.keySet() ) {
            this.sumProducts += product.getCost() * this.productsMap.get(product);
        }
    }

    public void addRecipeInSet(Set<Recipe> recipeSet) {
        if (!recipeSet.contains(this)) {
            recipeSet.add(this);
        } else {
            throw new UnsupportedOperationException("Рецепт " + this.name + " уже находится в множестве");
        }
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeSet=" + productsMap +
                ", sumProducts=" + sumProducts +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return  Objects.equals(name, recipe.name);
//        return sumProducts == recipe.sumProducts && Objects.equals(productsSet, recipe.productsSet) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsMap, sumProducts, name);
    }
}
