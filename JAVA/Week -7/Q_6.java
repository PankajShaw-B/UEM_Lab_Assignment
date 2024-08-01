public class Q_6 { private int totalCount; public Q_6() {
    totalCount = 0;
    }
    public void processCharacter(char ch) throws NonAlphabeticCharacterException { if (Character.isLetter(ch)) {
    totalCount++;
    } else {
    throw new NonAlphabeticCharacterException("Non-alphabetic character encountered: " + ch);
    }  }
    public int getTotalCount() { return totalCount;
    }
    public static void main(String[] args) { Q_6 counter = new Q_6();
    String input = "abc123def456ghi"; for (char ch : input.toCharArray()) {
    try {
    counter.processCharacter(ch);
    } catch (NonAlphabeticCharacterException e) { System.out.println(e.getMessage());
    }	}
    System.out.println("Total alphabetic characters: " + counter.getTotalCount());
    }}
    class NonAlphabeticCharacterException extends Exception { public NonAlphabeticCharacterException(String message) {
    super(message);
    }}
    