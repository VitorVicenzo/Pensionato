package pensionato;

import java.util.Scanner;

import pensionato.Entities.Rooms;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        Rooms[] vect_Room = new Rooms[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            vect_Room[room] = new Rooms(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect_Room[i] != null) {
                System.out.println(vect_Room[i].getRoom() + ": " + vect_Room[i].getName() + ", " + vect_Room[i].getEmail());
            }
        }
    }
}