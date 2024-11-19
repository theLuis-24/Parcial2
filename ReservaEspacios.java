import java.util.ArrayList;

 class espacioRecreacional {
        private String nombre;
        private String tipo; 
        private int capacidad;
        private ArrayList<String> horariosDisponibles;

        public boolean reservar(String horario) {
            if (horariosDisponibles.contains(horario)) {
                horariosDisponibles.remove(horario);
                System.out.println("El horario " + horario + " se ha reservado.");
                return true;
            } else {
                System.out.println("Ese horario " + horario + " no está disponible.");
                return false;
            }
        }

        public void mostrarDisponibilidad() {
            if (horariosDisponibles.isEmpty()) {
                System.out.println("No hay horarios disponibles para este espacio.");
            } else {
                System.out.println("Horarios disponibles para " + nombre + ":");
                for (String horario : horariosDisponibles) {
                    System.out.println("- " + horario);
                }
            }
        }

        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public String getTipo() {
            return tipo;
        }
    
        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    
        public int getCapacidad() {
            return capacidad;
        }
    
        public void setCapacidad(int capacidad) {
            this.capacidad = capacidad;
        }
    
        public ArrayList<String> getHorariosDisponibles() {
            return horariosDisponibles;
        }
    
        public void setHorariosDisponibles(ArrayList<String> horariosDisponibles) {
            this.horariosDisponibles = horariosDisponibles;
        }

        //Constructor 
        public  espacioRecreacional(String nombre, String tipo, int capacidad, ArrayList<String> horarios) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.capacidad = capacidad;
            this.horariosDisponibles = new ArrayList<>(horarios);

        }
}


class Estudiante {
    private String nombre;
    private String ID;

    public Estudiante(String nombre, String ID) {
        this.nombre = nombre;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public String getID() {
        return ID;
    }

    public String reservarEspacio(espacioRecreacional espacio, String horario){
      return "e";
    }
}

class GestionRecreacional{


}

public class ReservaEspacios {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido al sistema de reservas de la universidad, que espacio desea reservar?");
        System.out.println("1: la cancha");
        System.out.println("2: la sala de juegos");

        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("10:00 AM - 11:00 AM");
        horarios.add("11:00 AM - 12:00 PM");
        horarios.add("02:00 PM - 03:00 PM");

        espacioRecreacional cancha = new espacioRecreacional("Cancha de Fútbol", "cancha", 20, horarios);

        cancha.mostrarDisponibilidad();

        cancha.reservar("11:00 AM - 12:00 PM");

        cancha.reservar("11:00 AM - 12:00 PM");

        cancha.mostrarDisponibilidad();
    }

}

