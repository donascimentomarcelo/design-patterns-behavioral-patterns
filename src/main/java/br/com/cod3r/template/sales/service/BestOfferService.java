package br.com.cod3r.template.sales.service;

import br.com.cod3r.template.sales.service.template.BestOfferTemplate;
import br.com.cod3r.template.sales.service.template.BigCartDiscounts;
import br.com.cod3r.template.sales.service.template.BlackFriday;
import br.com.cod3r.template.sales.service.template.CategoryDiscounts;
import br.com.cod3r.template.sales.service.template.FreeDelivery;
import br.com.cod3r.template.sales.service.template.RegularPrice;
import br.com.cod3r.template.sales.service.template.SpecialClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.cod3r.template.sales.model.Cart;
import br.com.cod3r.template.sales.model.Category;

public class BestOfferService {
	private List<BestOfferTemplate> templates;

	public void loadTemplates(final Cart cart) {
		templates = new ArrayList<BestOfferTemplate>();
		templates.add(new RegularPrice(cart));
		templates.add(new FreeDelivery(cart));
		templates.add(new BigCartDiscounts(cart));
		templates.add(new SpecialClient(cart));
		templates.add(new CategoryDiscounts(cart));
		templates.add(new BlackFriday(cart));
	}

	public void calculateBestOffer(Cart cart) {
		loadTemplates(cart);
		Double bestOffer = Double.MAX_VALUE;
		for(BestOfferTemplate template: templates) {
			if(template.isApplicable()) {
				Double currentPrice = template.calculateOffer(cart);
				System.out.println(String.format("%s: %.2f", template.getClass().getSimpleName(), currentPrice));
				bestOffer = (bestOffer > currentPrice)? currentPrice: bestOffer;
			}
		}
		System.out.println(String.format("Final Price: %.2f", bestOffer));
	}
}