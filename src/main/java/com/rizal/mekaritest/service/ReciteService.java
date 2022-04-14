package com.rizal.mekaritest.service;

import com.rizal.mekaritest.data.LyricsData;

import java.util.ArrayList;

public class ReciteService {

    LyricsService lyricsService = new LyricsService();

    Util util = new Util();

    public String doReadLyric(int valueSentence){
        LyricsData lyricsData = lyricsService.setDataLyric();
        String result = "";
        for (int i = valueSentence; i > 0; i--) {
            if (i == 1){
                result = result + lyricsData.getSentence().get(lyricsData.getSentence().size() - i);
            } else {
                result = result + lyricsData.getSentence().get(lyricsData.getSentence().size() - i) +" ";
            }
        }
        System.out.println(result);
        return result;
    }

    public String doReadLyricWithRandomIndex(int totalSentence){
        LyricsData lyricsData = lyricsService.setDataLyric();
        ArrayList<Integer> valueIndex = util.getRandomIndex(totalSentence);
        String result = "";
        for (int i = 0; i < valueIndex.size(); i++) {
            if (valueIndex.size() == 0){
                result = result + lyricsData.getSentence().get(valueIndex.get(i));
            } else {
                result = result + lyricsData.getSentence().get(valueIndex.get(i) -1) +" ";
            }
        }
        System.out.println(result);
        return result;
    }
}
