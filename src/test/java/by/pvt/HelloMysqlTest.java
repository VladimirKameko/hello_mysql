package by.pvt;

import java.sql.Connection;
import java.sql.*;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.*;

import static org.junit.Assert.assertNotNull;

public class HelloMysqlTest  {
    @Test
    public void testconnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection connection = DriverManager
                            .getConnection("jdbc:mysql://localhost:3306/hello_mysql_junit?useSSL=false","root","fuckoff1990");
            Statement ps = connection.createStatement()
        ){
            ResultSet rs = ps.executeQuery("select * from system_users");
            assertNotNull(rs);

          /*  int rawCount = 0;
            int activeUser = 0;

            while(rs.next()){
                rawCount++;
                if(rs.getBoolean("active"))
                    activeUser++;*/
           /* }*/
        }

    }
}
