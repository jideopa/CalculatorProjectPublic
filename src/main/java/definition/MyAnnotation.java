package definition;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyAnnotation {

    //Junit Annonation


    @Before
   public void TC_1(){
        System.out.println("Tc1");
    }


    @Test
   public void TC_2(){
        System.out.println("Tc2");
    }

   @Test
  public   void TC_3(){
        System.out.println("Tc3");
    }

  @After
  public   void TC_4(){
        System.out.println("Tc4");

    }



}
