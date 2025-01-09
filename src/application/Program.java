package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TESTE 1: seller FindById ===");
        Seller seller = sellerDao.findById(1);
        System.out.println(seller);

        System.out.println("=== TESTE 2: seller FindByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("=== TESTE 3: seller FindByAll ===");
        list = sellerDao.findAll();

        for (Seller obj : list) {
            System.out.println(obj);
        }
    }
}
