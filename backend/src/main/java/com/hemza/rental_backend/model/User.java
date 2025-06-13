package com.hemza.rental_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String username;
  private String email;
  private String password;

  public void setUsername(Object username2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setUsername'");
  }
  public void setEmail(Object email2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
  }
  public void setPassword(Object password2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setPassword'");
  }

  // Getters & Setters
}
