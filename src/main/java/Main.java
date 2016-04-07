import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        // Steps
        // 1. Load data (sentences)
        String pathToCorpus = "./../res/corpus.txt";
        SentenceLoader sl = new SentenceLoader(pathToCorpus);
        sl.loadSentences();

        // 2. Preprocess data
        // 3. Tokenise data
        // 4. Train the model
        // 5. Evaluate the model
        // 6. Visualise model
        // 7. Saving, reloading and using the model

    }

}
