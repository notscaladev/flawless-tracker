package com.flawless.core.user.domain;

public interface User {

	public int getId();

	public void setId(int id);

	public String getCity();

	public void setCity(String city);

	public String getCountry();

	public void setCountry(String country);

	public String getCreditCard();

	public void setCreditCard(String creditCard);

	public String getDecryptedCard();

	public void setDecryptedCard(String decryptedCard);

	public String getDecryptedEmail();

	public void setDecryptedEmail(String decryptedEmail);

	public String getDecryptedPassword();

	public void setDecryptedPassword(String decryptedPassword);

	public String getEmail();

	public void setEmail(String email);

	public String getName();

	public void setName(String name);

	public String getPassword();

	public void setPassword(String password);

	public String getPhone();

	public void setPhone(String phone);

}