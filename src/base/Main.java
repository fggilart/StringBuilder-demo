package base;

public class Main {

    public static void main(String[] args) {
        
        imprimeBucle(10000);
        imprimeBucle2(10000);
        
    }
    
    static void imprimeBucle(int n){
        long tiempoInicio;
        long tiempoFin;
        long tiempoDuracion;
        tiempoInicio = System.currentTimeMillis();
        String text = "";
        for (int i = 1; i <= n; i++) {
            text += "Objeto " + i + "\n";
        }
        //System.out.println(text);
        tiempoFin = System.currentTimeMillis();
        tiempoDuracion = tiempoFin - tiempoInicio;
        System.out.println("String:");
        System.out.println("tiempo en ms: " + tiempoDuracion);
        
    }
    
  
    
    static void imprimeBucle2(int n){
        
        long tiempoInicio;
        long tiempoFinal;
        
        tiempoInicio = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        String text = "Objeto ";
        for (int i = 1; i <= n; i++) {
            stringBuilder.append(text);
            stringBuilder.append(i);
            stringBuilder.append("\n");
        }
        
        //System.out.println(stringBuilder);
        
        tiempoFinal = System.currentTimeMillis();
        System.out.println("\nStringBuilder:");
        System.out.println("tiempo en ms: " + (tiempoFinal-tiempoInicio));
        
    }

}
