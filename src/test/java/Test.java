package org.ooplearn.encapsulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private final String RAW = "Secure123!";

    @BeforeEach
    void init() {
        user = new User();
    }

    @Test
    void testPasswordHashIsNotNullOrEmpty() {
        user.setPassword(RAW);
        String hash = user.getPasswordHash();

        assertNotNull(hash, "Password hash should never be null");
        assertFalse(hash.isBlank(), "Password hash should not be empty");
    }

    @Test
    void testHashesDifferForSameRawPassword() {
        User u1 = new User();
        User u2 = new User();

        u1.setPassword(RAW);
        u2.setPassword(RAW);

        assertNotEquals(u1.getPasswordHash(), u2.getPasswordHash(),
                "Hashes must differ due to unique salts");
    }

    @Test
    void testCheckPasswordSucceeds() {
        user.setPassword(RAW);
        assertTrue(user.checkPassword(RAW),
                "checkPassword should return true for the correct password");
    }

    @Test
    void testCheckPasswordFails() {
        user.setPassword(RAW);
        assertFalse(user.checkPassword("WrongPass"),
                "checkPassword should return false for an incorrect password");
    }

    @Test
    void testSettingNullPasswordThrows() {
        assertThrows(NullPointerException.class, () -> user.setPassword(null),
                "Passing null to setPassword should throw");
    }
}
