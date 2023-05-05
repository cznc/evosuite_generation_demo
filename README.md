
# Generate UT
mvn -DmemoryInMB=2000 -Dcores=2 evosuite:generate evosuite:export  test

# Instead EvoRunner of SpringJUnit4ClassRunner
src\test\java\com\SomeBusiness_ESTest.java
//@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true)
@RunWith(SpringJUnit4ClassRunner.class)
public class SomeBusiness_ESTest{ //extends SomeBusiness_ESTest_scaffolding {

# To find out propertly version of dependency:
https://developer.aliyun.com/mvn/search

2023/5/6 0:58

