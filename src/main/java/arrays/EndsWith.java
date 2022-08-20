package arrays;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        char z1 = word[word.length - 1];
        char y1 = post[post.length - 1];
        char z2 = word[word.length - 2];
        char y2 = post[post.length - 2];
        char z3 = word[word.length - 3];
        char y3 = post[post.length - 3];
        boolean result;
        result = z1 == y1 & z2 == y2 & z3 == y3;
            return result;
        }
    }

