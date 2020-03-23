package warmup;

public class ShoesApp {

    public int calc(String origin) {
        int depth = 0;
        int max = 0;
        for (int i = 0; i < origin.length(); i++) {
            switch (origin.charAt(i)) {
                case 'R': depth++; break;
                case 'L': depth--; break;
            }
            max = Math.max(depth, max);
        }
        return max;
    }

}