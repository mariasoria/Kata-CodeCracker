public class CodeCracker {
    public static String alphabet = "abcdefghijklmnopqrstuvwyyz";
    public static String key = "!)\"(£*%&><@abcdefghijklmno";

    public static String cracker (String message){
        String messageDecrypted = "";

        for (int i = 0; i < message.length(); i++) {
            int index = key.indexOf(message.charAt(i));
            messageDecrypted += alphabet.charAt(index);
        }
        return messageDecrypted;
    }

    public static String encryptor (String message) {
        String messageEncrypted = "";

        for (int i = 0; i < message.length(); i++) {
            int index = alphabet.indexOf(message.charAt(i));
            messageEncrypted += key.charAt(index);
        }
        return messageEncrypted;
    }
}
