package com.rizal.mekaritest;

import com.rizal.mekaritest.service.ReciteService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Glasnost Team on 13/04/22.
 */
@ExtendWith(MockitoExtension.class)
public class ReciteServiceTest {

    @InjectMocks
    private ReciteService reciteService;

    @Test
    void testReadLyric(){
        Assertions.assertEquals("the house that Jack built", reciteService.doReadLyric(1));
        Assertions.assertEquals("the malt that lay in the house that Jack built", reciteService.doReadLyric(2));
        Assertions.assertEquals("the horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt that lay in the house that Jack built", reciteService.doReadLyric(12));
    }

    @Test
    void testReadLyricWithRandomReciter(){
        Assertions.assertNotNull(reciteService.doReadLyricWithRandomIndex(1));
        Assertions.assertNotNull(reciteService.doReadLyricWithRandomIndex(3));
        Assertions.assertNotNull(reciteService.doReadLyricWithRandomIndex(6));
    }

}
