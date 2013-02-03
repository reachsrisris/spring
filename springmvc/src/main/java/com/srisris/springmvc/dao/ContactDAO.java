/**
 * 
 */
package com.srisris.springmvc.dao;

import java.util.List;

import com.srisris.springmvc.domain.Contact;

/**
 * @author Srinivas
 * 
 */
public interface ContactDAO {

  public void addContact(Contact contact);

  public List<Contact> listContact();

  public void removeContact(Integer id);

}
