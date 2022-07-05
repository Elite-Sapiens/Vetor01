package com.elitesapiens;

import com.elitesapiens.model.Aluguel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many rooms will be rented?: ");
        int n = scanner.nextInt();

        Aluguel[] vectors = new Aluguel[10];

        for (int i = 1; i <=n; i++) {
            System.out.print("Rent #" + i + ": ");
            System.out.print("\nNome: ");
            String nome = scanner.nextLine();
            System.out.print("\nEmail: ");
            String email = scanner.nextLine();
            System.out.print("\nRoom: ");
            int rm = scanner.nextInt();
            System.out.print("\n");

            vectors[rm] = new Aluguel(nome, email);

        }



        scanner.close();

    }
}