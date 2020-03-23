package warmup;

public class StringOps {

    // abc -> ABC
    // aBc -> AbC
    // Abc -> aBC
    String invertCase(String origin) {
        throw new RuntimeException("should be implemented");
    }

    // abc -> ABC
    // aBc -> ABC
    // Abc -> ABC
    String toUpperCase(String origin) { // a -> A A -> A
        throw new RuntimeException("should be implemented");
    }

    // abc -> abc
    // aBc -> abc
    // Abc -> abc
    String toLowerCase(String origin) { // A -> a a -> a
        int total=0;
        for (int i = 0; i < origin.length() ; i++) {
             total=total+(int)origin.charAt(i);
        }
       // if (total<200)
        return null;
    }

}
