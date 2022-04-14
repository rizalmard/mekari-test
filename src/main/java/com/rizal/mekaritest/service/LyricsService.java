package com.rizal.mekaritest.service;

import com.rizal.mekaritest.data.LyricsData;

import java.util.ArrayList;


public class LyricsService {

    public LyricsData setDataLyric(){
        ArrayList<String> data = new ArrayList<>();
        data.add("the horse and the hound and the horn that belonged to");
        data.add("the farmer sowing his corn that kept");
        data.add("the rooster that crowed in the morn that woke");
        data.add("the priest all shaven and shorn that married");
        data.add("the man all tattered and torn that kissed");
        data.add("the maiden all forlorn that milked");
        data.add("the cow with the crumpled horn that tossed");
        data.add("the dog that worried");
        data.add("the cat that killed");
        data.add("the rat that ate");
        data.add("the malt that lay in");
        data.add("the house that Jack built");
        LyricsData lyricsData = new LyricsData();
        lyricsData.setSentence(data);
        return lyricsData;
    }
}
