package com.rakuten.StudentApp.Practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.Collectors;




class Customer
{
      int amount=1000;
    synchronized void withdraw(int amount)
    {
        System.out.println("++++++++++++.....going to withdrwa Amount.......+++++");
        if(this.amount<amount)
        {
            System.out.println(" Less balance ---Waite For Deposite");
        }
        try{
            wait();
        }catch (Exception e){}
        this.amount=this.amount-amount;
        System.out.println("Amount Successfully WithDraw  : Balance"+this.amount);
    }
    synchronized void deposite(int amount)
    {
        System.out.println("++++++++++++++++--------Going To Deopiste Amount------------++++++++");
        this.amount+=amount;
        System.out.println(" Amount  Deposite SuccessFully :"+this.amount);
        notify();

    }
}
interface  Functional1{
    void add1(int a1,int a2);
}

public class Test11Nov  {
//    @Override
//    public void run() {
//        System.out.println("Thread is good ");
//       final Customer customer = new Customer();
//        customer.withdraw(11000);
//        customer.deposite(1200);
//
//    }

    public static void main(String[] args) {

//        Functional1 s = (a,b)->{
//            System.out.println(a+b);
//        };
//        s.add1(4,5);
//       new Thread(()-> System.out.println("My first thread")).start();
//
//       Runnable r = ()->{
//           System.out.println("My 2nd Interface");
//       };
//       new Thread(r).start();

//        List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
//        Predicate<String> nameStartsWithS = str -> str.startsWith("S");
//        names.stream().filter(nameStartsWithS).forEach(System.out::println);
//        // Functional<Integer,Integer> a = (a,b)-> {  return a+b };
//
//
//        List<String> namesList = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
//        Function<String, Integer> nameMappingFunction = String::length;
//        List<Integer> nameLength = namesList.stream().map(nameMappingFunction).collect(Collectors.toList());
//        System.out.println(nameLength);
//
//
//
//
//
//        Supplier<String[]> b1 = () -> {  return new String[]{"Mumbai","Delhi","Goa","Pune"}; };
//        Arrays.asList(b1.get()).forEach(System.out::println);




        // namesList.stream().forEachOrdered(b1);
//        Supplier<String[]> citySupplier = () -> {
//            return new String[]{"Mumbai", "Delhi", "Goa", "Pune"};
//        };
//        Arrays.asList(citySupplier.get()).forEach(System.out::println);
//
//        Consumer<String> consumer = (s)->{
//            System.out.println("This Is Inside Consumer"+s);
//        };
//        consumer.accept("our COnsumer");
//
//
//
//        BiConsumer<String,String>  biConsumer = (b11,b2)->{
//            System.out.println(" Both values B1"+b11+" B2"+b2);
//        };
//        biConsumer.accept("first","second");
//
//       List<String> ans= namesList.stream().filter(s->s.equals("Smith")).collect(Collectors.toList());
//       String ans11 = namesList.stream().filter(s->s.equals("Smith")).findAny().get();
//        System.out.println(ans11);
//
//       String str =  namesList.stream().map(s->s+"good").findAny().get();
//       System.out.println(str);

//      Integer value = Arrays.asList(1,3,5,6,7).stream().reduce(0,(a,b)->a+b);
//      System.out.println(value);
//
//      Integer ans2 = Arrays.asList("radheShyam","ereghjeh","Shiya","Ganesh","Ram").stream().map(s -> s.length()).reduce(0,(s,s1)->s+s1);
//        System.out.println(ans2);
//
//    String str = Arrays.asList("radheShyam","ereghjeh","Shiya","Ganesh","Ramhsffshdhsfsfhdsiuhhsfdsfshfsihdfids").stream().reduce((s1, s2)-> s1.length() > s2.length() ? s1 : s2).get();
 //   System.out.println(str);
   List<String> he =  Arrays.asList("Rag","Asunil","Zmanoj");
    he.sort(new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    });
   System.out.println(he);

   List<String> str = Arrays.asList("Radhe","Mohan","Shyam").stream().sorted().collect(Collectors.toList());
   System.out.println(str);



    }




}














//        final Customer c=new Customer();
//        new Thread(){
//            public void run(){c.withdraw(500);}
//        }.start();
//        new Thread(){
//            public void run(){c.deposite(100);}
//        }.start();
//        new Thread(){
//            public void run(){c.deposite(10);}
//        }.start();
//        new Thread(){
//            public void run(){c.withdraw(200);}
//        }.start();







//        String filter = "{name: \"John\", age: 30, city: \"New York\"}";
//        JSONObject jsonpObject = new JSONObject(filter);
//        String value1=jsonpObject.getString("name");
//        System.out.println("Inside getMap Method :"+filter+"value  :"+value1);
//     Thread thread = new Thread("My first Thread in Java");
// Thread thread = new Thread();
//  Thread thread1 = new Thread();
// System.out.println("Thread in Java  :"+thread.getName());
//   thread.start();
// thread1.start();

