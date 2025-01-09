import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Herramientas {
    private ConsultaMoneda consulta = new ConsultaMoneda();
    Scanner leer = new Scanner(System.in);

    public String operacion(String base_code,String target_code){

        double cont = consulta.buscarMoneda(base_code,target_code);
        System.out.println("Ingrese la cantidad de "+ base_code+" que desea convertir a "+target_code );
        try {
            double valorDeConversion = leer.nextDouble();
            double valorFinal= conversion(valorDeConversion,cont);
            String valorRedondeado = redondear(valorFinal);
            return "La conversion de " + valorDeConversion+" "+base_code+ " es " +valorRedondeado+" "+ target_code;
        }catch (InputMismatchException e){
            return "Valor ingresado no valido " +e;
        }


    }

    public double conversion(double origen, double destino){
        return origen * destino;
    }
    public int salir() {
        System.out.println("################################################" );
        System.out.println("Desea realizar otra conversion " );

        String opcion = leer.next();
        if (opcion.equals("si")) {
            return 0;
        } else{
            return 11;
        }

    }
    private static String redondear(double valorFinal) {
        DecimalFormat df = new DecimalFormat("0.00");  df.setRoundingMode(RoundingMode.HALF_UP);
        return df.format(valorFinal);
    }
}
