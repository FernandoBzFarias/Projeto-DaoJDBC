package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Departament obj = new Departament(1, "bronks");
		System.out.println(obj);
		
		
		System.out.println("=== TESTE NUMERO 01- SELLER FINDBYID =======");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findByid(3);
		System.out.println(seller);
		
		System.out.println("\n === TESTE NUMERO 02- SELLER FINDBYIDDEPARTAMENT =======");
		Departament departament = new Departament(2,null);
		List <Seller> list = sellerDao.findByDepartament(departament);
		for(Seller objj : list) {
			System.out.println(objj);
		}
		
		System.out.println("\n === TESTE NUMERO 03- SELLER FINDall =======");
		list = sellerDao.findAll();
		for(Seller objj : list) {
			System.out.println(objj);
		}
		
		System.out.println("\n === TESTE NUMERO 04- SELLER INSERT =======");
		Seller newSeller = new Seller(null, "joao", "joao@gmail.com", new Date(), 4.000, departament);
		sellerDao.insert(newSeller);
		System.out.println("inserido! novo id: " + newSeller.getId());
		
		System.out.println("\n === TESTE NUMERO 05- SELLER UPDATE =======");
		System.out.print("insira um id para update: ");
		int id = sc.nextInt();
		seller = sellerDao.findByid(id);
		seller.setName("marta santos");
		sellerDao.update(seller);
		System.out.println("update realizado");
		
		System.out.println("\n === TESTE NUMERO 06- SELLER DELETE =======");
		System.out.print("insira um id para o teste");
		int idde = sc.nextInt();
		sellerDao.deleteByid(idde);
		System.out.print("deletado com sucesso! ");
		
		
		}
	}


