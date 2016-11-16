import java.util.*;
import java.*;

public class country {
    
  

   public static void main(String[] args) {
          Map<String, Locale> localeMap;
    String[] countries = Locale.getISOCountries();
    localeMap = new HashMap<String, Locale>(countries.length);
    for (String country : countries) {
        Locale locale = new Locale("en",country);
        localeMap.put(locale.getISO3Country().toUpperCase(), locale);
    
    
     System.out.print(locale.getISO3Country()+" ---- ");
       
        System.out.println(locale.getDisplayCountry());
 }}
 
  
      }
