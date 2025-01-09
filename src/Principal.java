import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Herramientas operacion = new Herramientas();
        String Base_code ,target_code;
        System.out.println("###################################" );
        System.out.println("Binevenido a mi conversor de moneda" );
        System.out.println("###################################" );
        String menu = """
                1.Dolar => Peso argentino
                2.Peso argentino => Dolar
                3.Dolar => Real brasileño
                4.Real brasileño => Dolar
                5.Dolar => Boliviano
                6.Boliviano => Dolar
                7.Dolar => Peso chileno
                8.Peso chileno => Dolar
                9.Dolar => Peso colombiano
                10.Peso colombiano => Dolar
                11.Salir
                ################################################""";
        boolean estado =true;
        int opcionMenu =0;

        while (opcionMenu !=11){
            System.out.println(menu);
            try {

                opcionMenu = leer.nextInt();

                switch (opcionMenu) {
                    case 1:
                        Base_code ="USD";
                        target_code="ARS";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();
                        break;
                    case 2:
                        Base_code ="ARS";
                        target_code="USD";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 3:
                        Base_code ="USD";
                        target_code="BRL";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 4:
                        Base_code ="BRL";
                        target_code="USD";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 5:
                        Base_code ="USD";
                        target_code="BOB";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 6:
                        Base_code ="BOB";
                        target_code="USD";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 7:
                        Base_code ="USD";
                        target_code="CLP";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 8:
                        Base_code ="CLP";
                        target_code="USD";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 9:
                        Base_code ="USD";
                        target_code="COP";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;
                    case 10:
                        Base_code ="COP";
                        target_code="USD";
                        System.out.println(operacion.operacion(Base_code,target_code));
                        opcionMenu = operacion.salir();;
                        break;

                    default:
                        System.out.println("Opcion seleccionada no valida");
                }
            }catch (InputMismatchException e){
                System.out.println("Opcion no valida!!!");
                opcionMenu=11;
            }

        }
        System.out.println("Programa terminado ");





    }
}
