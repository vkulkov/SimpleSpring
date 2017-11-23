package com.springinaction.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class BraveKnightTest {
    @Test
    public void KnightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(Quest.class);

        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();

        verify(mockQuest, times(1));
    }
}
