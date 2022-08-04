package MovieTicket;

import java.util.LinkedList;
import java.util.Scanner;

public class MovieTicketBookingSimulator {

	public static void main(String[] args) {
		int price=100;
		System.out.println("are you admin or user?");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b="admin";
		String c="user";
		String oldpassword="123admin";
		LinkedList<Integer> A = new LinkedList<Integer>();
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(0);
		LinkedList<Integer> B=new LinkedList<Integer>();
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		B.add(0);
		LinkedList<Integer> C=new LinkedList<Integer>();
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		C.add(0);
		LinkedList<Integer> D=new LinkedList<Integer>();
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		D.add(0);
		LinkedList<Integer> E=new LinkedList<Integer>();
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		E.add(0);
		LinkedList<Integer> F=new LinkedList<Integer>();
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		F.add(0);
		
		
		if(a.equals(b)) {
			System.out.println("do you want to change your password (y or n)?");
			char d=sc.next().charAt(0);
			if (d=='y') {
				System.out.println("enter the old password");
				String e=sc.next();
				if(e.equals(oldpassword)) {
					System.out.println("enter new password");
					String f=sc.next();
					oldpassword=f;
					System.out.println("password has been changed you may restart the app");
				}
				else {
					System.out.println("wrong password restart app and try again");
				}
				
			}
			else if(d=='n') {
				System.out.println("password not changed");
				
			}
			else {
				System.out.println("wrong input..... restart the process");
			}
			
		}
		else if (a.equals(c)) {
			System.out.println("select the show time 1:(9-11) 2:(3-5) choose 1 or 2");
			String g=sc.next();
			String y="1";
			String w="2";
			if (g.equals(y)) {
				int k=4;
				int noofbooked=0;
				do{
					System.out.println("which row do you want (A-F)?");
					char h=sc.next().charAt(0);
					if(h=='A') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(A.get(l-1)==0) {
								A.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(A.get(l-1)==1) {
								System.out.println("ticket already booked choose other seat");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='B') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(B.get(l-1)==0) {
								B.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(B.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='C') {
						System.out.println("Select the number of seats you want(1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(C.get(l-1)==0) {
								C.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(C.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='D') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(D.get(l-1)==0) {
								D.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(D.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='E') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(E.get(l-1)==0) {
								E.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(E.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='F') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(F.get(l-1)==0) {
								F.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(F.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					
					System.out.println("Do you want to book another seat? (Yes or No)");
					String x=sc.next();
					String z="No";
					if (x.equals(z)) {
						k=k-1;
						int total=noofbooked*price;
						System.out.println("total price is" + total);
					}
					
					
					
				}
				while(k==4);	
			}
			if(g.equals(w)){
				int k=4;
				int noofbooked=0;
				do{
					System.out.println("which row do you want (A-F)?");
					char h=sc.next().charAt(0);
					if(h=='A') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(A.get(l-1)==0) {
								A.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(A.get(l-1)==1) {
								System.out.println("ticket already booked choose other seat");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='B') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(B.get(l-1)==0) {
								B.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(B.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='C') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(C.get(l-1)==0) {
								C.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(C.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='D') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(D.get(l-1)==0) {
								D.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(D.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='E') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(E.get(l-1)==0) {
								E.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(E.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					if(h=='F') {
						System.out.println("Select the number of seats you want (1-10)");
						int nof=sc.nextInt();
						for(int i=0;i<nof;i++) {
							System.out.println("enter seat preference:(1-10)");
							int l=sc.nextInt();
							if(F.get(l-1)==0) {
								F.set(l-1,1);
								System.out.println("ticket booked");
								noofbooked+=1;
							}
							else if(F.get(l-1)==1) {
								System.out.println("ticket already booked");
							}
							else {
								System.out.println("Invalid choice");
							}
						}
					}
					
					System.out.println("Do you want to book another seat? (Yes or No)");
					String x=sc.next();
					String z="No";
					if (x.equals(z)) {
						k=k-1;
						int total=noofbooked*price;
						System.out.println("total price is" + total);
					}
					
					
					
				}
				while(k==4);	
			}
			
			
			
		}
		else {
			System.out.println("invalid input restart app");
		}
		// TODO Auto-generated method stub

	}

} 
