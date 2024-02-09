

abstract class forma {
    protected int numLados;

    // Constructor
    public forma(int numLados) {
        this.numLados = numLados;
    }


    public int getNumLados() {
        return numLados;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}


class Rectangulo extends forma implements Redimensionable, Comparable<Rectangulo> {
    private double ancho;
    private double alto;


    public Rectangulo(double ancho, double alto) {
        super(4);
        this.ancho = ancho;
        this.alto = alto;
    }


    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimeter() {
        return 2 * (ancho + alto);
    }

    @Override
    public void redimensionar(int x) {
        ancho *= x;
        alto *= x;
    }

    @Override
    public int compareTo(Rectangulo otroRectangulo) {
        return Double.compare(this.getArea(), otroRectangulo.getArea());
    }

    @Override
    public String toString() {
        return "Rectángulo [Ancho=" + ancho + ", Alto=" + alto + ", Área=" + getArea() + "]";
    }
}

class Triangulo extends forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        return (base * altura) / 2;
    }
    @Override
    public double getPerimeter() {
        return -1;
    }
}






