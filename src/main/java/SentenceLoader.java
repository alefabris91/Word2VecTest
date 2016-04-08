import org.deeplearning4j.text.sentenceiterator.LineSentenceIterator;
import org.deeplearning4j.text.sentenceiterator.SentenceIterator;
import org.deeplearning4j.text.sentenceiterator.SentencePreProcessor;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.LinkedList;

public class SentenceLoader {
    private String pathToFile;

    public SentenceLoader(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public SentenceIterator loadSentences() throws IOException, URISyntaxException {
        LinkedList<String> sentences = new LinkedList<>();

        File file = new File( this.getClass().getResource( pathToFile ).toURI() );
        SentenceIterator iterator = new LineSentenceIterator(file);

        // Pre-processing - converts sentences to all lower case
        iterator.setPreProcessor((SentencePreProcessor) sentence -> sentence.toLowerCase());

        while (iterator.hasNext()) {
            sentences.add(iterator.nextSentence());
        }

        return iterator;
    }

}
