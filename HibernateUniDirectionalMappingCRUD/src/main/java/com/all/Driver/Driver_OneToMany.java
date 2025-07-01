package com.all.Driver;

import java.util.ArrayList;
import java.util.List;

import com.oneToMany.Entity.Accounts;
import com.oneToMany.Entity.Bank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_OneToMany {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("swamy");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		//To Insert the Records By Using persist()

		//		Bank b1 = new Bank();
		//		b1.setBid(101);
		//		b1.setBname("SBI");
		//		b1.setBifsc("SBI1122");
		//		
		//		Accounts a1=new Accounts();
		//		a1.setAcid(1);
		//		a1.setAcname("swamy");
		//		a1.setBalance(20000);
		//		
		//		Accounts a2=new Accounts();
		//		a2.setAcid(2);
		//		a2.setAcname("sravs");
		//		a2.setBalance(25000);
		//		
		//		Accounts a3=new Accounts();
		//		a3.setAcid(3);
		//		a3.setAcname("ram");
		//		a3.setBalance(30000);
		//		
		//		List<Accounts>acs=new ArrayList<>();
		//		acs.add(a1);
		//		acs.add(a2);
		//		acs.add(a3);
		//		
		//		b1.setAccounts(acs);
		//		
		//		transaction.begin();
		//		manager.persist(b1);
		//		transaction.commit();


		//To Fetch the Details By Using find()

		//By Using Bank We Can Display Accounts Details Also
		//		Bank bank = manager.find(Bank.class, 101);
		//		
		//		if(bank!=null) {
		//			System.out.println("Bank Details");
		//			System.out.println(bank);
		//		}

		//By Using Accounts We Can't Display Bank
		//		Accounts accounts = manager.find(Accounts.class, 1);
		//		if (accounts!=null) {
		//			System.out.println("Accounts Details");
		//			System.out.println(accounts);
		//		}


		//To Update the Records By Using merge()


		//By Using Bank We Can Update Accounts Also
		//		Bank bank = manager.find(Bank.class, 101);
		//		if(bank!=null) {
		//			bank.setBname("State Bank Of India");//To change bname SBI to State Bank Of India
		//			List<Accounts> list = bank.getAccounts();
		//			for (Accounts accounts : list) {
		//				accounts.setBalance(accounts.getBalance()+100);//To Add 100 rupees for Every Account 
		//			}
		//		}
		//		
		//		transaction.begin();
		//		manager.merge(bank);
		//		transaction.commit();

		//By Using Accounts We Can't Update Bank 
		//		Accounts accounts = manager.find(Accounts.class,2);
		//		if(accounts!=null) {
		//			accounts.setAcname("vinee");//To Change acname sravs to vinee
		//		}
		//		
		//		transaction.begin();
		//		manager.merge(accounts);
		//		transaction.commit();

		
		//To Remove (or) Delete the Records By Using remove()
		
		
		//We Can Remove the Bank Accounts also remove
//		Bank bank = manager.find(Bank.class, 101);
//		if(bank!=null) {
//			transaction.begin();
//			manager.remove(bank);
//			transaction.commit();
//		}

		//We Can't Remove the Accounts Directly Because dependent on Bank
//		Accounts accounts = manager.find(Accounts.class, 1);
//		if(accounts!=null) {
//			transaction.begin();
//			manager.remove(accounts);
//			transaction.commit();
//		}


	}

}
