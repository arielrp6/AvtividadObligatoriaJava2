package codoacodo.actividadobligatoriajava2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        usuario.setNombre(sc.nextLine());
        
        System.out.println("Ingrese su apellido");
        usuario.setApellido(sc.nextLine());
        
        System.out.println("Ingrese su edad");
        usuario.setEdad(Integer.parseInt(sc.nextLine()));
        
        System.out.println("Ingrese su hobbie");
        usuario.setHobbie(sc.nextLine());
        
        System.out.println("Ingrese su editor de código preferido");
        usuario.setEditorCodigo(sc.nextLine());
        
        System.out.println("Ingrese su sistema operativo");
        usuario.setSistemaOperativo(sc.nextLine());
        
        
        System.out.println(usuario.toString());
    }

}
