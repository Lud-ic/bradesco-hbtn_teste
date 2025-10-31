public class Person {
    public boolean checkUser(String user) {
        if (user == null || user.length() < 8) return false;
        return user.matches("^[A-Za-z0-9]+$");
    }

    public boolean checkPassword(String password) {
        if (password == null || password.length() < 8) return false;
        if (!password.matches(".*[A-Z].*")) return false;
        if (!password.matches(".*[0-9].*")) return false;
        if (!password.matches(".*[^A-Za-z0-9].*")) return false;
        return true;
    }
}
