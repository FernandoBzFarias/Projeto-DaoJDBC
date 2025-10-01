package model.dao;

import java.util.List;

import model.entities.Departament;

public interface DepartamentDao {
	
	void insert (Departament obj);
	void update(Departament onj);
	void deleteByid (Integer id);
	Departament findByid (Integer id);
	List <Departament> findAll();
}
