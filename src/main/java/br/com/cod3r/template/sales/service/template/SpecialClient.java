package br.com.cod3r.template.sales.service.template;

import br.com.cod3r.template.sales.model.Cart;

public class SpecialClient extends BestOfferTemplate {
    public SpecialClient(final Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return cart.getBuyer().isSpecialClient();
    }

    @Override
    protected void calibrateVariables() {
        priceFactor = 0.85d;
        deliveryFactor = 0.5d;
    }
}
