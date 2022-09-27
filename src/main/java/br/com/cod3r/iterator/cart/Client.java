package br.com.cod3r.iterator.cart;

import java.util.stream.StreamSupport;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cart cart = new Cart(
				new Product("TV", 1000d),
				new Product("Shoe", 59.99d),
				new Product("Pencil", 0.5d)
		);

		for (Product prod: cart) {
			System.out.println(String.format("%s = %.2f", prod.getDesc(), prod.getValue()));
		}

		final Double sum = StreamSupport.stream(cart.spliterator(), false)
				.reduce(0.0,
						(acc, prod) -> acc + prod.getValue(), Double::sum);
		System.out.println(sum);
		
	}
}
