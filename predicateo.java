import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicateo implements Predicate<Integer> {

    @Override
    public boolean test(Integer integer) {
        if (integer>100){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {
        //j
        Predicate<Integer> num= a -> a>100;
        System.out.println(num.test(56));

        //a
        Predicate<Integer> mayor100= i -> i>100;
        System.out.println(mayor100.test(10));
        //b
        System.out.println("----------------------");
        Predicate<Integer> menor300=i -> i<300;
        Predicate<Integer> entre100300=mayor100.and(menor300);
        System.out.println(entre100300.test(23));
        //c
        System.out.println("--------------------");
        Predicate<Integer> menor50=i -> i<50;
        Predicate<Integer> mayor100omenor50=mayor100.or(menor50);
        System.out.println(mayor100omenor50.test(700));
        //d
        System.out.println("--------------------------");
        Predicate<Integer> noigual100=i->i!=100;
        System.out.println(noigual100.test(100));
        //e
        System.out.println("----------------------");
        Predicate<String> paco=p-> p.equalsIgnoreCase("paco");
        System.out.println(paco.test("pacos"));
        //f
        System.out.println("-------------------");
        List<Integer> numu=new ArrayList<>();
        int cont=0;
        for (int j=0;j<=10;j++){
            cont=cont+3;
            numu.add(cont);
        }
        Predicate<Integer> mayor25=i->i>25;
        Predicate<Integer> menor30=i->i<30;
        Predicate<Integer> entre25y30=mayor25.and(menor30);
        numu.forEach((n)-> System.out.println(entre25y30.test(n)));
        //g
        System.out.println("------------------------------");
        List<Integer> num2=new ArrayList<>();
        int cont2=0;
        for (int j=0;j<=11;j++){
            cont2=cont2+2;
            num2.add(cont2);
        }

        Predicate<Integer> igual22=i->i==22;
        num2.forEach((m)-> System.out.println(igual22.test(m)));
        //h
        System.out.println("-----------------------------");
        List<String> cadeneo=new ArrayList<>();
        for (int i=1;i<=6;i++){
            cadeneo.add("pspies");
        }
        Predicate<String> empiezeporA=i->i.startsWith("A");
        Predicate<String> long5=i->i.length()==5;
        Predicate<String> comprov=empiezeporA.or(long5);
        cadeneo.forEach((m)-> System.out.println(comprov.test(m)));
        System.out.println("-----------------------");
        //i
        Predicate<String> noP=p->!p.startsWith("p");
        cadeneo.forEach((m)-> System.out.println(noP.test(m)));
    }
}
