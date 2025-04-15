import java.time.LocalDate;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ejerciciosVarios {
    public static void main(String[] args) {
        //1
        Consumer<String> cunsum= xd -> System.out.println(xd);
        cunsum.accept("Estoy en clase de programacion");

        //2
        System.out.println("--------Lista enteros---------");
        List<Integer> numos=new ArrayList<>();
        Consumer<Integer> paco=xd-> System.out.print(xd+" ");
        for (int i=1;i<=10;i++){
            numos.add(i);
        }
        numos.forEach(paco);
        System.out.println();

        //3
        System.out.println("--------Ultima letra------");
        List<String> ult=new ArrayList<>();

        Consumer<String> con=dl-> System.out.println(dl.charAt(dl.length()-1));
        ult.add("sepia");
        ult.add("camion");
        ult.add("niño");
        ult.add("delta");
        ult.add("havoc");
        ult.add("hadonfield");
        ult.forEach(con);
        System.out.println();

        //7,8
        System.out.println("--------Multiplicacion----------");
        BiConsumer<Integer,Integer> multi=(a,b)-> System.out.println(a*b);
        multi.accept(-9,7);
        System.out.println("--------Division----------");
        BiConsumer<Integer,Integer> divi=(a,b)-> System.out.println(a/b);
        divi.accept(-9,7);
        System.out.println("--------Suma----------");
        BiConsumer<Integer,Integer> suma=(a,b)-> System.out.println(a+b);
        suma.accept(-9,7);
        System.out.println("--------Resta----------");
        BiConsumer<Integer,Integer> resta=(a,b)-> System.out.println(a-b);
        resta.accept(-9,7);

        //9
        calculator(-9,7,suma);
        calculator(-9,7,resta);
        calculator(-9,7,multi);
        calculator(-9,7,divi);
        //10
        System.out.println("--------------Listeo----------");
        Map<Integer,String> mapeo=new LinkedHashMap<>();
        BiConsumer<Integer,String> nombre2= (n,s)-> System.out.println(n+" "+s);
        mapeo.put(1,"uno");
        mapeo.put(7,"siete");
        mapeo.put(2,"dos");
        mapeo.put(3,"tres");
        mapeo.put(5,"cinco");
        mapeo.forEach(nombre2);
        //4
        System.out.println("-------------java----------");
        Supplier<String> ramon=() -> "Java es un lenguaje de programacion";
        System.out.println(ramon.get());
        //5
        System.out.println("----------numero--------");
        Supplier<Double> xd=()-> Math.random();
        System.out.println(xd.get());

        //11
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        //12
        Programador p=new Programador("Paco",1233,LocalDate.now());
        Consumer<Programador> p3=(a)-> System.out.println(a);
        p3.accept(p);
    }

    public static void calculator(int a ,int b,BiConsumer<Integer,Integer> op){
        op.accept(a,b);
    }
}
