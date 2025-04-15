import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class functioneo {
    public static void main(String[] args) {
        //1
        Function<String,Integer> fufu=num->num.length();
        System.out.println(fufu.apply("Programacion"));

        System.out.println("-----------------------------");
        //2
        Function<Integer,Integer> paella=integer -> (int) Math.pow(integer,2);
        System.out.println(paella.apply(4));

        System.out.println("------------------------");
        //3
        Function<String,Integer> combo= fufu.andThen(paella);
        System.out.println(combo.apply("Programacion"));

        System.out.println("--------------------------");
        //4

        List<String> textos = Arrays.asList("Calvo", "Sepia", "Canserbero", "Astaroth");
        Map<String, Integer> mapa = convertirListaEnMap(textos, String::length);
        mapa.forEach((clave, valor) -> System.out.println(clave + " " + valor));

        System.out.print("----------------------------");
        //5
        BiFunction<Integer,Integer,Integer> suma=(x,y)->x+y;
        System.out.println(suma.apply(8,7));

        System.out.println("--------------------------");
        //6
        BiFunction<Integer,Integer,Double> paella2=(a,b) -> Math.pow(a,b);
        System.out.println(paella2.apply(4,8));

        System.out.println("----------------------------");
        //7
        Function<Double,String> raro= string -> "Resultado: "+ string;
        System.out.println(raro.apply(3.14));

        System.out.println("-------------------------");
        //8
        BiFunction wombo=paella2.andThen(raro);
        System.out.println(wombo.apply(2,4));

        System.out.println("-----------------------");
        //9
        solido();

        System.out.println("-----------------------");
        //11
        List<String> listeo=new ArrayList<>();
        for (int i=0;i<=4;i++){
            listeo.add("Sapo");
        }
        BiFunction<String ,Integer,String> xd=(num,cad)->
        {
            for (String nu:listeo){
                if (nu.length()>cad){
                    System.out.println(nu);
                } else {
                    System.out.println("null");
                }
            }
            return "";
        };
        System.out.println(xd.apply("PacoPepe",8));
        //12
        System.out.println("-------------------------");

        BiFunction<String,String,String> pep=(t,z)-> String.valueOf(t.startsWith(z));
        System.out.println(pep.apply("Sepia","p"));


    }

    public static void solido(){
        BiFunction<Integer,Integer,Double> paella2=(a,b) -> Math.pow(a,b);
        Function<Double,String> raro= string -> "Resultado: "+ string;
        BiFunction wombo=paella2.andThen(raro);
        System.out.println(wombo.apply(2,4));
    }

    public static Map<String, Integer> convertirListaEnMap(List<String> lista, Function<String, Integer> funcion) {
        Map<String, Integer> mapa = new HashMap<>();
        for (String elemento : lista) {
            mapa.put(elemento, funcion.apply(elemento));
        }
        return mapa;
    }
}
