package com.company;
import java.util.*;

public abstract class Menu {

    protected boolean exit = false;
    protected int opcion;
    protected int nRegistros;
    protected Scanner sc = new Scanner(System.in);

    public abstract void menu();

}
