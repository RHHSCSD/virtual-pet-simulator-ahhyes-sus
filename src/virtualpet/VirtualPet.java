/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;

import java.util.*;
import java.io.*;
import java.lang.Exception;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author michael.roy-diclemen
 */
/**
 * @param args the command line arguments
 */
public class VirtualPet {
    public static void createFile(String user) {
        Scanner scanner = new Scanner(System.in);
        File saveData = new File(user + ".txt");
    }
    public static void savingData(File saveData, String user, String password, int petNum, int MAX_HEALTH, int health, int doubloons) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(saveData);
        if (saveData.exists()) {    
            pw.println(user);
            pw.println(password);
            pw.println(petNum);
            pw.println(MAX_HEALTH);
            pw.println(health);
            pw.println(doubloons);
        } else {
            System.out.println("👺");
        }
    }
    public static void MainMenu(int touched) {
        if (touched == 0) {
            System.out.println("1. Start");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            System.out.print("Enter: ");
            touched++;
        } else {
            System.out.println("1. Play / Interact");
            System.out.println("2. Instructions");
            System.out.println("3. Exit");
            System.out.print("Enter: ");
        }
    }
    /* -------------------------------------------------------------------------
                              New USER LOG IN
    --------------------------------------------------------------------------*/
    public static void newUserLogIn() {
        Scanner scanner = new Scanner(System.in);
        final String userFinal = "snoopy";
        final String passwordFinal = "toto";
        //String user = "ab";
        String password = "ab";
        boolean leaveCode = false;
        int pass = 0;
        System.out.print("Enter user: ");
        while (pass < 3){
        String user = scanner.nextLine();
        if (user.compareToIgnoreCase(userFinal) < 0) {
            System.out.println("WRONG");
            pass += 1;
            leaveCode = true;
        } else if(user.compareToIgnoreCase(userFinal) == 0) {
            System.out.println("CORRECT");
            pass = 3;
            leaveCode = false;
        }
        }
        if (leaveCode == true) {
            System.out.println("FATALITY");
            scanner.close();
            System.exit(0);
        }
        System.out.print("Enter password: ");
        pass = 0;
        while (pass < 3){
        password = scanner.nextLine();
        if (password.compareToIgnoreCase(passwordFinal) < 0) {
            System.out.println("WRONG");
            pass += 1;
            leaveCode = true;
        } else if(password.compareToIgnoreCase(passwordFinal) == 0) {
            System.out.println("CORRECT");
            pass = 3;
            leaveCode = false;
        }
        }
        if (leaveCode == true) {
            System.out.println("FATALITY");
            scanner.close();
            System.exit(0);
        }
        scanner.close();
    }
    /* -------------------------------------------------------------------------
                        Returning User Log In
    --------------------------------------------------------------------------*/
    public static void userLogIn(File saveData) {
        if (saveData.exists()) {
            System.out.print("Enter user");
            
        }
    }  
    /* -------------------------------------------------------------------------
                        PET DECIDER / MAIN MENU CONT.
    --------------------------------------------------------------------------*/
    public static void Decider(int input) {
        Scanner scanner = new Scanner(System.in);
        if (input == 1) {
            System.out.println("What animal would you like to choose? :(1)monkey, (2)rabbit, (3)dolphin or (4)fish");
            int decision = scanner.nextInt();
            scanner.nextLine();
            if (decision == 1) {
                System.out.println("Monkey is yours");
            } else if (decision == 2) {
                System.out.println("Rabbit is yours");
            } else if (decision == 3) {
                System.out.println("Dolphin is yours");
            } else if (decision == 4) {
                System.out.println("Fish is yours");
            } else {
                System.out.println("Unlucky");
                System.exit(0);
            }
        } else if (input == 2) {
            System.out.println("You press start and choose an animal.");
        } else {
            System.exit(0);
        }
        scanner.close();
    }
    /* -------------------------------------------------------------------------
                        IDK
    --------------------------------------------------------------------------*/
    public static int ContinueDecider(int input) {
        if (input == 2) {
            System.out.println("YAP YAP YAP");
        } else if (input == 3) {
            System.exit(0);
        } else {
            return 1;
        }
        return 1;
    }
    /* -------------------------------------------------------------------------
                                GENERATE NAME
    --------------------------------------------------------------------------*/
    public static void GenerateName() {
        Random random = new Random();
        String petName = " ";
        int nameLength = 0;
        final int MAX_NAME = 4;
        final int MIN_NAME = 4;
        final String vowelCharacters = "aeiou";
        final String consonateCharacters = "bcdfghjklmnpqrstvwxyz";
        char letter = 'a';
        int doubleLetter;
        nameLength = random.nextInt(MAX_NAME) + MIN_NAME;
                for (int i = 0; i < nameLength; i++) {
                    if (i % 2 == 0) {        
                    letter = consonateCharacters.charAt(random.nextInt(20));
                            //System.out.print(letter);
                            petName += letter;
                    } else if (i % 2 == 1) {
                            letter = vowelCharacters.charAt(random.nextInt(4));
                            //System.out.print(letter);
                            petName += letter;
                    }
                    doubleLetter = random.nextInt(2) + 1;
                    switch (doubleLetter) {
                        case 1:
                            petName += letter;
                            break;
                        case 2:
                            break;
                    }
    
                }
                System.out.println("Your pet, named " + petName + ", has been born!");
    }
    /* -------------------------------------------------------------------------
                                    WRITE NAME
    --------------------------------------------------------------------------*/
    public static void WriteName() {
        Scanner scanner = new Scanner(System.in);
        String petName = " ";
        System.out.print("Enter Pet Name: ");
        petName = scanner.nextLine();
        System.out.println("Your pet, named " + petName + ", has been born!");
        scanner.close();
    }
    /* -------------------------------------------------------------------------
                                RANDOM NUMBER GAME
    --------------------------------------------------------------------------*/
    public static void NumberGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guessing Game (1 - 100)");
                int computerNumber = random.nextInt(100) + 1;
                int yourNumber = 0;
                while (computerNumber != yourNumber) {
                    System.out.print("Enter: ");
                    yourNumber = scanner.nextInt();
                    if (computerNumber > yourNumber) {
                        System.out.println("Higher");
                    } else if (computerNumber < yourNumber) {
                        System.out.println("Lower");
                    }
                }
                System.out.println("Congratuations!");
    }
    public static void MemoryGame() {
        System.out.print("hi");
    }
    public static void GenerateStats() {
        Random random = new Random();
        int LIMIT = random.nextInt(20) + 10;
        System.out.println(LIMIT + " starting points are randomly dlivided");
        int MAX_STAT = LIMIT;
        final int MIN_STAT = 1;
        int MAX_HEALTH = random.nextInt(MAX_STAT) + MIN_STAT;
        MAX_STAT -= MAX_HEALTH;
        int MAX_HUNGER = random.nextInt(MAX_STAT) + MIN_STAT;
        MAX_STAT -= MAX_HUNGER;
        int MAX_ENERGY = MAX_STAT;
        System.out.println("Health: " + MAX_HEALTH + "\nHunger: " + MAX_HUNGER + "\nEnergy: " + MAX_ENERGY);
        final int petStatSum = MAX_HEALTH + MAX_HUNGER + MAX_ENERGY;
        if (petStatSum < 10) {
            System.out.println("Yout pet is going to die tomorrow. . .");
        } else if (petStatSum > 27) {
            System.out.println("Your pet is the second-coming of god!");
        } else {
            System.out.println("Congratulations on your pet!");
        }
    }
    public static void PlayingPet(int energy, int MAX_ENERGY, int doubloons) {
        if (doubloons <= 0) {
            System.out.println("You have no money");
        } else {
            System.out.println("You gave your pet a toy");
        if (energy < MAX_ENERGY) {
            energy++;
            doubloons--;
        } else {
            System.out.println("Pet is already max");
        }
        }  
    }
    public static void FeedingPet(int hunger, int MAX_HUNGER, int doubloons) {
        if (doubloons <= 0) {
            System.out.println("You have no money");
        } else {
            System.out.println("You gave your pet some food");
        if (hunger< MAX_HUNGER) {
            hunger++;
            doubloons--;
        } else {
            System.out.println("Pet is already max");
        }
        } 
    }
    public static void GroomingPet(int health, int MAX_HEALTH, int doubloons) {
        if (doubloons <= 0) {
            System.out.println("You have no money");
        } else {
            System.out.println("You are cool");
        if (health < MAX_HEALTH) {
            health++;
            doubloons--;
        } else {
            System.out.println("Pet is already max");
        }
        } 
    }
    public static void main(String[] args) {

        /* ---------------------------------------------------------------------
                                        Part 1
         ---------------------------------------------------------------------*/
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        MainMenu(0);
        int input = scanner.nextInt();
        if (saveData.exists()) {
            userLogIn();
        } else {
        newUserLogIn();
        }
        /* ---------------------------------------------------------------------
                                        Part 2
         ---------------------------------------------------------------------*/
        Decider(input);
        /* ---------------------------------------------------------------------
                                        Part 3
         ---------------------------------------------------------------------*/
        /* ---------------------------------------------------------------------
                                        Part 4
         ---------------------------------------------------------------------*/
        System.out.println("Would you like to [1]type a name or [2]generate a name?");
        System.out.print("Enter: ");
        int nameDecision = scanner.nextInt();
        scanner.nextLine();
        String petName = " ";
        switch (nameDecision) {
            case 1: // Write Name
                WriteName();
                break;
            case 2: // Generate Name
                GenerateName();
                break;
        }

        /* ---------------------------------------------------------------------
                                        Part 5
         ---------------------------------------------------------------------*/
        GenerateStats();
        MainMenu(1);
        input = scanner.nextInt();
        ContinueDecider(input);
        /* ---------------------------------------------------------------------
                                        Part 6
         ---------------------------------------------------------------------*/
        int doubloons = 0;
        boolean gameTrigger = true;
        System.out.println("Current balance = " + doubloons);
        System.out.println("What game would you like to play? [1]Guessing Game or [2]Memory Game: ");
        while (gameTrigger) {
            System.out.print("Enter Game: ");
            int gameDecision = scanner.nextInt();   
            scanner.nextLine();
        switch (gameDecision) {
            case 1:
                // Rand Num Game
                NumberGame();
                doubloons += 1;
                System.out.print("You have earned " + doubloons);
                break;
            case 2:
                // Memory Game
                MemoryGame();
                doubloons += 3;
                System.out.println("You have earned " + doubloons);
                break;
            case 3:
                gameTrigger = false;
                break;
            default:
                System.out.println("Current balance = " + doubloons);
                break;
        }
        }
    }
}
