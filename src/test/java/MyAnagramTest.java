import org.example.Anagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyAnagramTest {

    @Test
    void returnWord(){
        Anagram anagram = new Anagram();
        assertEquals(true, anagram.anagramFinder("ealp"));
    }

}
