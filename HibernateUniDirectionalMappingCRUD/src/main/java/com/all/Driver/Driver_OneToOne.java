package com.all.Driver;

import com.oneToOne.Entity.Car;
import com.oneToOne.Entity.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_OneToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("swamy");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

		// To Insert the Data From Table By Using persist()

		// car 1
		// Car c1 = new Car();
		// c1.setCar_Id("101");
		// c1.setCar_Name("BMW");
		// c1.setPrice(8999999);

		// engine 1
		// Engine e1 = new Engine();
		// e1.setEngine_Id("BMW1122");
		// e1.setEngine_Type("petrol");
		// e1.setCc(3000);

		// c1.setEngine(e1);

		// car 2
		// Car c2 = new Car();
		// c2.setCar_Id("102");
		// c2.setCar_Name("BENZ");
		// c2.setPrice(9999999);

		// engine 2
		// Engine e2 = new Engine();
		// e2.setEngine_Id("BENZ3344");
		// e2.setEngine_Type("diesel");
		// e2.setCc(2500);

		// c2.setEngine(e2);

		// car 3
		// Car c3 = new Car();
		// c3.setCar_Id("103");
		// c3.setCar_Name("KIA");
		// c3.setPrice(2500000);

		// engine 3
		// Engine e3 = new Engine();
		// e3.setEngine_Id("KIA5566");
		// e3.setEngine_Type("hybrid");
		// e3.setCc(1000);

		// c3.setEngine(e3);

		// transaction.begin();
		// manager.persist(c1);
		// manager.persist(c2);
		// manager.persist(c3);
		// transaction.commit();

		// To fetch the Records By Using find()

		// By Using Car We Can Display Engine Also
		// Car car = manager.find(Car.class, 101);
		// if(car!=null) {
		// System.out.println("Car Details");
		// System.out.println(car);
		// }

		// By Using Engine We Can't Display Car
		// Engine engine = manager.find(Engine.class,"KIA5566");
		// if (engine!=null) {
		// System.out.println("Engine Details");
		// System.out.println(engine);
		// }

		// To Update the Records By Using merge()

		// any changes made in parent to effect child also by using cascade type in
		// parent class
		// By using Parent Entity We can Update Child Entity Also
		// Car car = manager.find(Car.class, 103);
		// if(car!=null) {
		// car.setPrice(3000000);//To Change the Car Price 2500000 to 3000000
		// Engine engine = car.getEngine();
		// if (engine!=null) {
		// engine.setEngine_Type("petrol");//To Change the type hybrid to petrol
		// }
		// }
		// transaction.begin();
		// manager.merge(car);
		// transaction.commit();

		// By Using Child Entity we Can't Update Parent Entity
		// Engine engine = manager.find(Engine.class, "BENZ3344");
		// if (engine!=null) {
		// engine.setCc(3500);//To the cc Change 2500 to 3500
		// }

		// transaction.begin();
		// manager.merge(engine);
		// transaction.commit();

		// To Delete (or) Remove the Records By Using remove()

		// We Can remove Car Engine also remove
		// We Can remove the car directly because parent entity and independent
		// Car car = manager.find(Car.class, 103);
		// if(car!=null) {
		// transaction.begin();
		// manager.remove(car);
		// transaction.commit();
		// }

		// We Can't remove Engine Directly Because engine is depends on Car
	}

}
