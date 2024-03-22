public class Main {
    public static void main(String[] args){

        comparePhrases();

        findNumb();;

    }
    public static void comparePhrases(){
        StringBuilder str1 = new StringBuilder();
        str1.append("Hello, my name is Ana");
        StringBuilder str2 = new StringBuilder();
        str2.append("Nice to meet you");
        if (str1.compareTo(str2) == 0){
            StringBuilder str3 = new StringBuilder("Risultato confronto: ");
            StringBuilder str4 = new StringBuilder("Le due stringhe sono uguali");
            System.out.println( str3.append(str4));
        }
        else {
            StringBuilder str5 = new StringBuilder("Risultato confronto: ");
            StringBuilder str6 = new StringBuilder("Le due stringhe sono differenti");
            System.out.println( str5.append(str6));
        }

    }

    public static void findNumb(){
        StringBuilder str = new StringBuilder("Hello");
        int result = str.codePointAt(4);
        StringBuilder str2 = new StringBuilder("Il carattere in unicode n° 4 è ");
        System.out.println(str2.append(result));
    }
}