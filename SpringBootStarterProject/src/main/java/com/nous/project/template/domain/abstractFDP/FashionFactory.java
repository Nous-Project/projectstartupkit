package com.nous.project.template.domain.abstractFDP;

/**
 * @author sachins
 *
 */
public class FashionFactory implements ProductAbstractFactory {

	private Long id;
	private String name;
	private String description;
	private Integer quantity;
	private Double unitPrice;

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param quantity
	 * @param unitPrice
	 */
	public FashionFactory(Long id, String name, String description, Integer quantity, Double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	@Override
	public Product createProduct() {
		return new Fashion(id, name, description, quantity, unitPrice);
	}

}
