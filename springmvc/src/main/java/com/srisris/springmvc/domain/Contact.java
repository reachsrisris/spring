/**
 * 
 */
package com.srisris.springmvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Srinivas
 *
 */
@Entity
@Table(name="CONTACTS")
public class Contact {
  
  @Id
  @Column(name="ID")
  @GeneratedValue
  private Integer id;
  
  @Column(name="FIRSTNAME")
  private String firstname;

  @Column(name="LASTNAME")
  private String lastname;

  @Column(name="EMAIL")
  private String email;
  
  @Column(name="TELEPHONE")
  private String telephone;

  /**
   * @return the id
   */
  public final Integer getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public final void setId(Integer id) {
    this.id = id;
  }

  /**
   * @return the firstname
   */
  public final String getFirstname() {
    return firstname;
  }

  /**
   * @param firstname the firstname to set
   */
  public final void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  /**
   * @return the lastname
   */
  public final String getLastname() {
    return lastname;
  }

  /**
   * @param lastname the lastname to set
   */
  public final void setLastname(String lastname) {
    this.lastname = lastname;
  }

  /**
   * @return the email
   */
  public final String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public final void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the telephone
   */
  public final String getTelephone() {
    return telephone;
  }

  /**
   * @param telephone the telephone to set
   */
  public final void setTelephone(String telephone) {
    this.telephone = telephone;
  }
  
  

}
