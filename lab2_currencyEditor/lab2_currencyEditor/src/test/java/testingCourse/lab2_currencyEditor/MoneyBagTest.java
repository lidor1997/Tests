package testingCourse.lab2_currencyEditor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MoneyBagTest {
    // Set up Money objects and a MoneyBag before each test
    private Money USD10;
    private Money CHF12;
    private Money ILS20;
    private MoneyBag moneyBag;

    // Set up Money objects and a MoneyBag before each test
    @BeforeEach
    void setUp() throws Exception {
        USD10= new Money(10,"USD");
        CHF12=new Money(12,"CHF");
        ILS20=new Money(20,"NIS");
        moneyBag=new MoneyBag(new Money[] {USD10,CHF12});
    }

    // Test adding 10 USD and checking if the resulting MoneyBag contains 20 USD
    @Test
    void testAddMoney1() {
        MoneyBag result= (MoneyBag) moneyBag.add(USD10);
        assertTrue(result.contains(new Money(20,"USD")));
    }

    // Test if the MoneyBag contains 10 USD
    @Test
    void testContains1() {
        assertTrue(moneyBag.contains(USD10));
    }

    // Test adding 12 CHF and checking if the resulting MoneyBag contains 24 CHF
    @Test
    void testAddMoney2() {
        MoneyBag result= (MoneyBag) moneyBag.add(CHF12);
        assertTrue(result.contains(new Money(24,"CHF")));
    }

    // Test if the MoneyBag contains 12 CHF
    @Test
    void testContains2() {
        assertTrue(moneyBag.contains(CHF12));
    }

    // Test adding 12 CHF and checking if the resulting MoneyBag contains 24 CHF
    @Test
    void testAddMoney3() {
        MoneyBag result= (MoneyBag) moneyBag.add(CHF12);
        assertTrue(result.contains(new Money(24,"CHF")));
    }

    // Test if the MoneyBag contains 20 ILS, handle NullPointerException if caught
    @Test
    void testContains3() {
        try {
            assertFalse(moneyBag.contains(ILS20));
        }
        catch (NullPointerException e) {
            assertFalse(true);
        }
    }

    // Test adding 10 USD and checking if the resulting MoneyBag contains 30 USD
    @Test
    void testAddMoney4() {
        MoneyBag result= (MoneyBag) moneyBag.add(USD10);
        assertTrue(result.contains(new Money(30,"USD10")));
    }

    // Test if the MoneyBag contains 12 CHF
    @Test
    void testContains4() {
        assertTrue(moneyBag.contains(CHF12));
    }
}

