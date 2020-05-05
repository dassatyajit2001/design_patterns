package com.design.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class VegBurger extends Burger {
	private List<String> addons = null;
	private String name;
	private int cost;
	private int size;

	private VegBurger(VegBurgerBuilder builder) {
		this.name=builder.name;
		this.cost=builder.cost;
		this.size=builder.size;
		this.addons=builder.addOns;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getCost() {
		return cost;
	}

	@Override
	public int getSize() {
		return size;
	}

	public static class VegBurgerBuilder {
		private final String name;
		private int cost;
		private int size;
		private List<String> addOns;

		public VegBurgerBuilder(String name, int size) {
			this.name = name;
			this.size = size;
			addOns = new ArrayList<>();
		}

		public VegBurgerBuilder add(String item, int cost) {
			addOns.add(item);
			this.cost += cost;
			return this;
		}

		public VegBurger build() {
			VegBurger veg = new VegBurger(this);
			return veg;
		}
	}
}
