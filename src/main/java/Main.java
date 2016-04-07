import org.deeplearning4j.text.sentenceiterator.SentenceIterator;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // Steps
        // 1. Load data (as "sentences") & 2. Preprocess data
        // Note: Sentences = blocks of text, not necessarily actual sentences
        String pathToCorpus = "/mockData.txt";
        SentenceLoader sl = new SentenceLoader(pathToCorpus);
        SentenceIterator iterator = sl.loadSentences();

        // 3. Tokenise data
        // 4. Train the model
        // 5. Evaluate the model
        // 6. Visualise model
        // 7. Saving, reloading and using the model

    }

}
