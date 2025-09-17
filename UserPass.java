import java.util.Scanner;
public class UserPass {
    public static final String ANSI_RED = "\u001B[31m"; //quiero llamar al color rojo para señalar error
    public static final String ANSI_GREEN = "\u001B[32m";//quiero llamar al color verde para señalar acierto

      public static void main(String[] args) {

      String UsuarioR = "Profe"; //1. Definir usuario correcto "Profe"
      String PasswordR = "1234";   // 2. Definir contraseña correcta "1234"
              
      Scanner sc = new Scanner(System.in); //activo posibilidad leer datos
          System.out.println("Ingrese su usuario:");//3. Solicitar usuario
          String UsuarioI = sc.nextLine(); //    4. Escanear usuario ingresado
          System.out.println("Ingrese su contraseña:");// 5. Solicitar contraseña
          String PasswordI = sc.nextLine(); //  6. Escanear contraseña ingresada
          sc.close();
          
          if (UsuarioI.equals(UsuarioR) && PasswordI.equals(PasswordR)) {//7. Comparar si usuario y contraseña coinciden
              System.out.println(ANSI_GREEN +"Acceso exitoso"); //8. Si coinciden, mensaje  "Acceso exitoso"
          }  else {
              System.out.println(ANSI_RED +"Usuario o contraseña incorrectos");
          } // 9. Si no coinciden, mensaje: "Usuario o contraseña incorrectos".  
        
      }
    
}
