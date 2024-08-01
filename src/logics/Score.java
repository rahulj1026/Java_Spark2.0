package logics;

import java.util.Scanner;

class CricketPlayer {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;

    public CricketPlayer(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }

    public double calculateAverage() {
        if (inningsPlayed - notOutTimes > 0) {
            return (double) totalRuns / (inningsPlayed - notOutTimes);
        } else {
            return 0.0; // to handle division by zero case
        }
    }

    public void displayDetails() {
        System.out.println("Player ID: " + pid);
        System.out.println("Player Name: " + pname);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Innings Played: " + inningsPlayed);
        System.out.println("Not Out Times: " + notOutTimes);
        System.out.println("Average Runs: " + calculateAverage());
        System.out.println();
    }
}

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        CricketPlayer[] players = new CricketPlayer[n];

        // Input details for each player
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");
            System.out.print("Player ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Player Name: ");
            String pname = scanner.nextLine();
            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();
            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();
            System.out.print("Not Out Times: ");
            int notOutTimes = scanner.nextInt();

            players[i] = new CricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }

        // Calculate average of all players
        double totalAverage = 0.0;
        double maxAverage = Double.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < n; i++) {
            double average = players[i].calculateAverage();
            totalAverage += average;

            if (average > maxAverage) {
                maxAverage = average;
                maxIndex = i;
            }
        }

        // Display average of all players
        System.out.println("\nAverage Runs of all players: " + (totalAverage / n));

        // Display details of player with maximum average
        if (maxIndex != -1) {
            System.out.println("\nDetails of player with maximum average:");
            players[maxIndex].displayDetails();
        } else {
            System.out.println("No players found.");
        }

        scanner.close();
    }
}
