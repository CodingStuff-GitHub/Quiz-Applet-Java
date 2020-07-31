package com.java.GQuiz;


class RandomQuestionGenerator {
    private String[] Question = new String[20];
    private String[] Answer = new String[20];

    String getQuestion(int x) {
        //PlaceHolders for Questions
        Question[0] = "What is the largest gland?     A)Liver       B)Stomach       C)Lungs      D)Heart";
        Question[1] = "How many days are there in a year?      A)233       B)365       C)429      D)332";
        Question[2] = "How many colours are there in a rainbow?     A)3       B)2       C)7      D)5";
        Question[3] = "Which animal is known as the ‘Ship of the Desert?     A)Lion       B)Hippo       C)Snake      D)Camel";
        Question[4] = "How many letters are there in the English alphabet?      A)26       B)25       C)27      D)28";
        Question[5] = "How many consonants are there in the English alphabet?     A)29      B)21       C)62      D)53";
        Question[6] = "How many sides are there in a triangle?      A)5       B)4      C)3      D)10";
        Question[7] = "In which direction does the sun rise?      A)South       B)North       C)West      D)East";
        Question[8] = "What do you call a type of shape that has five sides?      A)Pentagon       B)8       C)9      D)10";
        Question[9] = "Which month of the year has the least number of days?      A)January       B)February       C)July      D)August";
        Question[10] = "Which is the largest flower in the world?      A)Lotus       B)Anemone       C)Rafflesia      D)Oriental Poppy";
        Question[11] = "Name the currency used in Japan?      A)Taka       B)Dinar       C)Ngultrunm      D)Yen";
        Question[12] = "How many zeros are there in one hundred thousand?      A)3       B)5       C)7      D)2";
        Question[13] = "How many hours are there in two days?      A)58       B)48       C)96      D)150";
        Question[14] = "How many months of the year have 31 days?      A)7       B)5       C)6      D)12";
        Question[15] = "How many weeks are there in one year?      A)50       B)51       C)53      D)52";
        Question[16] = "In which country is the Leaning Tower of Pisa located?      A)Italy       B)France       C)Spain      D)England";
        Question[17] = "Which animal is called King of Jungle?      A)Cat       B)Lion       C)Tiger      D)Elephant";
        Question[18] = "How many bones does an adult human have?     A)207       B)300       C)206      D)209";
        Question[19] = "Who was the second man to walk on the moon?     A)Neil Armstrong       B)Yuri Gagarin      C)Michael Collins      D)Edwin Buzz Aldrin";
        return Question[x];
    }

    int getCorrectAnswer(int x) {
        int[] answers = new int[]{0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3};      //correct answer array index
        return answers[x];
    }

    String getAnswer(int x) {
        String[] answers = new String[]{"Liver", "365", "7", "Camel", "26", "21", "3", "East", "Pentagon", "February", "Rafflesia", "Yen", "3", "48", "6", "52", "Italy", "Lion", "206", "Edwin Buzz Adrin"};
        return answers[x];
    }
}
