import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class functioneo {
    public static void main(String[] args) {
        Function<String,Integer> fufu=num->num.length();
        System.out.println(fufu.apply("Programacion"));

        System.out.println("-----------------------------");

        Function<Integer,Integer> paella=integer -> (int) Math.pow(integer,2);
        System.out.println(paella.apply(4));

        System.out.println("------------------------");

        Function<String,Integer> combo= fufu.andThen(paella);
        System.out.println(combo.apply("Programacion"));

        System.out.println("--------------------------");

        BiFunction<Integer,Integer,Integer> suma=(x,y)->x+y;
        System.out.println(suma.apply(8,7));

        System.out.println("--------------------------");

        BiFunction<Integer,Integer,Double> paella2=(a,b) -> Math.pow(a,b);
        System.out.println(paella2.apply(4,8));

        System.out.println("----------------------------");

        Function<Double,String> raro= string -> "Resultado: "+ string;
        System.out.println(raro.apply(3.14));

        System.out.println("-------------------------");

        BiFunction wombo=paella2.andThen(raro);
        System.out.println(wombo.apply(2,4));

        System.out.println("-----------------------");

        solido(2,4);

        System.out.println("-----------------------");

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

        System.out.println("-------------------------");

        BiFunction<String,String,String> pep=(t,z)-> String.valueOf(t.startsWith(z));
        System.out.println(pep.apply("Sepia","p"));

        System.out.println("----------------------");

        List<String> listeo2=new ArrayList<>();
        for (int i=0;i<=4;i++){
            listeo.add("Sapo");
        }


    }

    public static void solido(int a,int b){
        int pow=(int) Math.pow(a,b);
        System.out.println("Resultado: "+pow);
    }
}
