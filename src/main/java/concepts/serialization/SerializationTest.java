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

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.google.gson.Gson;


public class SerializationTest {

	public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {

		/*
		 * Serialization Process
		 */

		Person person = new Person("Krishna", "Bangalore", 29, "9986736810");

		FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		fis.close();

		System.out.println(obj);

		System.out.println("------------------------------------------------------------");

		/*
		 * Externalization Process
		 */

		Person2 person2 = new Person2("Srinath", "Hyderabad", 25, "9742061108");

		fos = new FileOutputStream("person2.ser");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(person2);
		oos.close();
		fos.close();

		fis = new FileInputStream("person2.ser");
		ois = new ObjectInputStream(fis);
		obj = ois.readObject();
		ois.close();
		fis.close();

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

/**
 * The Object to be Externalize
 * 
 * @author krishna
 *
 */
class Person2 implements Externalizable {

	private static final long serialVersionUID = 1L;
	private transient static final Gson GSON = new Gson();
	private String name;
	private String address;
	private int age;
	private transient String socialSecurityNumber;


	public Person2() {

	}

	public Person2(String name, String address, int age, String socialSecurityNumber) {
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

	public Person2 getClone() throws CloneNotSupportedException {
		return (Person2) super.clone();
	}


	public void writeExternal(ObjectOutput out) throws IOException {

		out.writeObject(name);
		out.writeObject(address);
		out.writeInt(age);

	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

		name = (String) in.readObject();
		address = (String) in.readObject();
		age = in.readInt();

	}

}