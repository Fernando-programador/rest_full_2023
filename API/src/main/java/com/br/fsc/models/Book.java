package com.br.fsc.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "books")
public class Book implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "is not null")
	@Column(name = "author", length = 60, nullable = false)
	private String author;

	@Temporal(TemporalType.DATE)
	@NotNull(message = "Date is not null")
	@Column(name = "launch_date", length = 20)
	private Date launch_date;

	@DecimalMax("9999.99")
	@DecimalMin("1.0")
	@Column(name = "price")
	private Double price;

	@NotNull(message = "is not null")
	@Column(name = "title", length = 180, unique = true)
	private String title;

	public Book() {
	}

	public Book(Long id, @NotBlank(message = "is not null") String author,
			@NotNull(message = "Date is not null") Date launch_date,
			@DecimalMax("9999.99") @DecimalMin("1.0") Double price, @NotNull(message = "is not null") String title) {
		super();
		this.id = id;
		this.author = author;
		this.launch_date = launch_date;
		this.price = price;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLaunch_date() {
		return launch_date;
	}

	public void setLaunch_date(Date launch_date) {
		this.launch_date = launch_date;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double prince) {
		this.price = prince;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, launch_date, price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(id, other.id)
				&& Objects.equals(launch_date, other.launch_date) && Objects.equals(price, other.price)
				&& Objects.equals(title, other.title);
	}

}
