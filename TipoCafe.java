
class TipoCafe {

    private boolean conLeche;

    TipoCafe(boolean conLeche) {
        this.conLeche = conLeche;
    }

    public boolean esConLeche() {
        return conLeche;
    }

    public void setConLeche(boolean conLeche) {
        this.conLeche = conLeche;
    }
}

class TipoCapuchino extends TipoCafe {

    private String tipoDeLeche= "Entera";

    TipoCapuchino(boolean conLeche) {
        super(conLeche);
    }


    @Override
    public String toString() {
        return "TipoCapuchino{" +
                "tipoDeLeche='" + tipoDeLeche + '\'' +
                ", conLeche=" + super.esConLeche() +
                '}';
    }

    public String getTipoSinLeche() {
        return tipoDeLeche;
    }

    public void setTipoDeLeche(String tipoDeLeche) {
        this.tipoDeLeche = tipoDeLeche;
    }
}


class TipoExpress extends TipoCafe {

    private String agua = "manantial";

    TipoExpress(boolean conLeche) {
        super(conLeche);
    }


    @Override
    public String toString() {
        return "TipoExpress{" +
                "tipoDeAgua='" + agua + '\'' +
                ", conLeche=" + super.esConLeche() +
                '}';
    }

    public String getTipoDeAgua() {
        return agua;
    }

    public void setTipoDeAgua(String tipoDeAgua) {
        this.agua = tipoDeAgua;
    }

    public void setConLeche(boolean conLeche){
        super.setConLeche(conLeche);
    }
    
}