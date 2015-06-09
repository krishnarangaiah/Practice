/**
 * @author krishna
 * 
 * Serialization Process: Java Serialization API allows us to convert an Object to stream 
 * that we can send over the network or save it as file or store in DB for later usage. 
 * Deserialization is the process of converting Object stream to actual Java Object to be 
 * used in our program
 * 
 * Java Serialization process seems very easy to use at first but it comes with some trivial security 
 * and integrity issues that we will look in the later part of this article. 
 * 
 */

package concepts.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.google.gson.Gson;


public class SerializationTest {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		Person person = new Person("Krishna", "Bangalore", 29, "9986736810");
		System.out.println(person);
		Person person2 = person.getClone();
		System.out.println(person2);
		System.out.println("Hashcodes: p1: " + person.hashCode() + " | p2: " + person2.hashCode());

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		fos.close();

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();

		System.out.println("------------------------------------------------------------");

		System.out.println(obj);


	}

}

/**
 * The Object to be serialized
 * 
 * @author krishna
 *
 */
class Person implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private transient static final Gson GSON = new Gson();
	private String name;
	private String address;
	private int age;
	private transient String socialSecurityNumber;

	public Person(String name, String address, int age, String socialSecurityNumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public String toString() {
		return GSON.toJson(this);
	}

	public Person getClone() throws CloneNotSupportedException {
		return (Person) super.clone();
	}

}