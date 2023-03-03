public class Main {
    public static void main(String[] args) {

//CON EL METODO SUPER LLAMO A LOS METODOS O ATRIBUTOS DE LA CLASE PADRE PARA MOSTRARLOS Y LUEGO PODER CON UN SYSO PODER CAMBIAR LOS DATOS:D
//ABSTRACT ME OBLIGA A USAR LOS METODOS DE LA CLASE PADRE EN LAS CLASES HIJAS, ASI NO LOS UTILICE, O NO LES DE UN VALOR, TENGO QUE PONERLOS EN LA CLASE HIJA 
//
        MaquinaExpress maquinaExpress = new MaquinaExpress();
	System.out.println("Preparando su cafe express");
        maquinaExpress.molerCafe();
        maquinaExpress.hacerCafe();
	maquinaExpress.calentarCafe();

        System.out.println("----------------");

        MaquinaCapuchino maquinaCapuchino = new MaquinaCapuchino();
	System.out.println("Preparando su cafe capuchino");
        maquinaCapuchino.molerCafe();  
        maquinaCapuchino.hacerCafe();
	maquinaCapuchino.calentarCafe();
	
	System.out.println("----------------");

        TipoCapuchino tipoCapuchino = new TipoCapuchino(true);
        TipoExpress tipoExpress = new TipoExpress(false);
        System.out.println(tipoCapuchino);
        System.out.println(tipoExpress);
        System.out.println(tipoExpress.getTipoDeAgua());
	tipoCapuchino.setTipoDeLeche("Leche de almendaras");
 	System.out.println(tipoCapuchino);
	
        
        tipoExpress.setTipoDeAgua("del grifo");
        System.out.println(tipoExpress.getTipoDeAgua());
        tipoExpress.setConLeche(true);
        System.out.println(tipoExpress);


    }
}


