public class CaesarCipher {
    public String encode(String input, char offset) {
        StringBuilder result = new StringBuilder();
        int shift = offset - 'A';  // Calculate the shift amount based on the offset character

        for (char ch : input.toUpperCase().toCharArray()) {
            if (Character.isUpperCase(ch)) {
                char encodedChar = (char) ('A' + (ch - 'A' + shift) % 26);
                result.append(encodedChar);
            } else {
                result.append(ch); // Non-uppercase characters are appended as-is
            }
        }
        return result.toString();
    }
}
