/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author Sahil
 * 
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Choose your favourite Genre from the following list:");
        String[] genres = {"Comedy", "Drama", "Horror", "Action"};
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }
        
        int genreChoice = scanner.nextInt();
        String favoriteGenre = genres[genreChoice - 1];

        
        System.out.println("Your user profile was created!");

        scanner.close();
    }
}

