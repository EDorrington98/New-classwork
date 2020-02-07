package com.qa.databases;

import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MysqlCustomerDao implements Dao<Customer> {
	private Connection connection;

	public MysqlCustomerDao() throws SQLException {
		System.out.println("User: ");
		String user = Utils.input();
		System.out.println("Password: ");
		Console console = System.console();
		String password = Utils.input();
//		System.out.println(console.readPassword("password"));
		this.connection = DriverManager.getConnection("jdbc:mysql://35.234.153.182:3306/project_db", user,
				password);
	}

//	public List <Customer> getAll(){

//	}

	public void create(Customer customer) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Customer> readAll() {
				ArrayList<Customer> customers = new ArrayList<Customer>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from customers");
			while (resultSet.next()) {
				Long id = resultSet.getLong("id");
				String firstName = resultSet.getString("firstName");
				String surname = resultSet.getString("surname");
				Customer customer = new Customer(id, firstName, surname);
				customers.add(customer);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;// TODO Auto-generated method stub
	}

	public void update(Customer customer) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	};

}
