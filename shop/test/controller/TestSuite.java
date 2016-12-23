/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author NguyenIT
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tools.MD5Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  CartServletTest.class,
  CheckEmailServletTest.class,
  CheckOutServletTest.class,
  UsersServletTest.class,
  MD5Test.class,
})

public class TestSuite {

}

