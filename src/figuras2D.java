public class figuras2D {

    private int n_lados; //numero de lados
    public float lados; //longitud del lado

    //Setter y Getter
    public int getN_lados() {
        return n_lados;
    }

    public void setN_lados(int n_lados) {
        this.n_lados = n_lados;
    }

    //Constructor
    public figuras2D(int n_lados, float lados) {
        this.n_lados = n_lados;
        this.lados = lados;
    }


    public float areaCuadrado(int lados){
        return this.lados;
    };
    private float perimetroCuadrado(){
        return 0;
    };
    public float areaTriangulo(){
        return 0;
    };
    private float perimetroTriangulo(){
        return 0;
    };
}
