public class Person {
    public boolean checkUser(String user) {
        // At least 8 characters, no special characters
        if (user == null || user.length() < 8) return false;
        // Only letters and numbers
        return user.matches("^[A-Za-z0-9]+$");
    }

    public boolean checkPassword(String password) {
        if (password == null || password.length() < 8) return false;
        // At least one uppercase
        if (!password.matches(".*[A-Z].*")) return false;
        // At least one number
        if (!password.matches(".*[0-9].*")) return false;
        // At least one special character
        if (!password.matches(".*[^A-Za-z0-9].*")) return false;
        return true;
    }
}
