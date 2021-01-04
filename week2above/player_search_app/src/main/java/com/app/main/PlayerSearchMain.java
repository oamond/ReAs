package com.app.main;

import java.util.List;
import java.util.Scanner;

import com.app.exception.BusinessException;
import com.app.model.Player;
import com.app.service.PlayerSearchService;
import com.app.service.impl.PlayerSearchServiceImpl;

public class PlayerSearchMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to PlayerSearch app V1.0");
		System.out.println("-----------------------------------");
		int ch = 0;
		PlayerSearchService playerSearchService = new PlayerSearchServiceImpl();
		
		do {
			System.out.println("PLAYER SEARCH MENU");
			System.out.println("==================");
			System.out.println("1) By Id");
			System.out.println("2) By Contact Number");
			System.out.println("3) By Age");
			System.out.println("4) By Gender");
			System.out.println("5) By TeamName");
			System.out.println("6) By Dob");
			System.out.println("7) By Player Name");
			System.out.println("8) Show All Players");
			System.out.println("9) Exit");
			System.out.println("Please enter appropriate choice between 1-9");
			
			;try {
				ch = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
			switch (ch) {
			case 1:
				System.out.println("case 1 was selected");
				System.out.println("Enter Player Id to get Player details....");
				try {
					int id = Integer.parseInt(sc.nextLine());
					//code to service 
					Player player = playerSearchService.getPlayerById(id);
					if(player != null) {
						System.out.println("Player found with id : "+id+" details of the player is : ");
						System.out.println(player);
					}
				} catch (NumberFormatException e) {
					System.out.println("Player Id cannot be special characters or symbols of white space, it is a numeric value. ");
					
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
				
				
				break;
			case 2:
				System.out.println("case 2 was selected");
				System.out.println("Thank you for your interest this option is still under construction");
				
				break;
			case 3:
				System.out.println("case 3 was selected");
				System.out.println("Enter Player Age to get all the players matching with that age");
				int age = Integer.parseInt(sc.nextLine());
				try {
					List<Player> agePlayersList = playerSearchService.getPlayersByAge(age);
					if(agePlayersList != null && agePlayersList.size() > 0) {
						System.out.println("There are "+agePlayersList.size()+" no of player/s with age "+age+" ....printing their details....");
						for(Player p:agePlayersList) {
							System.out.println(p);
						}
					}
				} catch (NumberFormatException e) {
					System.out.println("Age cannot have special chars or spaces or alphabets");
				}catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
	
				break;
			case 4:
				System.out.println("case 4 was selected");
				System.out.println("Thank you for your interest this option is still under construction");
	
				break;
			case 5:
				System.out.println("case 5 was selected");
				System.out.println("Enter TeamName to get all the players of that team");
				String teamname = sc.nextLine();
				try {
					List<Player> teamPlayersList = playerSearchService.getPlayersByTeamName(teamname);
					if(teamPlayersList != null && teamPlayersList.size() > 0) {
						System.out.println("There are "+teamPlayersList.size()+" no of player/s with team "+teamname+" ....printing their details....");
						for(Player p:teamPlayersList) {
							System.out.println(p);
						}
					}
				} catch (BusinessException e1) {
					System.out.println(e1.getMessage());
				}
				
				break;
			case 6:
				System.out.println("case 6 was selected");
				System.out.println("Thank you for your interest this option is still under construction");
	
				break;
			case 7:
				System.out.println("case 7 was selected");
				System.out.println("Thank you for your interest this option is still under construction");
	
				break;
			case 8:
				System.out.println("case 8 was selected ");
				System.out.println("Retrieving all the players from backend");
				try {
					List<Player> allPlayersList = playerSearchService.getAllPlayers();
					if(allPlayersList != null && allPlayersList.size() > 0) {
						System.out.println("There are "+allPlayersList.size()+" no of player/s....printing their details....");
						for(Player p:allPlayersList) {
							System.out.println(p);
			
						}
					}
				} catch (BusinessException e) {
					System.out.println(e.getMessage());
				}
	
				break;
			case 9: 
				System.out.println("case 9 was selected");
				System.out.println("Thank you for using our PlayerSearch App V1.0.... have a good one.... :)");
	
				break;

			default:
				System.out.println("Default case ...");
				System.out.println("Invalid menu option... Kindly Retry.......!");
				break;
			}
		} while (ch != 9);
	}

}
