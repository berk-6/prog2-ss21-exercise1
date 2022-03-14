public class Uebung1 {

    static boolean checkPasswordLength(String password){
        return (password.length() >= 8 && password.length() <= 25);
    }
    static boolean checkUpperAndLowerCases(String password){
        for (int i = 0; i < password.length(); i++)
            if (Character.isUpperCase(password.charAt(i)) || Character.isLowerCase(password.charAt(i))) return true;
        return false;
    }
    static boolean hasDigit(String password){
        for (int i = 0; i < password.length(); i++)
            if (Character.isDigit(password.charAt(i)))
                return true;
        return false;
    }

    static boolean hasSymbol(String password) {
        return password.matches(".*[()#$?!%/@].*");
    }

    static boolean continuousNumbers(String password) {
        return !password.matches(".*(123|234|345|456|567|678|789).*");
    }

    static boolean sameNumbersInARow(String password) {
        return !password.matches(".*(1111|2222|3333|4444|5555|6666|7777|8888|9999|0000).*");
    }
}
