package br.com.cod3r.template.sales.service.template;

import br.com.cod3r.template.sales.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

    public FreeDelivery(final Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return regularItemsPrice > 500;
    }

    @Override
    protected void calibrateVariables() {
        deliveryFactor = 0d;
    }
}
