package Authorization;

public class Authorization {
    public static boolean validation (String login, String password, String confirmPassword) {
        try {

            if (login.length() > 20){
                throw new WrongLoginException("The login has to be less than 5 values...");
            }
            if (login.contains(" ")){
                throw new WrongLoginException("The login doesn't have to contain space ");

            }

            if (password.length() > 20 ){
                throw new WrongLoginException("The password has to be less than 20 symbols ");
            }
            if (password.contains(" ")) {
                throw new WrongPasswordException("The password doesn't have to contain space ");
            }

            if (!password.equals(confirmPassword)){
                throw new WrongPasswordException("Password and Confirm Password don't match ");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Error: " + e.getMessage()); //
            return false;
        }
        return true;
    }
}
