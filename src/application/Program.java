package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Book;
import entities.BookStatus;
import entities.Loan;
import entities.Member;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Book> books = new ArrayList<>();
		List<Member> members= new ArrayList<>();
		List<Loan> loans = new ArrayList<>();
		
		
		
		System.out.println("=== SHELFWISE LIBRARY SYSTEM ===");
		System.out.println("Welcome to the Central Library Management Console.");
		
		System.out.print("How many books do you wish to register?");
		int n =  sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <=n; i++){
			
			System.out.print("Enter book title:");
			String titles = sc.nextLine();
			System.out.print("Enter author name:");
			String nameAuthor = sc.nextLine();
			System.out.print("Enter ISBN(e.g., 978-0137081073): ");
			String isbn = sc.nextLine();
			System.out.println("Enter book status (AVAILABLE, RENTED): ");
			String status = sc.nextLine();
			Book book =	new Book(nameAuthor,  titles, isbn, BookStatus.valueOf(status));
			books .add(book);
		}
		
		
		
	
			System.out.println("How many members do you wish to register? :");
			int q = sc.nextInt();
			sc.nextLine();
			
			
			for(int j = 1; j <= q ; j++) {
			

			System.out.print("Enter reader's full name:");
			String nameMember = sc.nextLine();
			System.out.print("Enter registration number:: ");
			String rMember = sc.nextLine();
			System.out.println("Enter reader's email: ");
			String email = sc.nextLine();
			Member member =	new Member(nameMember,rMember, email);
			members .add(member);
			
		}
		
		
		System.out.println("How many loans do you wish to register?");
		int r =sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <=r; i++){
		
			    System.out.println("Enter the title of the book for the loan: ");
			    String bookTitle = sc.nextLine();
			    
			    Book foundBook = null;
			    for (Book b : books) {
			        if (b.getTitle().equalsIgnoreCase(bookTitle)) {
			            foundBook = b;
			            break;
			        }
			    }
			    
			    System.out.println("Enter the registration number of the member:");
			    String memberReg = sc.nextLine();
			    
			    Member foundMember = null;
			    for (Member m : members) {
			        if (m.getRegistrationNumber().equalsIgnoreCase(memberReg)) {
			            foundMember = m;
			            break;
			        }
			    }
			    
			    if (foundBook != null && foundMember != null) {
			        Loan loan = new Loan(foundBook, foundMember);
			        loans.add(loan);
			        System.out.println("Loan registered successfully!");
			    } else {
			        System.out.println("Book or member not found. Please check the data.");
			    }
			}
			for(Loan l : loans) {
				
				System.out.println(" Pickup date: " + l.getPickupDate()+ " Scheduled return: " + l.getScheduledReturn());
				
				
			}
			
			
	
		sc.close();
	}

}

