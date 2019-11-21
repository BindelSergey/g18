package by.belhard.g18.Lesson10;

import java.sql.*;

public class JdbcExample {

    private  static final String PATH =
    "jdbc:mysql://localhost/bh18db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static void main(String[] args) throws SQLException {

        Connection connection=
                DriverManager.getConnection(PATH,USER,PASS);
        Statement statement =  connection.createStatement();
        String name = "Oleg";

        statement.execute(
                String.format("insert into emloyees value (null,'%s', '2019-01-01', %d, %d)",name, 1,1500));

        statement.close();
        connection.close();
    }
}
