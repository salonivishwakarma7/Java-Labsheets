public class WordCounter {
    static String language = "English";

    void countWords(String sentence) {
        String trimmedSentence = sentence.trim();
        int wordCount;

        if (trimmedSentence.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = trimmedSentence.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Language: " + language);
        System.out.println("Sentence: " + sentence);
        System.out.println("Number of Words: " + wordCount);
    }

    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";

        WordCounter counter = new WordCounter();
        counter.countWords(sentence);
    }
}
