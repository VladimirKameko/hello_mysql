package by.pvt.service;

import by.pvt.dto.SystemUsers;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SystemUsersServiceTest {
    SystemUsersService objUnderTest;

    @Test
    public void getSystemUsers() throws Exception {
        objUnderTest=new SystemUsersService();
        objUnderTest.setSqlSessionFactory(
                new SqlSessionFactoryBuilder().build(
                        Resources.getResourceAsStream("by/pvt/service/mybatis-config-junit.xml")
        ));
        List<SystemUsers>list = objUnderTest.getSystemUsers(null);

        assertEquals(1,list.size());
    }
}