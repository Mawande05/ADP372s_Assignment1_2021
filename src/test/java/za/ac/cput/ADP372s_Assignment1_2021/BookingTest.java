package za.ac.cput.ADP372s_Assignment1_2021;
/*
@author Mawande Langa 219074054
@date 01 April 2021
@Task ADP3 asssignment 1
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {

    //Instantiate Objects
    private Booking customer1;
    private Booking customer2;
    private Booking customer3;

    //SetUp object before each test
    @BeforeEach
    void setUp() {
        customer1 = new Booking();
        customer2 = new Booking();
        customer3 = customer2;
    }

    //Identity
    @Test
    void testObjectIdentity(){
        assertSame(customer3,customer2);
    }

    @Test
    void  testObjectEquality(){
        assertEquals(customer2,customer3);
    }

    @Test
    void failTest(){
        fail("Customer1 is not equal to customer2");
        assertEquals(customer1,customer2);

    }

    @Test
    void timeOutTest()throws InterruptedException{
        Thread.sleep(500);
        assertEquals(customer1,customer2);
    }


    @Disabled("Test has been disabled")
    @Test
    void disableTest(){
        assertEquals(customer2,customer3);
    }

}