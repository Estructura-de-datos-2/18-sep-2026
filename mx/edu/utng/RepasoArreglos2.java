package mx.edu.utng;
public class RepasoArreglos2 {

    public static void main(String[] args) {

        System.out.println("Manejo de arreglos");

	String[] nombres[] = new String[7][3];
                nombres[0][0] = "Jonathan Venancion";
		nombres[0][1] = "Aguilar Hernandez";
		nombres[0][2] = "18";
		
		nombres[1][0] = "Jose Emmanuel";
                nombres[1][1] = "Arredondo Escalante";
                nombres[1][2] = "22";

		nombres[2][0] = "Yaneli";
                nombres[2][1] = "Sanchez Cardenas";
                nombres[2][2] = "19";  
		System.out.println("nombres: \n");
		for (int i = 0; i < nombres.length; i++) {
    		System.out.println(nombres[i][0]);
		}	
		

		System.out.println("apellidos: \n");
		for (int i = 0; i < nombres.length; i++) {
                System.out.println(nombres[i][1]);
                }

    }
}






