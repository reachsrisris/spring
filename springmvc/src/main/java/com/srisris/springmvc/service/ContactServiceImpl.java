/**
 * 
 */
package com.srisris.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.srisris.springmvc.dao.ContactDAO;
import com.srisris.springmvc.domain.Contact;

/**
 * @author Srinivas
 * 
 */
@Service
public class ContactServiceImpl implements ContactService {
  
  @Autowired
  private ContactDAO contactDAO;

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.srisris.springmvc.service.ContactService#addContact(com.srisris.springmvc.domain.Contact)
   */
  @Transactional
  @Override
  public void addContact(Contact contact) {
    contactDAO.addContact(contact);

  }

  /*
   * (non-Javadoc)
   * 
   * @see com.srisris.springmvc.service.ContactService#listContact()
   */
  @Transactional
  @Override
  public List<Contact> listContact() {
    return contactDAO.listContact();
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.srisris.springmvc.service.ContactService#removeContact(java.lang.Integer)
   */
  @Transactional
  @Override
  public void removeContact(Integer id) {
    contactDAO.removeContact(id);

  }

}
