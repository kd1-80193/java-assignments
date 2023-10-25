package com.sunbeam;

import java.util.List;
import java.util.Scanner;

public class CandidateMain {
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------------------");
		System.out.println("0. Exit");
		System.out.println("1. Save Candidate");
		System.out.println("2. Update Candidate");
		System.out.println("3. get partywise total votes.");
		System.out.print("Enter Choice - ");
		int choice = sc.nextInt();
		System.out.println("----------------------------");
		return choice;
	}

	public static void main(String[] args) {
		Candidate c = new Candidate();
		Scanner sc = new Scanner(System.in);
//		try (CandidateDao dao = new CandidateDao()) {
//			System.out.println("Enter name ");
//			String name = sc.next();
//			System.out.println("Enter Party name ");
//			String party = sc.next();
//			System.out.println("Enter Votes ");
//			int votes = sc.nextInt();
//
//			int cnt = dao.saveCandidate(name, party, votes);
//			System.out.println("Candidate Added : " + cnt);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter name ");
					String name = sc.next();
					System.out.println("Enter Party name ");
					String party = sc.next();
					System.out.println("Enter Votes ");
					int votes = sc.nextInt();
					c.setName(name);
					c.setParty(party);
					c.setVotes(votes);
					// int cnt = dao.saveCandidate(new Candidate("pranav", "NCP", 50));
					int cnt = dao.saveCandidate(c);
					System.out.println("Candidate Added : " + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			case 2: {
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter Name ");
					String name = sc.next();
					System.out.println("Enter Party Name ");
					String party = sc.next();
					System.out.println("Enter Id to be Updated");
					int id = sc.nextInt();

					c.setName(name);
					c.setParty(party);
					c.setId(id);
					int cnt = dao.updateCandidate(c);
					System.out.println(" Candidate Updated :" + cnt);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
				break;
			case 3: {
				try (CandidateDao dao = new CandidateDao()) {
					List<PartyVotes> list = dao.getPartyWiseVoyes();
					list.forEach(s -> System.out.println(s));

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			}
		}

	}

}
