package model.dao;

import java.util.List;

import model.entities.Departament;
import model.entities.Seller;

public interface SellerDao {
	void insert (Seller obj);
	void update(Seller onj);
	void deleteByid (Integer id);
	Seller findByid (Integer id);
	List <Seller> findAll();
	List<Seller> findByDepartament(Departament departament);

}
