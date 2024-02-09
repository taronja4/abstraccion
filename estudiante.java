

class estudiante implements Comparable<estudiante> {
    private String nombre;
    private int edad;
    private int altura;

    public estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(estudiante otroEstudiante) {

        int comparacionAltura = Integer.compare(otroEstudiante.altura, this.altura);
        if (comparacionAltura != 0) {
            return comparacionAltura;
        }

        return Integer.compare(this.edad, otroEstudiante.edad);
    }

    @Override
    public String toString() {
        return nombre + " - Altura: " + altura + " - Edad: " + edad;
    }
}

