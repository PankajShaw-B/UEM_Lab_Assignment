public class q11 {
    public static void main(String[] args) { String str1 = "Hello, World!";
    String str2 = "Hello, World!"; long startTime, endTime; startTime = System.nanoTime();
    boolean isEqual1 = str1.equals(str2); endTime = System.nanoTime();
    System.out.println("Using equals() method: " + isEqual1 + ", Time taken: " + (endTime - startTime) + " nanoseconds");
    startTime = System.nanoTime();
    int compareResult = str1.compareTo(str2); boolean isEqual2 = compareResult == 0; endTime = System.nanoTime();
    System.out.println("Using compareTo() method: " + isEqual2 + ", Time taken: " + (endTime - startTime) + " nanoseconds");
    startTime = System.nanoTime();
    boolean isEqual3 = str1.contentEquals(str2); endTime = System.nanoTime();
    System.out.println("Using contentEquals() method: " + isEqual3 + ", Time taken: " + (endTime - startTime) + " nanoseconds");
    startTime = System.nanoTime();
    
    boolean isEqual4 = compareCharacters(str1, str2); endTime = System.nanoTime();
    System.out.println("Comparing characters one by one: " + isEqual4 + ", Time taken: " + (endTime - startTime) + " nanoseconds");
    startTime = System.nanoTime();
    
    boolean isEqual5 = str1.length() == str2.length() && str1.equals(str2); endTime = System.nanoTime();
    System.out.println("Comparing lengths first: " + isEqual5 + ", Time taken: " + (endTime - startTime) + " nanoseconds");
    }
    public static boolean compareCharacters(String str1, String str2) { if (str1.length() != str2.length()) {
    return false;
    }
    for (int i = 0; i < str1.length(); i++) {
    if (str1.charAt(i) != str2.charAt(i)) { return false;
    }
    }
    return true;
    }
    }
    