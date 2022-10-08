package br.com.cod3r.template.sales.service.template;

import br.com.cod3r.template.sales.model.Cart;

public class RegularPrice extends BestOfferTemplate {
    public RegularPrice(final Cart cart) {
        super(cart);
    }

    @Override
    public boolean isApplicable() {
        return true;
    }

    @Override
    protected void calibrateVariables() {

    }
}
