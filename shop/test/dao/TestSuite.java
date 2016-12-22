/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author NguyenIT
 */
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  CategoryDAOTest.class,
  DetailBillDAOTest.class,
  BillDAOTest.class,
  ProductDAOTest.class,
  UsersDAOTest.class,
})

public class TestSuite {

}
