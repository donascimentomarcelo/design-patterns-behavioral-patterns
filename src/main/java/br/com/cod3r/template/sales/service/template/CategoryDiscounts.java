package br.com.cod3r.template.sales.service.template;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.model.Category;
import java.util.HashMap;
import java.util.Map;

public class CategoryDiscounts extends BestOfferTemplate {
    Map<Category, Double> discountsByCategory;

    public CategoryDiscounts(final Cart cart) {
        super(cart);
        this.loadDiscounts();
    }

    public void loadDiscounts() {
        discountsByCategory = new HashMap<>();
        discountsByCategory.put(Category.ELETRONICS, 0.3);
        discountsByCategory.put(Category.CLOTHES, 0.05);
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {
        regularItemsPrice = cart.getItems().stream()
                .reduce(0d, (acc, item) ->
                                acc + (item.getValue() *
                                        (discountsByCategory.get(item.getCategory()) != null?
                                                1 - discountsByCategory.get(item.getCategory()): 1d))
                        , Double::sum);
    }
}
