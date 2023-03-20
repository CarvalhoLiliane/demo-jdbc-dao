package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {

	public static void main(String[] args) {
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
//		System.out.println("\n=== TEST 1: department insert ===");
//		Department depart = new Department(null, "RH");
//		depDao.inserir(depart);
//		System.out.println("Dado inserido com sucesso! Número de linhas afetadas: " + depart.getId());
		
		System.out.println("\n=== TEST 2: department findById ===");
		Department dp = depDao.findById(5);
		System.out.println(dp);
		
//		System.out.println("\n=== TEST 3: department update ===");
//		dp = depDao.findById(5);
//		dp.setName("Administração");
//		depDao.update(dp);
//		System.out.println("Dados atualizados com sucesso!");
		
//		System.out.println("\n=== TEST 4: department delete ===");
//		depDao.deleteById(12);
//		System.out.println("Dado apagado com sucesso!");
		
		System.out.println("\n=== TEST 5: department findAll ===");
		List<Department> list = depDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
	}

}
