package utility;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLAccess
{
	private Connection connect = null;
	private ResultSet resultSet;
	
	private String dbConnection = "";
	private String dbUser = "";
	private String dbPassword = "";
}