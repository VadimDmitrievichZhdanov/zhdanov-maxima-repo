package arrays;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        char z = word[word.length - 1];
        char y = post[post.length - 1];
        boolean result;
        result = z == y;
            return result;
        }
    }

