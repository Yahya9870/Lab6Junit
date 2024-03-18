

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.MethodSorters;

import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

//ALREADY IMPLEMENTED; DO NOT MODIFY
//NO NEED TO SUBMIT THIS FILE

/*
 * Tests included in this class serve as documentation on how instances of a
 * Toy, Child and Order work.
 *
 * Be sure to also read the Lab5 instructions PDF carefully
 *
 * Programming IDEs such as Eclipse are able to fix such compilation errors for
 * you. However, you are advised to follow the guidance as specified in the
 * written Lab instructions PDF to fix these compilation errors manually,
 * because: 1) it helps you better understand how the intended classes and
 * methods work together; and 2) you may be tested in a written test or exam
 * without the assistance of IDEs.
 *
 */

public class JunitTest_ChildOrderToyTest {
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    /*
     * Recommended exercises: Visualizing and tracing (on both debugger and paper)
     * on how objects are created and manipulated in each test would be extremely
     * valuable for reinforcing your understanding.
     */
    @Test
    public void test_0_0() {
        Toy t1 = new Toy(1000121, "Red Bike", 1, 89.99);
        int toyID = t1.getToyID();
        String toyName = t1.getToyName();
        int toyQty = t1.getToyQuantity();
        double toyPrice = t1.getToyPrice();
        String toyInfo = t1.getToyInformation();

        int expToyID = 1000121;
        int expToyQty = 1;
        double expToyPrice = 89.99;
        String expToyName = "Red Bike";
        String expToyInfo = "Toy(1000121,Red Bike), quantity(1) with $( 89.99)/toy";

        String errorMsg1 = String.format("\n Test getToyID failed. Returned (%d) " + "but correct is  (%d)", toyID,
                expToyID);
        assertEquals(errorMsg1, expToyID, toyID);

        String errorMsg2 = String.format("\n Test getToyName failed. Returned (%s) " + "but correct is  (%s)", toyName,
                expToyName);
        assertEquals(errorMsg2, expToyName, toyName);

        String errorMsg3 = String.format("\n Test getToyQuantity failed. Returned (%d) " + "but correct is  (%d)",
                toyQty, expToyQty);
        assertEquals(errorMsg3, expToyQty, toyQty);

        String errorMsg4 = String.format("\n Test getToyPrice failed. Returned (%6.2f) " + "but correct is  (%6.2f)",
                toyPrice, expToyPrice);
        final double THRESHOLD = .01;
        assertTrue(errorMsg4, Math.abs(expToyPrice - toyPrice) < THRESHOLD);

        String errorMsg5 = String.format("\n Test getToyInformation failed. Returned (%s) " + "but correct is  (%s)",
                toyInfo, expToyInfo);
        assertEquals(errorMsg5, expToyInfo, toyInfo);

    }

    /*
     * Recommended exercises: Visualizing and tracing (on both debugger and paper)
     * on how objects are created and manipulated in each test would be extremely
     * valuable for reinforcing your understanding.
     */

    @Test
    public void test_0_1() {
        Toy t1 = new Toy(1000123, "Colouring Book", 3, 9.99);
        t1.setToyID(1000127);
        t1.setToyName("SpongeBob DVD");
        t1.setToyQuantity(8);
        t1.setToyPrice(29.98);

        int toyID = t1.getToyID();
        String toyName = t1.getToyName();
        int toyQty = t1.getToyQuantity();
        double toyPrice = t1.getToyPrice();
        String toyInfo = t1.getToyInformation();

        int expToyID = 1000127;
        int expToyQty = 8;
        double expToyPrice = 29.98;
        String expToyName = "SpongeBob DVD";
        String expToyInfo = "Toy(1000127,SpongeBob DVD), quantity(8) with $( 29.98)/toy";

        String errorMsg1 = String.format("\n Test setToyID failed. Returned (%d) " + "but correct is  (%d)", toyID,
                expToyID);
        assertEquals(errorMsg1, expToyID, toyID);

        String errorMsg2 = String.format("\n Test setToyName failed. Returned (%s) " + "but correct is  (%s)", toyName,
                expToyName);
        assertEquals(errorMsg2, expToyName, toyName);

        String errorMsg3 = String.format("\n Test setToyQuantity failed. Returned (%d) " + "but correct is  (%d)",
                toyQty, expToyQty);
        assertEquals(errorMsg3, expToyQty, toyQty);

        String errorMsg4 = String.format("\n Test setToyPrice failed. Returned (%6.2f) " + "but correct is  (%6.2f)",
                toyPrice, expToyPrice);
        final double THRESHOLD = .01;
        assertTrue(errorMsg4, Math.abs(expToyPrice - toyPrice) < THRESHOLD);

        String errorMsg5 = String.format("\n Test getToyInformation failed. Returned (%s) " + "but correct is  (%s)",
                toyInfo, expToyInfo);
        assertEquals(errorMsg5, expToyInfo, toyInfo);

    }


    @Test
    public void test_0_2() {
        Toy t1 = new Toy(1000123, "Colouring Book", 3, 9.99);
        t1.setToyID(1000854);
        t1.setToyName("Teddy Bear");
        t1.setToyQuantity(4);
        t1.setToyPrice(19.80);

        int toyID = t1.getToyID();
        String toyName = t1.getToyName();
        int toyQty = t1.getToyQuantity();
        double toyPrice = t1.getToyPrice();
        String toyInfo = t1.getToyInformation();

        int expToyID = 1000854;
        int expToyQty = 4;
        double expToyPrice = 19.8;
        String expToyName = "Teddy Bear";
        String expToyInfo = "Toy(1000854,Teddy Bear), quantity(4) with $( 19.80)/toy";

        String errorMsg1 = String.format("\n Test setToyID failed. Returned (%d) " + "but correct is  (%d)", toyID,
                expToyID);
        assertEquals(errorMsg1, expToyID, toyID);

        String errorMsg2 = String.format("\n Test setToyName failed. Returned (%s) " + "but correct is  (%s)", toyName,
                expToyName);
        assertEquals(errorMsg2, expToyName, toyName);

        String errorMsg3 = String.format("\n Test setToyQuantity failed. Returned (%d) " + "but correct is  (%d)",
                toyQty, expToyQty);
        assertEquals(errorMsg3, expToyQty, toyQty);

        String errorMsg4 = String.format("\n Test setToyPrice failed. Returned (%6.2f) " + "but correct is  (%6.2f)",
                toyPrice, expToyPrice);
        final double THRESHOLD = .01;
        assertTrue(errorMsg4, Math.abs(expToyPrice - toyPrice) < THRESHOLD);

        String errorMsg5 = String.format("\n Test getToyInformation failed. Returned (%s) " + "but correct is  (%s)",
                toyInfo, expToyInfo);
        assertEquals(errorMsg5, expToyInfo, toyInfo);

    }



    /*
     * Recommended exercises: Visualizing and tracing (on both debugger and paper)
     * on how objects are created and manipulated in each test would be extremely
     * valuable for reinforcing your understanding.
     */

    @Test
    public void test_2_0() {
        Toy t1 = new Toy(1000121, "Red Bike", 3, 98.90);
        Toy t2 = new Toy(1000123, "Colouring Book", 4, 19.89);
        Toy t3 = new Toy(1000128, "Skateboard", 5, 149.99);
        Toy t4 = new Toy(1000127, "SpongeBob DVD", 3, 14.99);
        Toy t5 = new Toy(1000130, "Bike Helmet", 1, 18.99);
        Toy t6 = new Toy(1000125, "Toy car", 10, 3.99);
        Toy t7 = new Toy(1000129, "Ball", 2, 5.59);
        Toy t8 = new Toy(1000189, "Teddy Bear", 3, 10.79);

        Toy[] listofToy = null; // list is pointing to nothing
        Toy[] listofToy1 = { t1, t2 };
        Toy[] listofToy2 = { t3, t4, t5, t6 };

        /*
         * Create child with empty list of toys
         */

        Child c = new Child("Lucas", 2, listofToy);
        int expNumofToys = 0;
        int expChildAge = 2;
        String expChildName = "Lucas";

        int numofToys = c.getNumberofToys();
        int childAge = c.getChildAge();
        String childName = c.getChildName();
        /*
         * Length of the returned array from getChildToy corresponds to the number of
         * toys inside listofToy which is zero.
         *
         */
        Toy[] childToysList = c.getChildToy();

        String errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)",
                numofToys, expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        String errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)",
                childAge, expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        String errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)",
                childName, expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        String errorMsg4 = String.format("\n Test getChildToy failed. Returned nul but did not ");
        assertTrue(errorMsg4, childToysList == null);

        // String representation for the child object
        String childstr = c.toString();

        String expChildStr = "Child [Lucas] of age <2> has (0) toys";
        String errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        Child c1 = new Child("Olivia", 1, listofToy1);
        expNumofToys = 2;
        expChildAge = 1;
        expChildName = "Olivia";

        /*
         * Number of toys this child has should be correspond to the number of toys
         * inside listofToy1.
         *
         */
        numofToys = c1.getNumberofToys();
        childAge = c1.getChildAge();
        childName = c1.getChildName();
        /*
         * Length of the returned array from getChildToy corresponds to the number of
         * toys inside listofToy1.
         *
         */
        childToysList = c1.getChildToy();

        errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)", numofToys,
                expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)", childAge,
                expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)", childName,
                expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        errorMsg4 = String.format("\n Test getChildToy failed. Returned array of length (%d) " + "but correct is  (%d)",
                childToysList.length, listofToy1.length);
        assertEquals(errorMsg4, listofToy1.length, childToysList.length);

        childstr = c1.toString();

        expChildStr = "Child [Olivia] of age <1> has (2) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        Child c2 = new Child("Emma", 3, listofToy2);
        expNumofToys = 4;
        expChildAge = 3;
        expChildName = "Emma";

        numofToys = c2.getNumberofToys();
        childAge = c2.getChildAge();
        childName = c2.getChildName();
        childToysList = c2.getChildToy();

        errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)", numofToys,
                expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)", childAge,
                expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)", childName,
                expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        errorMsg4 = String.format("\n Test getChildToy failed. Returned array of length (%d) " + "but correct is  (%d)",
                childToysList.length, listofToy2.length);
        assertEquals(errorMsg4, listofToy2.length, childToysList.length);

        childstr = c2.toString();

        expChildStr = "Child [Emma] of age <3> has (4) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

    }
    /*
     * Recommended exercises: Visualizing and tracing (on both debugger and paper)
     * on how objects are created and manipulated in each test would be extremely
     * valuable for reinforcing your understanding.
     */

    @Test
    public void test_2_1() {
        Toy t1 = new Toy(1000121, "Red Bike", 3, 98.90);
        Toy t2 = new Toy(1000123, "Colouring Book", 4, 19.89);
        Toy t3 = new Toy(1000128, "Skateboard", 5, 149.99);
        Toy t4 = new Toy(1000127, "SpongeBob DVD", 3, 14.99);
        Toy t5 = new Toy(1000130, "Bike Helmet", 1, 18.99);
        Toy t6 = new Toy(1000125, "Toy car", 10, 3.99);
        Toy t7 = new Toy(1000129, "Ball", 2, 5.59);
        Toy t8 = new Toy(1000189, "Teddy Bear", 3, 10.79);

        Toy[] listofToy1 = { t1, t2 };

        Child c1 = new Child("James", 1, listofToy1);

        // verify the toys list for c1
        // It is important to note that each child owns their toys
        // So the child is not sharing his toys with another child

        assertTrue(c1.getChildToy().length == 2 && c1.getChildToy()[0] != t1 && c1.getChildToy()[1] != t2);
        assertTrue(c1.getChildToy().length == 2 && c1.getChildToy()[0].getToyName().equals("Red Bike")
                && c1.getChildToy()[1].getToyName().equals("Colouring Book"));

        assertTrue(c1.getChildToy().length == 2 && c1.getChildToy()[0].getToyQuantity() == 3
                && c1.getChildToy()[1].getToyQuantity() == 4);

        // test the copy constructor which create a copy of child
        // remember that each child owns their toys
        // So the child is not sharing his toys with another child

        Child c2 = new Child(c1);

        // After creating copy child sets the new name and set the age
        c2.setChildName("Jack");
        c2.setChildAge(5);

        int expNumofToys = 2;
        int expChildAge = 5;
        String expChildName = "Jack";

        int numofToys = c2.getNumberofToys();
        int childAge = c2.getChildAge();
        String childName = c2.getChildName();

        String errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)",
                numofToys, expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        String errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)",
                childAge, expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        String errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)",
                childName, expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        // String representation for the child object
        String childstr = c1.toString();


        String expChildStr = "Child [James] of age <1> has (2) toys";
        String errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        childstr = c2.toString();


        expChildStr = "Child [Jack] of age <5> has (2) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        // verify the toys list for c1
        // It is important to note that each child owns their toys
        // So the child is not sharing his toys with another child

        assertTrue(c1.getChildToy().length == 2 && c1.getChildToy()[0] != t1 && c1.getChildToy()[1] != t2);
        assertTrue(c1.getChildToy().length == 2 && c1.getChildToy()[0].getToyName().equals("Red Bike")
                && c1.getChildToy()[1].getToyName().equals("Colouring Book"));

        assertTrue(c1.getChildToy().length == 2 && c1.getChildToy()[0].getToyQuantity() == 3
                && c1.getChildToy()[1].getToyQuantity() == 4);

        // verify the toys list for c2, c2 will have similar toys as c1
        // It is important to note that each child owns their toys
        // So the child is not sharing his toys with another child

        assertTrue(c2.getChildToy().length == 2 && c2.getChildToy()[0] != t1 && c2.getChildToy()[1] != t2);
        assertTrue(c2.getChildToy().length == 2 && c2.getChildToy()[0].getToyName().equals("Red Bike")
                && c2.getChildToy()[1].getToyName().equals("Colouring Book"));

        assertTrue(c2.getChildToy().length == 2 && c2.getChildToy()[0].getToyQuantity() == 3
                && c2.getChildToy()[1].getToyQuantity() == 4);

        // Verify that the toys owned by c1 are different from the toys owned by c2
        assertTrue(c2.getChildToy()[0] != c1.getChildToy()[0] && c1.getChildToy()[1] != c2.getChildToy()[1]);

    }


    @Test
    public void test_2_3() {
        Toy t1 = new Toy(1000121, "Red Bike", 3, 98.90);
        Toy t2 = new Toy(1000123, "Colouring Book", 4, 19.89);
        Toy t3 = new Toy(1000128, "Skateboard", 5, 149.99);
        Toy t4 = new Toy(1000127, "SpongeBob DVD", 3, 14.99);
        Toy t5 = new Toy(1000130, "Bike Helmet", 1, 18.99);
        Toy t6 = new Toy(1000125, "Toy car", 10, 3.99);
        Toy t7 = new Toy(1000129, "Ball", 2, 5.59);
        Toy t8 = new Toy(1000189, "Teddy Bear", 3, 10.79);


        Toy[] listofToy1 = { t1, t2 };
        Toy[] listofToy2 = { t3, t4, t5, t6 };
        Toy[] listofToy3 = { t7, t8 };

        /*
         * Create child with empty list of toys
         */

        Child c = new Child("Mark", 4, listofToy3);
        int expNumofToys = 2;
        int expChildAge = 4;
        String expChildName = "Mark";

        int numofToys = c.getNumberofToys();
        int childAge = c.getChildAge();
        String childName = c.getChildName();

        Toy[] childToysList = c.getChildToy();

        String errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)",
                numofToys, expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        String errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)",
                childAge, expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        String errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)",
                childName, expChildName);
        assertEquals(errorMsg3, expChildName, childName);



        String errorMsg4 = String.format("\n Test getChildToy failed. Returned array of length (%d) " + "but correct is  (%d)",
                childToysList.length, listofToy3.length);
        assertEquals(errorMsg4, listofToy3.length, childToysList.length);



        // String representation for the child object
        String childstr = c.toString();

        String expChildStr = "Child [Mark] of age <4> has (2) toys";
        String errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        Child c1 = new Child("Max", 3, listofToy2);
        expNumofToys = 4;
        expChildAge = 3;
        expChildName = "Max";

        /*
         * Number of toys this child has should be correspond to the number of toys
         * inside listofToy1.
         *
         */
        numofToys = c1.getNumberofToys();
        childAge = c1.getChildAge();
        childName = c1.getChildName();
        /*
         * Length of the returned array from getChildToy corresponds to the number of
         * toys inside listofToy1.
         *
         */
        childToysList = c1.getChildToy();

        errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)", numofToys,
                expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)", childAge,
                expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)", childName,
                expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        errorMsg4 = String.format("\n Test getChildToy failed. Returned array of length (%d) " + "but correct is  (%d)",
                childToysList.length, listofToy2.length);
        assertEquals(errorMsg4, listofToy2.length, childToysList.length);

        childstr = c1.toString();

        expChildStr = "Child [Max] of age <3> has (4) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        Child c2 = new Child("Emma", 3, listofToy1);
        expNumofToys = 2;
        expChildAge = 3;
        expChildName = "Emma";

        numofToys = c2.getNumberofToys();
        childAge = c2.getChildAge();
        childName = c2.getChildName();
        childToysList = c2.getChildToy();

        errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)", numofToys,
                expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)", childAge,
                expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)", childName,
                expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        errorMsg4 = String.format("\n Test getChildToy failed. Returned array of length (%d) " + "but correct is  (%d)",
                childToysList.length, listofToy1.length);
        assertEquals(errorMsg4, listofToy1.length, childToysList.length);

        childstr = c2.toString();

        expChildStr = "Child [Emma] of age <3> has (2) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

    }






    /*
     * Recommended exercises: Visualizing and tracing (on both debugger and paper)
     * on how objects are created and manipulated in each test would be extremely
     * valuable for reinforcing your understanding.
     */

    @Test
    public void test_2_5() {
        Toy t1 = new Toy(1000121, "Red Bike", 3, 98.90);
        Toy t2 = new Toy(1000123, "Colouring Book", 4, 19.89);
        Toy t3 = new Toy(1000128, "Skateboard", 5, 149.99);
        Toy t4 = new Toy(1000127, "SpongeBob DVD", 3, 14.99);
        Toy t5 = new Toy(1000130, "Bike Helmet", 1, 18.99);
        Toy t6 = new Toy(1000125, "Toy car", 10, 3.99);
        Toy t7 = new Toy(1000129, "Ball", 2, 5.59);
        Toy t8 = new Toy(1000189, "Teddy Bear", 3, 10.79);

        Toy[] listofToy1 = { t1, t2 };
        Toy[] listofToy2 = { t3, t4, t5, t6 };
        Toy[] listofToy3 = { t7, t8 };

        Child c1 = new Child("James", 1, listofToy1);
        // String representation for the child object
        String childstr = c1.toString();

        String expChildStr = "Child [James] of age <1> has (2) toys";
        String errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        Child c2 = new Child("Luca", 3, listofToy2);

        childstr = c2.toString();

        expChildStr = "Child [Luca] of age <3> has (4) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        Child c3 = new Child("Ethan", 5, listofToy3);
        childstr = c3.toString();

        expChildStr = "Child [Ethan] of age <5> has (2) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        // child dispose his toys
        c1.disposeToys();

        int expNumofToys = 0;
        int expChildAge = 1;
        String expChildName = "James";

        int numofToys = c1.getNumberofToys();
        int childAge = c1.getChildAge();
        String childName = c1.getChildName();
        /*
         * Length of the returned array from getChildToy corresponds to the number of
         * toys inside listofToy which is zero.
         *
         */
        Toy[] childToysList = c1.getChildToy();

        String errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)",
                numofToys, expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        String errorMsg2 = String.format("\n Test getChildAge failed. Returned (%d) " + "but correct is  (%d)",
                childAge, expChildAge);
        assertEquals(errorMsg2, expChildAge, childAge);

        String errorMsg3 = String.format("\n Test getChildName failed. Returned (%s) " + "but correct is  (%s)",
                childName, expChildName);
        assertEquals(errorMsg3, expChildName, childName);

        String errorMsg4 = String.format("\n Test getChildToy failed. Returned null but did not ");
        assertTrue(errorMsg4, childToysList == null);

        // String representation for the child object
        childstr = c1.toString();

        expChildStr = "Child [James] of age <1> has (0) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        // A child can denote his toys to another child, but he can not donate to
        // himself
        c2.donate(c1);
        // c2 toys become c1 toys
        expNumofToys = 0;
        numofToys = c2.getNumberofToys();
        childToysList = c2.getChildToy();

        errorMsg1 = String.format("\n Test getNumberofToys failed. Returned (%d) " + "but correct is  (%d)", numofToys,
                expNumofToys);
        assertEquals(errorMsg1, expNumofToys, numofToys);

        errorMsg4 = String.format("\n Test getChildToy failed. Returned null but did not ");
        assertTrue(errorMsg4, childToysList == null);

        // String representation for the child object
        childstr = c2.toString();

        expChildStr = "Child [Luca] of age <3> has (0) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        childstr = c1.toString();

        expChildStr = "Child [James] of age <1> has (4) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        // A child can denote his toys to another child, but he can not donate to
        // himself
        c3.donate(c1);
        // c3 toys become c1 toys so we have to add to the toy list of c1

        childstr = c3.toString();

        expChildStr = "Child [Ethan] of age <5> has (0) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

        childstr = c1.toString();

        expChildStr = "Child [James] of age <1> has (6) toys";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", childstr,
                expChildStr);
        assertEquals(errorMsg5, expChildStr, childstr);

    }

    /*
     * Recommended exercises: Visualizing and tracing (on both debugger and paper)
     * on how objects are created and manipulated in each test would be extremely
     * valuable for reinforcing your understanding.
     */
    @Test
    public void test_3_0() {
        Toy t1 = new Toy(1000121, "Red Bike", 3, 98.90);
        Toy t2 = new Toy(1000123, "Colouring Book", 4, 19.89);
        Toy t3 = new Toy(1000128, "Skateboard", 5, 149.99);
        Toy t4 = new Toy(1000127, "SpongeBob DVD", 3, 14.99);
        Toy t5 = new Toy(1000130, "Bike Helmet", 1, 18.99);
        Toy t6 = new Toy(1000125, "Toy car", 10, 3.99);
        Toy t7 = new Toy(1000129, "Ball", 2, 5.59);
        Toy t8 = new Toy(1000189, "Teddy Bear", 3, 10.79);

        Toy[] listofToy1 = { t1 };
        Toy[] listofToy2 = { t1, t3 };
        Toy[] listofToy3 = { t2, t5, t6 };
        Toy[] listofToy4 = { t7, t8, t2, t4 };
        Toy[] listofToy5 = { t1, t2, t3, t4, t7 };
        Toy[] listofToy6 = { t1, t2, t3, t4, t5, t6, t7 };
        Toy[] listofToy7 = { t1, t2, t3, t4, t5, t6, t7, t8 };
        Toy[] listofToy8 = { t3, t4, t5, t6 };
        Toy[] listofToy9 = { t5, t6 };

        Order o1 = new Order();
        /* The order empty there is no childs */
        int numofChild = o1.getNumofChilds();
        int expNumofChild = 0;

        String errorMsg1 = String.format(
                "\n Test getNumofChilds in the order failed. Returned (%d) " + "but correct is  (%d)", numofChild,
                expNumofChild);
        assertEquals(errorMsg1, expNumofChild, numofChild);

        // String representation for the order object
        String orderstr = o1.toString();

        String expOrderStr = "The order contains 0 Childs";
        String errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", orderstr,
                expOrderStr);
        assertEquals(errorMsg5, expOrderStr, orderstr);

        Child c1 = new Child("Sophia", 2, listofToy8);
        Child c2 = new Child("Harper", 4, listofToy9);
        Child c3 = new Child("James", 5, listofToy6);
        Child c4 = new Child("Levi", 6, listofToy1);
        Child c5 = new Child("Luca", 1, listofToy2);
        Child c6 = new Child("Leo", 3, listofToy7);
        Child c7 = new Child("Oliver", 4, listofToy5);
        Child c8 = new Child("Lucas", 3, listofToy4);
        Child c9 = new Child("Ellie", 2, listofToy3);
        Child c10 = new Child("Mila", 1, listofToy5);

        o1.addChildtoOrder(c1);
        numofChild = o1.getNumofChilds();
        expNumofChild = 1;

        errorMsg1 = String.format("\n Test getNumofChilds in the order failed. Returned (%d) " + "but correct is  (%d)",
                numofChild, expNumofChild);
        assertEquals(errorMsg1, expNumofChild, numofChild);

        orderstr = o1.toString();


        expOrderStr = "The order contains 1 Childs";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", orderstr,
                expOrderStr);
        assertEquals(errorMsg5, expOrderStr, orderstr);

        // verify that c1 is added to the order o1
        // Note that the order does not own the child; the child belongs to or is
        // included in the order.
        assertTrue(o1.getChilds().length == 1 && o1.getChilds()[0] == c1);

        assertTrue(o1.getChilds().length == 1 && o1.getChilds()[0].getChildName().equals("Sophia"));

        // add more childs
        o1.addChildtoOrder(c2);
        o1.addChildtoOrder(c10);
        assertTrue(o1.getChilds().length == 3 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c2
                && o1.getChilds()[2] == c10);

        assertTrue(o1.getChilds().length == 3 && o1.getChilds()[0].getChildName().equals("Sophia")
                && o1.getChilds()[1].getChildName().equals("Harper")
                && o1.getChilds()[2].getChildName().equals("Mila"));

        orderstr = o1.toString();


        expOrderStr = "The order contains 3 Childs";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", orderstr,
                expOrderStr);
        assertEquals(errorMsg5, expOrderStr, orderstr);

        // remove child from the order
        o1.removeChildfromOrder(c2);
        assertTrue(o1.getChilds().length == 2 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c10);

        assertTrue(o1.getChilds().length == 2 && o1.getChilds()[0].getChildName().equals("Sophia")

                && o1.getChilds()[1].getChildName().equals("Mila"));

        // Try to remove a child from the order given that the child does not exist in
        // the order
        // do nothing, this operation has no effect
        o1.removeChildfromOrder(c5);
        assertTrue(o1.getChilds().length == 2 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c10);
        o1.removeChildfromOrder(c2);
        o1.removeChildfromOrder(c6);
        assertTrue(o1.getChilds().length == 2 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c10);

        // add more childs
        o1.addChildtoOrder(c9);
        o1.addChildtoOrder(c3);
        o1.addChildtoOrder(c4);
        assertTrue(o1.getChilds().length == 5 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c10
                && o1.getChilds()[2] == c9 && o1.getChilds()[3] == c3 && o1.getChilds()[4] == c4);

        /*
         * Maximum number of child allowed to be in any given order is 5. Adding beyond
         * the maximum capacity of order will have no effect.
         */
        o1.addChildtoOrder(c6);
        o1.addChildtoOrder(c5);
        assertTrue(o1.getChilds().length == 5 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c10
                && o1.getChilds()[2] == c9 && o1.getChilds()[3] == c3 && o1.getChilds()[4] == c4);
        orderstr = o1.toString();


        expOrderStr = "The order contains 5 Childs";
        errorMsg5 = String.format("\n Test toString failed. Returned (%s) " + "but correct is  (%s)", orderstr,
                expOrderStr);
        assertEquals(errorMsg5, expOrderStr, orderstr);

        // remove child from order
        o1.removeChildfromOrder(c3);
        assertTrue(o1.getChilds().length == 4 && o1.getChilds()[0] == c1 && o1.getChilds()[1] == c10
                && o1.getChilds()[2] == c9 && o1.getChilds()[3] == c4);
        // remove more child
        o1.removeChildfromOrder(c1);
        o1.removeChildfromOrder(c9);
        assertTrue(o1.getChilds().length == 2 && o1.getChilds()[0] == c10 && o1.getChilds()[1] == c4);

        // add more childs again
        o1.addChildtoOrder(c6);
        o1.addChildtoOrder(c5);
        o1.addChildtoOrder(c7);
        o1.addChildtoOrder(c8);
        assertTrue(o1.getChilds().length == 5 && o1.getChilds()[0] == c10 && o1.getChilds()[1] == c4
                && o1.getChilds()[2] == c6 && o1.getChilds()[3] == c5 && o1.getChilds()[4] == c7);

        assertTrue(o1.getChilds().length == 5 && o1.getChilds()[0].getChildName().equals("Mila")
                && o1.getChilds()[1].getChildName().equals("Levi")
                && o1.getChilds()[2].getChildName().equals("Leo")
                && o1.getChilds()[3].getChildName().equals("Luca")
                && o1.getChilds()[4].getChildName().equals("Oliver"));


    }

}
