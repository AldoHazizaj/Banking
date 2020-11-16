package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank ("National Albania Bank");

        bank.addBrach("Tirana");

        bank.addCustomer("Tirana", "Aldo", 50.05);
        bank.addCustomer("Tirana", "Geri", 170.32);
        bank.addCustomer("Tirana", "Adem", 200.14);

        bank.addBrach("Durres");
        bank.addCustomer("Durres", "Toni", 500.31);

        bank.addCustomerTransaction("Tirana", "Aldo", 44.25);
        bank.addCustomerTransaction("Tirana", "Aldo", 12.44);
        bank.addCustomerTransaction("Tirana", "Geri", 1.65);

        bank.listCustomers("Tirana", true);
    }
}
