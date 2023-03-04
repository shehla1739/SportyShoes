package com.sportyshoes.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mysql.cj.x.protobuf.MysqlxCursor.Fetch;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="category_name")
	private String categoryName;
	@Column(name="category_desc")
	private String categoryDesc;
	@OneToMany(mappedBy = "category",
			fetch=FetchType.EAGER,
				cascade= {CascadeType.DETACH, CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Product> products;

	public Category() {
		super();
	}

	public List<Product> getProducts() {
		return products;
	}
	// add convenience methods for bi-directional relationship
	public void addProduct(Product tempProduct) {	
		if (products.isEmpty()) {
			products= new ArrayList();
		}
		products.add(tempProduct);
		tempProduct.setCategory(this);		
	}

	public Category(String categoryName, String categoryDesc) {
		super();
		this.categoryName = categoryName;
		this.categoryDesc = categoryDesc;
	}

	public int getId() {
		return id;
	}

public void setId(int id) {
	this.id = id;
}
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", categoryDesc=" + categoryDesc + "]";
	}

}
