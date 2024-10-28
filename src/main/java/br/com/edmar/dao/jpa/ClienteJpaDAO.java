/**
 * 
 */
package br.com.edmar.dao.jpa;

import br.com.edmar.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.edmar.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}