package Herencia.Polimosfirmo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    public VehiculoFurgoneta(String marca, String modelo, String matricula, int carga) {
        super(marca, modelo, matricula);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String mostInfo(){
        return "La marca es: "+marca+" el modelo es: "+modelo+" la matricula es: "+matricula+
                " la carga es: "+carga;
    }

}
