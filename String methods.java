
public class String_Methods {
    public static void main(String[] args) {
        String uni="Comsats";
        // lenght methode ,finds lenght of string

        int newStr=uni.length();
        System.out.println(newStr);
        //toLower methode
        String name="SAAD";
        String name2=name.toLowerCase();
        System.out.println(name2);

        //toUpper methode
        String university="comsats" ;
        String university2=university.toUpperCase();
        System.out.println(university2);

        //trim methode
        String lName="  khan   ";
        String lName2=lName.toUpperCase();  //removes the leading and trailing spaces from string
        System.out.println(lName2);

        //substring methode
        String unii=university.substring(4);   //it will give the string at index 4
         System.out.println(unii);

        String university3=university.substring(0,6);  //it will give the string between th e given index
        System.out.println(university3);


        //replace methode
        String fruit ="mangoe";
        String fruit2=fruit.replace('e','o');   //it replaces 'o' with 'e'
        System.out.println(fruit2);

        //startsWith()
        String country="pakistan";
        System.out.println(country.startsWith("pa"));

        //endswith
        System.out.println(name.endsWith("an"));

        //charAt()
        System.out.println(country.charAt(3));

        //indexOf
        System.out.println(country.indexOf("n"));

        System.out.println(country.indexOf("a",3));

        //lastIndexOf
        System.out.println(country.lastIndexOf("a"));

        System.out.println((country.lastIndexOf("a",4)));

        //equal()
        boolean con=country.equals("pakistan");
        System.out.println(con);

        //equalsIgnoreCase
        boolean con2=country.equalsIgnoreCase("PaKisTan");  //ignores upper or lowercase
        System.out.println(con2);

    }
}

