public class CaesarCipher {
    public static void main(String[] args) {
        System.out.println(encrypt("PaSsworD-@aBc",2));
    }

    public static String encrypt(String password, int shift){
        String encryptedPw= "";
        char c;
        int cAscii;
        int newAscii;
        //Shift each character by "shift" and add it to the encrypted password
        for(int i=0; i<password.length(); i++){
            c = password.charAt(i); //character extracted at index i of the password
            cAscii = c; //ascii number of the character extracted at index i of the password

            if(cAscii>=65 && cAscii<=90){ //Upper case letter
               newAscii = (((cAscii+shift)-65)%26) +65;
              encryptedPw = encryptedPw+ (char)(newAscii);

            }else if(cAscii>=97 && cAscii<=122){ //Lower case letter
                newAscii = (((cAscii+shift)-97)%26) +97;
                encryptedPw = encryptedPw+ (char)(newAscii);

            }else{ //other symbols (not letter), just add it directly
                encryptedPw+=c;
            }

        }

        return encryptedPw;
    }

}
