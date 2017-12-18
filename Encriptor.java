
public class Encriptor { 

       private int skipByLength = 3;
//     private String WORDS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
       private String WORDS = "abRZ123cijkDEFopwSTUVWXYxyzABCIJdefghKLMNOPQ4qrstuv567GHlmn890";

       private int maxLength = WORDS.length()-1;

      public String encryptString(String toEncryptStr){
              char[] ar = toEncryptStr.toCharArray();
              StringBuilder sb = new StringBuilder();
              for(char ch : ar){
                     sb.append( getEncriptedChar(ch) );
              }
              return sb.toString();
       }
     
       private char getEncriptedChar(char ch){
             int charIndex = WORDS.indexOf(ch);
             
             if(charIndex == -1){
                     return ch;
              }
         
              int retIndex = 0;

              if( charIndex > (maxLength - skipByLength) ){
                     retIndex = maxLength - charIndex;
              }else{
                     retIndex = charIndex + skipByLength;
              }
              return WORDS.charAt( retIndex );
       }
   
       public String decryptString(String toDecryptStr){
              char[] ar = toDecryptStr.toCharArray();
              StringBuilder sb = new StringBuilder();
              for(char ch : ar){
                  sb.append( getDecriptedChar(ch) );
             }
             return sb.toString();
       }
      
      private char getDecriptedChar(char ch){
             int charIndex = WORDS.indexOf(ch);

             if(charIndex == -1){
                    return ch;
              }
            
             int retIndex = 0;
             if( charIndex < skipByLength ){
                    retIndex = maxLength - charIndex;
              }else{
                     retIndex = charIndex - skipByLength;
              }
            return WORDS.charAt( retIndex );
       }


}

 
