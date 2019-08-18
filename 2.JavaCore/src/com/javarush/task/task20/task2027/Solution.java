package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        List<Word> wordList = detectAllWords(crossword, "home", "same");
        for (Word word : wordList) {
            System.out.println(word.toString());
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        ArrayList<Word> list = new ArrayList<>();

        for (String word : words){
            for (int i = 0; i < crossword.length; i++) {
                for (int j = 0; j < crossword[i].length; j++) {
                    if (word.charAt(0) == crossword[i][j]) {
                        findWord(crossword, word, i, j, list);
                    }
                }
            }
        }

        return list;
    }

    public static void findWord(int[][] crossword, String word, int i, int j, ArrayList<Word> list) {
        int[][] ways = new int[][] {
                {0, 1},
                {1, 1},
                {1, 0},
                {1, -1},
                {0, -1},
                {-1, -1},
                {-1, 0},
                {-1, 1},
        };
        for (int direction = 0; direction < ways.length; direction++) {
            int tmpI = i;
            int tmpJ = j;
            int wordPos = 1;
            while (wordPos < word.length()) {
                tmpI += ways[direction][0];
                tmpJ += ways[direction][1];
                if (tmpI < 0 || tmpI >= crossword.length || tmpJ < 0 || tmpJ >= crossword[tmpI].length)
                    break;
                if (word.charAt(wordPos) != crossword[tmpI][tmpJ])
                    break;
                else if (wordPos == word.length() - 1) {
                    Word currentWord = new Word(word);
                    currentWord.setStartPoint(j, i);
                    currentWord.setEndPoint(tmpJ, tmpI);
                    list.add(currentWord);
                    break;
                }
                wordPos++;
            }
        }
    }


    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
