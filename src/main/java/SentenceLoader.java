import org.deeplearning4j.text.sentenceiterator.LineSentenceIterator;
import org.deeplearning4j.text.sentenceiterator.SentenceIterator;
import org.deeplearning4j.text.sentenceiterator.SentencePreProcessor;
import org.nd4j.linalg.io.ClassPathResource;

import java.io.IOException;
import java.util.LinkedList;

public class SentenceLoader
{
    private String pathToFile;

    public SentenceLoader(String pathToFile)
    {
        this.pathToFile = pathToFile;
    }

    public LinkedList<String> loadSentences() throws IOException {
        LinkedList<String> sentences = new LinkedList<>();

        ClassPathResource resource = new ClassPathResource(pathToFile);
        SentenceIterator iterator = new LineSentenceIterator(resource.getFile());

        // Pre-processing - converts sentences to all lower case
        iterator.setPreProcessor((SentencePreProcessor) sentence -> sentence.toLowerCase());

        return sentences;
    }

}
