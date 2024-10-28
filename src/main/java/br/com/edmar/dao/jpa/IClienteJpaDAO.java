/**
 * 
 */
package br.com.edmar.dao.jpa;

import br.com.edmar.dao.generic.jpa.IGenericJapDAO;
import br.com.edmar.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}