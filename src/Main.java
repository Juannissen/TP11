public class Main {

    public static void main(String[] args) {
        // write your code here
        CuentaCorriente cuenta1=new CuentaCorriente
                ("Gonzalo",5000,(long)(Math.random()*100+1));
        CuentaCorriente cuenta2=new CuentaCorriente
                ("Fernando",4000,(long)(Math.random()*100+1));

        System.out.println("Antes de realizar la transferencia \n");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        cuenta1.transferencia(cuenta2,2500);
        System.out.println("\nDespues de realizar la transferencia\n");

        System.out.println(cuenta1.toString());

        System.out.println(cuenta2.toString());

    }

}