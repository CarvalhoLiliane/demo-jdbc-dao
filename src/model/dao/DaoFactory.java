package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImpl;

public class DaoFactory {
	// essa classe é responsável por instanciar os DAOS
	public static SellerDao createSellerDao() {
		return new SellerDaoImpl(DB.getConnection());
	}
	
	/* ela vai expor um método que retorna o tipo da interface, 
	 * mas internamente instancia uma implementação. Isso é um
	 * macete para não precisar expor a implementação. 
	 * 
	 * */

}
