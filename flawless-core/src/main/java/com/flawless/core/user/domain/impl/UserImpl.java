package com.flawless.core.user.domain.impl;

import java.io.Serializable;
import javax.persistence.*;

import com.flawless.core.user.domain.User;


@Entity
@Table(name="tbl_users")
public class UserImpl implements Serializable, User {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=45)
	private String city;

	@Column(length=45)
	private String country;

	@Column(name="credit_card", length=45)
	private String creditCard;

	@Column(name="decrypted_card", length=45)
	private String decryptedCard;

	@Column(name="decrypted_email", length=45)
	private String decryptedEmail;

	@Column(name="decrypted_password", length=45)
	private String decryptedPassword;

	@Column(nullable=false, length=16)
	private String email;

	@Column(nullable=false, length=15)
	private String name;

	@Column(nullable=false, length=45)
	private String password;

	@Column(length=45)
	private String phone;

	public UserImpl() {
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String getCity() {
		return this.city;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String getCountry() {
		return this.country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getCreditCard() {
		return this.creditCard;
	}

	@Override
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String getDecryptedCard() {
		return this.decryptedCard;
	}

	@Override
	public void setDecryptedCard(String decryptedCard) {
		this.decryptedCard = decryptedCard;
	}

	@Override
	public String getDecryptedEmail() {
		return this.decryptedEmail;
	}

	@Override
	public void setDecryptedEmail(String decryptedEmail) {
		this.decryptedEmail = decryptedEmail;
	}

	@Override
	public String getDecryptedPassword() {
		return this.decryptedPassword;
	}

	@Override
	public void setDecryptedPassword(String decryptedPassword) {
		this.decryptedPassword = decryptedPassword;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String getPhone() {
		return this.phone;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((creditCard == null) ? 0 : creditCard.hashCode());
		result = prime * result
				+ ((decryptedCard == null) ? 0 : decryptedCard.hashCode());
		result = prime * result
				+ ((decryptedEmail == null) ? 0 : decryptedEmail.hashCode());
		result = prime
				* result
				+ ((decryptedPassword == null) ? 0 : decryptedPassword
						.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserImpl other = (UserImpl) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (creditCard == null) {
			if (other.creditCard != null)
				return false;
		} else if (!creditCard.equals(other.creditCard))
			return false;
		if (decryptedCard == null) {
			if (other.decryptedCard != null)
				return false;
		} else if (!decryptedCard.equals(other.decryptedCard))
			return false;
		if (decryptedEmail == null) {
			if (other.decryptedEmail != null)
				return false;
		} else if (!decryptedEmail.equals(other.decryptedEmail))
			return false;
		if (decryptedPassword == null) {
			if (other.decryptedPassword != null)
				return false;
		} else if (!decryptedPassword.equals(other.decryptedPassword))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", city=" + city + ", country=" + country
				+ ", creditCard=" + creditCard + ", decryptedCard="
				+ decryptedCard + ", decryptedEmail=" + decryptedEmail
				+ ", decryptedPassword=" + decryptedPassword + ", email="
				+ email + ", name=" + name + ", password=" + password
				+ ", phone=" + phone + "]";
	}
}