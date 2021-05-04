package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedHaspMapTest {
    private Assertions Assert;

    @Test
    public void givenSentenceWhenWords_AreAddedToListShouldReturnWordFrequency(){
        String sentence="Paranoids are not paranoid because they are paranoid but" +
                "because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHaspMap<String,Integer> myLinkedHashMap=new MyLinkedHaspMap<>();
        String[] words=sentence.toLowerCase().split(" ");
        for (String word: words){
            Integer value = myLinkedHashMap.get(word);
            if(value==null) {
                value=1;
            }
            else {
                value=value+1;
            }
            myLinkedHashMap.add(word,value);
        }
        int frequency = myLinkedHashMap.get("paranoid");
        System.out.println(myLinkedHashMap);
        Assert.assertEquals(3,frequency);
    }

}
