package com.company;

public class Reto8 extends Menu{


    public Reto8(){
        menu();
    }

    @Override
    public void menu() {
        while (!this.exit) {
            System.out.print("\nMenu \n Seleccione el reto al que desea ingresar \n " +
                    "1. Reto 6 \n " +
                    "2. Reto 7 \n " +
                    "3. Salir \n");
            System.out.print("Ingrese una opcion: ");
            try {
                this.opcion = Integer.parseInt(this.sc.next());
                switch (this.opcion) {
                    case 1:
                        new Reto6();
                        break;
                    case 2:
                        new Reto7();
                        break;
                    case 3:
                        System.out.print("Hasta luego!");
                        this.exit = true;
                        break;
                    default:
                        System.out.print("Opcion no valida!\n\n");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Inserte un numero valido. Por favor intente nuevamente");
            }
        }

    }


    private boolean validate(String input) {
        return input.matches("[0-9]{1,13}(\\.[0-9]*)?");
    }
}
