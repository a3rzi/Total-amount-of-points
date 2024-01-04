package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Given
//Our team's match results are recorded in a collection of strings.
// Each match is represented by a string in the format "x:y"
// where x is our team's score and y is our opponents score.
        //Notes:
        //our team always plays 10 matches in the championship //so we use Array
        //String[] matchResults = {"3:1", "2:2", "0:1", "4:2", "1:0", "0:0", "2:1", "3:3", "1:2", "4:0"};

        //get user input
        String[] matchResults = new String[10];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<10; i++){
            System.out.println("Enter result for match " + (i+1) + ", our team score is: ");
            String ourScore=input.nextLine();

            System.out.println("Enter opponent's score: ");
            String opponentScore = input.nextLine();

            matchResults[i]=ourScore+ ":" + opponentScore;
        }

        //When
        //We need to write a function that takes this collection
        // and returns the number of points our team (x) got in the championship.

        int totalPoints = calculatePoints(matchResults);
        System.out.println("Total points: " + totalPoints);
    }

    private static int calculatePoints(String[] matchResults) {
        int totalPoints = 0;
        //step1: separate ourScore and opponentScore
        for (String results : matchResults) {
            String[] score = results.split(":");
            int ourScore = Integer.parseInt( score[0]);
            int opponentScore = Integer.parseInt( score[1]);

            //step2:Points are awarded for each match as follows:
            //if x > y: 3 points (win)
            //if x < y: 0 points (loss)
            //if x = y: 1 point (tie)
            if (ourScore>opponentScore){
                totalPoints+=3; //win
            }
             else if (ourScore==opponentScore){
                totalPoints+=1; //draw
            }
             else {
                 totalPoints+=0; //loss
            }
        }
        return totalPoints;
    }
}