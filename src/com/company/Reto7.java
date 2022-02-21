package com.company;


public class Reto7 extends Menu{
    Carretera carretera = new Carretera();

    public Reto7(){
        menu();
    }
    @Override
    public void menu() {
        while (!this.exit) {

            System.out.println("Ingrese el numero de vias que desea crear para la carretera:");

            try{
                this.nRegistros = Integer.parseInt(sc.next());
                if(this.nRegistros > 0){
                    for (int i = 0; i < this.nRegistros; i++) {
                        double[] iniciales = new double[2];
                        double[] finales = new double[2];


                        System.out.println("\nSeleccione el tipo de via que desea crear" +
                                "\n1. Via asfaltada" +
                                "\n2. Via sin asfaltar");

                        this.opcion = Integer.parseInt(sc.next());

                        switch (this.opcion){
                            case 1:
                                System.out.println("\n Ingrese la coordenada en x donde inicia el tramo de la via");
                                iniciales[0] = Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese la coordenada en y donde inicia el tramo de la via");
                                iniciales[1] = Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese la coordenada en x donde finaliza el tramo de la via");
                                finales[0] =  Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese la coordenada en y donde finaliza el tramo de la via");
                                finales[1] =  Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese el nombre del proveedor del asfalto ");
                                String proveedor = sc.next();
                                System.out.println("\n Ingrese la velocidad maxima de la via");
                                int velMax = Integer.parseInt(sc.next());
                                System.out.println("\n Se puede adelantar en esta via ?  Escriba 1 para si y 0 para no");
                                this.opcion = Integer.parseInt(sc.next());

                                switch (this.opcion) {
                                    case 1:
                                        carretera.setCamino(new Asfalto(iniciales,finales,proveedor,velMax,true));
                                        break;
                                    case 0:
                                        carretera.setCamino(new Asfalto(iniciales,finales,proveedor,velMax,false));
                                        break;
                                    default:
                                        System.out.print("Opcion no valida!\n\n");
                                        return;
                                }

                                break;
                            case 2:
                                System.out.println("\n Ingrese la coordenada en x donde inicia el tramo de la via");
                                iniciales[0] = Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese la coordenada en y donde inicia el tramo de la via");
                                iniciales[1] = Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese la coordenada en x donde finaliza el tramo de la via");
                                finales[0] =  Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese la coordenada en y donde finaliza el tramo de la via");
                                finales[1] =  Double.parseDouble(sc.next());
                                System.out.println("\n Ingrese el material del la via");
                                String material = sc.next();
                                System.out.println("\n Ingrese el espesor de la via ");
                                double espesor =Double.parseDouble(sc.next());
                                carretera.setCamino(new NoAsfalto(iniciales,finales,material,espesor));
                                break;
                            default:
                                System.out.print("Opcion no valida!\n\n");
                        }


                    }

                    System.out.println("La longitud total de la carretera es: "+ carretera.longitudTotal() +"\n");
                    System.out.println("El area total de la carretera es: "+ carretera.areaTotal() +"\n");
                    System.out.println("El volumen total de la carretera es: "+ carretera.volumenMaterial() +"\n");
                    System.out.println("El volumen total del asfalto es: "+ carretera.volumenAsfalto() +"\n");
                    System.out.println("El volumen total de las vias sin asfaltar en la carretera es: "+ carretera.volumenNoAsfalto() +"\n");
                    if (carretera.conexionCamino()){
                        System.out.println("Toda la carretera esta conectada");
                    }else{
                        System.out.println("Almenos una via esta desconectada");
                    }

                    this.exit = true;
                }else{
                    System.out.println("Inserte un numero mayor a 0. Por favor intente nuevamente\n\n");
                }


            }catch(NumberFormatException e){
                System.out.println("Inserte un numero valido. Por favor intente nuevamente");
            }
        }
    }
}
