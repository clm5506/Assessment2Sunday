package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2+string1;
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        int length = string.length();
        String ans = "";
        int counter = 0;

        while(counter < length){
            ans += " ";
            counter++;
        }
        return ans;
    }

    public String loudAndClear(String string) {

        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String answer = "";
       char[] charArray = string.toCharArray();


        for(int i = 0; i < string.length(); i++){
            if(Character.isLowerCase(charArray[i])){
                answer += Character.toUpperCase(charArray[i]);
            } else if(Character.isUpperCase(charArray[i])){
                answer += Character.toLowerCase(charArray[i]);
            } else{
                answer += charArray[i];
            }
        }
        return answer;
    }

    public String oneAtATime(String string1, String string2) {
        String[] string1Array = string1.split("");
        String[] string2Array = string2.split("");

        int length = string1.length() + string2.length();
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < length-1; i++){
           if(string1Array.length > i){
               answer.append(string1Array[i]);
           }if (string2Array.length > i){
               answer.append(string2Array[i]);
           }

        }
        return answer.toString();
    }
}
