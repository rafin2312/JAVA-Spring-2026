import java.util.HashSet;

public class HashSetTask {
     HashSet<String>countries = new HashSet<>();
     public HashSetTask() {
         countries.add("USA");
         countries.add("Canada");
         countries.add("France");
         countries.add("Japan");
         countries.add("Australia");
     }
     public void show(){
         System.out.println("Country names: ");
         for (String country : countries) {
             System.out.println(country);
         }
     }
}
