package ex_27072024;

public class Lab152 {

    public static void main(String[] args) {

        // Strings - immutable in nature
        // StringBuilder , StringBuffer - > mutable in nature
        String s1 = "PRAMOD";
        s1 = "Dutta";

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        // change the value of string - Buffer
        stringBuffer.append("Dutta"); //PramodDutta
        stringBuffer.append("JI"); //PramodDutta

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.append("Sharma");

        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)
        //String Builder is fast but not thread safe. By thread safe means its asynchronous.
        //String Buffer is slow as its thread safe or synchronised.
        //String Builder is generally used as its fast.

    }
}
