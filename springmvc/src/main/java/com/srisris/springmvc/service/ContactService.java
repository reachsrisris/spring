/**
 * 
 */
package com.srisris.springmvc.service;

import java.util.List;

import com.srisris.springmvc.domain.Contact;

/**
 * @author Srinivas
 * 
 */
public interface ContactService {

  public void addContact(Contact contact);

  public List<Contact> listContact();

  public void removeContact(Integer id);

}
