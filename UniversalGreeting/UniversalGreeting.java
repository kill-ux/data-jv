public class UniversalGreeting {
    public static String greeting(String message) {
        return switch (message) {
            case "FR" -> "Bonjour comment allez-vous?";
            case "EN" -> "Hello, How are you?";
            case "ES" -> "Hola, cómo estás?";
            default -> "";
        };
    }
}