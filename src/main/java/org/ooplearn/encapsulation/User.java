package org.ooplearn.encapsulation;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class User {

    private Integer id;
    private String name;

    // New fields to hold salt and hashed password
    private String salt;
    private String passwordHash;

    // Generate a secure random salt
    private static String generateSalt() {
        try {
            SecureRandom sr = SecureRandom.getInstanceStrong();
            byte[] saltBytes = new byte[16];
            sr.nextBytes(saltBytes);
            return Base64.getEncoder().encodeToString(saltBytes);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Secure RNG not available", e);
        }
    }

    // Compute SHA-256 hash of salt + password
    private static String hashWithSHA256(String password, String salt) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt.getBytes());
            byte[] digest = md.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(digest);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 not supported", e);
        }
    }

    // GETTERS AND SETTERS FOR id AND name

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // SETTER FOR raw password, generates salt + hash
    public void setPassword(String rawPassword) {
        this.salt = generateSalt();
        this.passwordHash = hashWithSHA256(rawPassword, this.salt);
    }

    // VERIFY LOGIN ATTEMPT
    public boolean checkPassword(String attempt) {
        String attemptHash = hashWithSHA256(attempt, this.salt);
        return attemptHash.equals(this.passwordHash);
    }

    // OPTIONAL: expose only the hash, never the raw password
    public String getPasswordHash() {
        return passwordHash;
    }
}
