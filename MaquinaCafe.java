abstract class MaquinaCafe {


    void molerCafe() {
        System.out.println("Moliendo cafe");
    }

    abstract void hacerCafe();

    abstract void calentarCafe();

}


class MaquinaExpress extends MaquinaCafe {

    void molerCafe(){
	super.molerCafe();
	System.out.println("Moliendo cafe para la MaquinaExpress");
	}


    void hacerCafe() {
        System.out.println("Haciendo cafe");
    }

    @Override
    void calentarCafe() {
    
       System.out.println("Calentando cafe express");
     }
}


class MaquinaCapuchino extends MaquinaCafe {

    @Override //Sustituyendo datos
        // sobre escribir
    void molerCafe() {
        super.molerCafe();
        System.out.println("Moliendo cafe para la MaquinaCapuchino");
    }

    @Override
    void hacerCafe() {
        System.out.println("Haciendo cafe con leche");
    }

    @Override
    void calentarCafe() {
	  System.out.println("Calentando cafe capuchino");
    }

}

