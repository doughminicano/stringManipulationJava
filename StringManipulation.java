public class StringManipulation {
    public void print() {
        System.out.println("String Man");

    }

    public String trimAndConcat(String a, String b) {
        return a.trim() + b.trim();
    }

    public Integer getIndexorNull(String word, char letter) {

        return word.indexOf(letter);
    }

    public Integer getIndexorNull2(String str1, String substring) {
        return str1.indexOf(substring);
    }

    public String concatSubstring(String str1, int num1, int num2, String str2) {

        return str1.substring(num1, num2) + str2;
    }
    
}