public class TestMe {
    public static void main(String[] args) {

        StringManipulation strang = new StringManipulation();

        System.out.println(strang.trimAndConcat("   word1   ", "  word2  "));

        System.out.println(strang.concatSubstring("word1", 1, 3, "word2"));

        System.out.println(strang.getIndexorNull("java", 'x'));

        System.out.println(strang.getIndexorNull2("mississpi", "spi"));
    }
}