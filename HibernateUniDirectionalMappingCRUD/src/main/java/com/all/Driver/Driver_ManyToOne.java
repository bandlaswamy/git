package com.all.Driver;

import com.manyToOne.Entity.Product;
import com.manyToOne.Entity.Reviews;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_ManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("swamy");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		// To Insert the Records By Using persist()

		// product

		// Product p1 = new Product();
		// p1.setPid(101);
		// p1.setPname("samsung mobile");
		// p1.setPrice(98999);
		//
		//
		// //Reviews
		//
		// Reviews r1 = new Reviews();
		// r1.setRid(1);
		// r1.setComment("average");
		// r1.setRating(3);
		//
		// r1.setProduct(p1);
		//
		// Reviews r2 = new Reviews();
		// r2.setRid(2);
		// r2.setComment("good");
		// r2.setRating(4);
		//
		// r2.setProduct(p1);
		//
		// Reviews r3 = new Reviews();
		// r3.setRid(3);
		// r3.setComment("excellent");
		// r3.setRating(5);
		//
		// r3.setProduct(p1);
		//
		// transaction.begin();
		// manager.persist(p1);
		// manager.persist(r1);
		// manager.persist(r2);
		// manager.persist(r3);
		//
		// transaction.commit();

		// To Fetch the Records By Using find()

		// we can fetch directly product

		// Product product = manager.find(Product.class, 101);
		// if (product != null) {
		// System.out.println("product details!!!!!!!");
		//
		// System.out.println(product);
		// }

		// we can fetch review along with product also display automatically

		// Reviews reviews = manager.find(Reviews.class, 2);
		// if (reviews != null) {
		// System.out.println("reviews details!!!!!!!");
		//
		// System.out.println(reviews);
		// }

		// To Update the records by Using merge()

		// By Using product we can update product only not update along with reviews

		// Product product = manager.find(Product.class, 101);
		// if (product != null) {
		//
		// product.setPrice(39999.99); //to change the price 98999 to 39999.99
		// }
		//
		// transaction.begin();
		// manager.merge(product);
		// transaction.commit();

		// By Using reviews we can update review along with product also
		// To Update all reviews product
		// transaction.begin();
		// Reviews reviews = manager.find(Reviews.class, 2);
		// if(reviews!=null) {
		// reviews.setComment("very good");//To change comment good To Very good
		//
		// manager.merge(reviews);
		// Product product = reviews.getProduct();
		// if (product != null) {
		// product.setPname("clinic plus");//To change pname samsung mobile to clinic
		// plus
		// manager.merge(product);
		// }
		// }
		// transaction.commit();

		// To remove or delete the records by using remove()

		// we can't remove product directly because associated with reviews
		// Product toremove=null;
		// Product product = manager.find(Product.class, 101);
		// if (product != null) {
		// toremove=product;
		// }
		// transaction.begin();
		// manager.remove(toremove);
		// transaction.commit();

		// we can remove reviews directly because dependent

		// Reviews toremove=null;
		// Reviews reviews = manager.find(Reviews.class, 2);
		// if(reviews!=null) {
		// toremove=reviews;
		// }
		// transaction.begin();
		// manager.remove(toremove);
		// transaction.commit();

	}

}
