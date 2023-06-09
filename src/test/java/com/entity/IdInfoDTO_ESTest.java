/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:33:19 GMT 2023
 */

package com.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import com.entity.IdInfoDTO;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IdInfoDTO_ESTest extends IdInfoDTO_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IdInfoDTO idInfoDTO0 = new IdInfoDTO();
      idInfoDTO0.setCrdTp("2*(");
      String string0 = idInfoDTO0.getCrdTp();
      assertEquals("2*(", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IdInfoDTO idInfoDTO0 = new IdInfoDTO();
      idInfoDTO0.setCrdNo("M");
      String string0 = idInfoDTO0.getCrdNo();
      assertEquals("M", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IdInfoDTO idInfoDTO0 = new IdInfoDTO();
      idInfoDTO0.setCrdNo("");
      String string0 = idInfoDTO0.getCrdNo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IdInfoDTO idInfoDTO0 = new IdInfoDTO();
      String string0 = idInfoDTO0.getCrdTp();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IdInfoDTO idInfoDTO0 = new IdInfoDTO();
      String string0 = idInfoDTO0.getCrdNo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      IdInfoDTO idInfoDTO0 = new IdInfoDTO();
      idInfoDTO0.setCrdTp("");
      String string0 = idInfoDTO0.getCrdTp();
      assertEquals("", string0);
  }
}
